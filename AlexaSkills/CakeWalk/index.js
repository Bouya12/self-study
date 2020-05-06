// This sample demonstrates handling intents from an Alexa skill using the Alexa Skills Kit SDK (v2).
// Please visit https://alexa.design/cookbook for additional examples on implementing slots, dialog management,
// session persistence, api calls, and more.
const Alexa = require('ask-sdk-core');
const persistenceAdapter = require('ask-sdk-s3-persistence-adapter');

const LaunchRequestHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'LaunchRequest';
    },
    handle(handlerInput) {
        const speakOutput = 'こんにちは、ケークウォークへようこそ。お誕生日を教えて下さい。';
        const repromptOutput = '私は二千十四年十一月六日に生まれました。あなたの誕生日はいつですか？';
        return handlerInput.responseBuilder
            .speak(speakOutput)
            .reprompt(repromptOutput)
            .getResponse();
    }
};
const HasBirthdayLaunchRequestHandler = {
    canHandle(handlerInput) {

        const attributesManager = handlerInput.attributesManager;
        const sessionAttributes = attributesManager.getSessionAttributes() || {};

        const year = sessionAttributes.hasOwnProperty('year') ? sessionAttributes.year : 0;
        const month = sessionAttributes.hasOwnProperty('month') ? sessionAttributes.month : 0;
        const day = sessionAttributes.hasOwnProperty('day') ? sessionAttributes.day : 0;

        return handlerInput.requestEnvelope.request.type === 'LaunchRequest' && year && month && day;

    },
    handle(handlerInput) {

        const attributesManager = handlerInput.attributesManager;
        const sessionAttributes = attributesManager.getSessionAttributes() || {};

        const year = sessionAttributes.hasOwnProperty('year') ? sessionAttributes.year : 0;
        const month = sessionAttributes.hasOwnProperty('month') ? sessionAttributes.month : 0;
        const day = sessionAttributes.hasOwnProperty('day') ? sessionAttributes.day : 0;

        // TODO:: 設定APIを使って現在の日付を取得し、ユーザーの誕生日までの日数を計算します
        // TODO:: ユーザーの誕生日当日におめでとうと言います

        const speakOutput = `おかえりなさい。Y歳の誕生日まであとX日です。`;

        return handlerInput.responseBuilder
            .speak(speakOutput)
            .getResponse();
    }
};
const CaptureBirthdayIntentHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'IntentRequest'
            && Alexa.getIntentName(handlerInput.requestEnvelope) === 'CaptureBirthdayIntent';
    },
    async handle(handlerInput) {
        const year = Alexa.getSlotValue(handlerInput.requestEnvelope, 'year');
        const month = Alexa.getSlotValue(handlerInput.requestEnvelope, 'month');
        const day = Alexa.getSlotValue(handlerInput.requestEnvelope, 'day');

        const attributesManager = handlerInput.attributesManager;

        const birthdayAttributes = {
            "year" : year,
            "month" : month,
            "day" : day
        };
        attributesManager.setPersistentAttributes(birthdayAttributes);
        await attributesManager.savePersistentAttributes();

        const speakOutput = `ありがとうございます。誕生日は${year}年${month}月${day}日ですね。`;
        return handlerInput.responseBuilder
            .speak(speakOutput)
            //.reprompt('add a reprompt if you want to keep the session open for the user to respond')
            .getResponse();
    }
};
const HelpIntentHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'IntentRequest'
            && Alexa.getIntentName(handlerInput.requestEnvelope) === 'AMAZON.HelpIntent';
    },
    handle(handlerInput) {
        const speakOutput = 'You can say hello to me! How can I help?';

        return handlerInput.responseBuilder
            .speak(speakOutput)
            .reprompt(speakOutput)
            .getResponse();
    }
};
const CancelAndStopIntentHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'IntentRequest'
            && (Alexa.getIntentName(handlerInput.requestEnvelope) === 'AMAZON.CancelIntent'
                || Alexa.getIntentName(handlerInput.requestEnvelope) === 'AMAZON.StopIntent');
    },
    handle(handlerInput) {
        const speakOutput = 'Goodbye!';
        return handlerInput.responseBuilder
            .speak(speakOutput)
            .getResponse();
    }
};
const SessionEndedRequestHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'SessionEndedRequest';
    },
    handle(handlerInput) {
        // Any cleanup logic goes here.
        return handlerInput.responseBuilder.getResponse();
    }
};

// The intent reflector is used for interaction model testing and debugging.
// It will simply repeat the intent the user said. You can create custom handlers
// for your intents by defining them above, then also adding them to the request
// handler chain below.
const IntentReflectorHandler = {
    canHandle(handlerInput) {
        return Alexa.getRequestType(handlerInput.requestEnvelope) === 'IntentRequest';
    },
    handle(handlerInput) {
        const intentName = Alexa.getIntentName(handlerInput.requestEnvelope);
        const speakOutput = `You just triggered ${intentName}`;

        return handlerInput.responseBuilder
            .speak(speakOutput)
            //.reprompt('add a reprompt if you want to keep the session open for the user to respond')
            .getResponse();
    }
};

// Generic error handling to capture any syntax or routing errors. If you receive an error
// stating the request handler chain is not found, you have not implemented a handler for
// the intent being invoked or included it in the skill builder below.
const ErrorHandler = {
    canHandle() {
        return true;
    },
    handle(handlerInput, error) {
        console.log(`~~~~ Error handled: ${error.stack}`);
        const speakOutput = `Sorry, I had trouble doing what you asked. Please try again.`;

        return handlerInput.responseBuilder
            .speak(speakOutput)
            .reprompt(speakOutput)
            .getResponse();
    }
};

const LoadBirthdayInterceptor = {
    async process(handlerInput) {
        const attributesManager = handlerInput.attributesManager;
        const sessionAttributes = await attributesManager.getPersistentAttributes() || {};

        const year = sessionAttributes.hasOwnProperty('year') ? sessionAttributes.year : 0;
        const month = sessionAttributes.hasOwnProperty('month') ? sessionAttributes.month : 0;
        const day = sessionAttributes.hasOwnProperty('day') ? sessionAttributes.day : 0;

        if (year && month && day) {
            attributesManager.setSessionAttributes(sessionAttributes);
        }
    }
};

// The SkillBuilder acts as the entry point for your skill, routing all request and response
// payloads to the handlers above. Make sure any new handlers or interceptors you've
// defined are included below. The order matters - they're processed top to bottom.
exports.handler = Alexa.SkillBuilders.custom()
    .withPersistenceAdapter(
    new persistenceAdapter.S3PersistenceAdapter({bucketName:process.env.S3_PERSISTENCE_BUCKET})
    )
    .addRequestHandlers(
        HasBirthdayLaunchRequestHandler,
        LaunchRequestHandler,
        CaptureBirthdayIntentHandler,
        HelpIntentHandler,
        CancelAndStopIntentHandler,
        SessionEndedRequestHandler,
        IntentReflectorHandler, // make sure IntentReflectorHandler is last so it doesn't override your custom intent handlers
    )
    .addRequestInterceptors(
        LoadBirthdayInterceptor
    )
    .addErrorHandlers(
        ErrorHandler,
    )
    .lambda();
