/*jshint -W101 */
'use strict'; 

var Confidence = require('confidence');
var path = require('path');
var fs = require('fs');
var os = require('os');

var AWS_CONFIG_PATH = path.join(__dirname, '../secret/config.json');
var AWS = fs.existsSync(AWS_CONFIG_PATH) ? JSON.parse(fs.readFileSync(AWS_CONFIG_PATH)) : {};

var criteria = {
  env: process.env.NODE_ENV
};

var config = {
  AWS:{
    key: process.env.AWS_KEY || AWS.accessKeyId,
    secret: process.env.AWS_SECRET || AWS.secretAccessKey,
    region: 'us-east-1'
  },
};

var store = new Confidence.Store();
store.load(config);

module.exports.get = function(key) {
  return store.get(key, criteria);
};
