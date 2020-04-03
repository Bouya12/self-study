'use strict'; 
// (1) Alexa Skills Kit SDK��ǂݍ��� 
const Alexa = require('alexa-sdk');

// APP_ID �� �� �J���҃R���\�[���Ŏ擾�����X�L��ID���Z�b�g���܂�
const APP_ID = 'amzn1.ask.skill.c9d5cc1b-690c-4b79-97ae-87b58537c40f';
const SKILL_NAME = '����҃J�E���g'; 
const HELP_MESSAGE = '����Ґ��������āA�ō����̗���Ґ������m�点���܂�'; 
const HELP_REPROMPT = '���������ׂ��܂���'; 
const STOP_MESSAGE = '�I�����܂�';

const visitorCount = 156;

// (2)���N�G�X�g�n���h���[���`���� 
const handlers = {

    // (3)LaunchRequest�n���h���[
    'LaunchRequest': function () {
        this.emit('VisitorCountIntent');
    },
    // (4)VisitorCountIntent�n���h���[
    'VisitorCountIntent': function () {
        const speechOutput = '�����̗���Ґ���' + visitorCount + '�l�ł�';
        
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

// (5)Lambda�֐��n���h���[���`����
exports.handler = function (event, context, callback) {
    const alexa = Alexa.handler(event, context, callback);
    
    alexa.APP_ID = APP_ID;
    alexa.registerHandlers(handlers);
    alexa.execute();
}