'use strict';

var AWS = require('aws-sdk');
var config = require('./config');
AWS.config.update({
  accessKeyId: config.get('/AWS/key'),
  secretAccessKey: config.get('/AWS/secret'),
  region: config.get('/AWS/region')
});

var kinesis;
module.exports.kinesis = (function() {
  if(!kinesis) { 
    kinesis = new AWS.Kinesis({apiVersion: '2013-12-02'});
  }
  return kinesis;
})();
