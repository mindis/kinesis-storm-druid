'use strict';

var fs = require('fs');
var Schema = require('protobuf').Schema;
var kinesis = require('./lib/aws').kinesis;
var async = require('async');
var _ = require('lodash');

var eventSchema = new Schema(fs.readFileSync('./models/desc/eventContainer.desc'));
var EventContainer = eventSchema['com.nicktate.EventContainer'];

function describeStream(cb) {
  kinesis.describeStream({
    StreamName: 'ax-data',
    Limit: 2
  }, function(error, data) {
    if(error) {
      return cb(error);
    }

    //console.info(JSON.stringify(data, null, ' '));

    _.each(data.StreamDescription.Shards, function(shard) {
      // set initial checkpoints
      shardCheckpoint[shard.ShardId] = shard.SequenceNumberRange.StartingSequenceNumber;

      kinesis.getShardIterator({
        ShardId: shard.ShardId,
        ShardIteratorType: 'AFTER_SEQUENCE_NUMBER', //'AT_SEQUENCE_NUMBER',
        StreamName: 'ax-data',
        StartingSequenceNumber: shardCheckpoint[shard.ShardId]
      }, function(error, iterator) {
        if(error) {
          return cb(error);
        }

        getRecords(shard.ShardId, iterator.ShardIterator);
        cb();
      });
    });

  });
}

describeStream(function(error) {
 if(error) {
   console.error(error); 
 }
});

var shardCheckpoint = {};

function getRecords(id, iterator) {
  kinesis.getRecords({
    ShardIterator: iterator,
    Limit: 25
  }, function(error, data) {
    if(error) {
      console.error(error);
    }

    _.each(data.Records, function(record) {
      shardCheckpoint[id] = record.SequenceNumber;
      var container = EventContainer.parse(record.Data);
      console.log(id + ': ' + JSON.stringify(container, null, ' '));
    });

    if(!data.NextShardIterator) {
      setTimeout(getRecords, 2500, id, iterator);
    } else {
      getRecords(id, data.NextShardIterator);
    }
  });
}
