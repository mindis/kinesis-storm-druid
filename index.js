'use strict';

var fs = require('fs');
var Schema = require('protobuf').Schema;

// "schema" contains all message types defined in buftest.proto|desc.
var eventSchema = new Schema(fs.readFileSync('./models/desc/eventContainer.desc'));

// The "BufTest" message.
var EventContainer = eventSchema['com.nicktate.EventContainer'];

var pageview = {
  type: 'PAGEVIEW',
  pageview: {
    url: 'my url'
  }
};

var proto = EventContainer.serialize(pageview);
console.log('proto.length:', proto.length);
console.log('serialised:', proto);

var outOb = EventContainer.parse(proto);
console.log('unserialised:', JSON.stringify(outOb));
