'use strict'; 
// (1) Alexa Skills Kit SDKを読み込む 
const Alexa = require('alexa-sdk');

// APP_ID に は 開発者コンソールで取得したスキルIDをセットします
const APP_ID = 'amzn1.ask.skill.c9d5cc1b-690c-4b79-97ae-87b58537c40f';
const SKILL_NAME = '来場者カウント'; 
const HELP_MESSAGE = '来場者数を教えて、で今日の来場者数をお知らせします'; 
const HELP_REPROMPT = '何をお調べしますか'; 
const STOP_MESSAGE = '終了します';

const visitorCount = 156;

// (2)リクエストハンドラーを定義する 
const handlers = {

    // (3)LaunchRequestハンドラー
    'LaunchRequest': function () {
        this.emit('VisitorCountIntent');
    },
    // (4)VisitorCountIntentハンドラー
    'VisitorCountIntent': function () {
        const speechOutput = '今日の来場者数は' + visitorCount + '人です';
        
        this.response.cardRenderer(SKILL_NAME, speechOutput); 
        this.response.speak (speechOutput); 
        this.emit(':responseReady');
    },
    'AMAZON.HelpIntent': function () {
        const speechOutput = HELP_MESSAGE;
        const reprompt = HELP_REPROMPT;
        
        this.response.speak(speechOutput).listen(reprompt); 
        this.emit(':responseReady');
    },
    'AMAZON.CancelIntent': function () {
        this.response.speak (STOP_MESSAGE);
        this.emit(':responseReady');
    },
    'AMAZON.StopIntent': function () {
        this.response.speak(STOP_MESSAGE);
        this.emit(':responseReady');
    },
    'SessionEndedRequest': function () {
    this.emit(':responseReady');
    },
};

// (5)Lambda関数ハンドラーを定義する
exports.handler = function (event, context, callback) {
    const alexa = Alexa.handler(event, context, callback);
    
    alexa.APP_ID = APP_ID;
    alexa.registerHandlers(handlers);
    alexa.execute();
}