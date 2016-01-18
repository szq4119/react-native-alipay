'use strict';

var Alipay = require('react-native').NativeModules.AlipayManager;

module.exports = {
   	pay(url, callback) {
        Alipay.pay(url, callback);
    }
};