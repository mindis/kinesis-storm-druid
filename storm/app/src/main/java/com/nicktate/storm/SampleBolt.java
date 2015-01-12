package com.nicktate.storm;

import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;
import com.google.protobuf.InvalidProtocolBufferException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Map;

public class SampleBolt extends BaseBasicBolt {
    private static final long serialVersionUID = 177788290277634253L;
    private static final Logger LOG = LoggerFactory.getLogger(SampleBolt.class);
    private transient CharsetDecoder decoder;

    @Override
    public void prepare(Map stormConf, TopologyContext context) {
        decoder = Charset.forName("UTF-8").newDecoder();
    }

    @Override
    public void execute(Tuple input, BasicOutputCollector collector) {
        String partitionKey = (String)input.getValueByField(KinesisProtobufRecordScheme.FIELD_PARTITION_KEY);
        String sequenceNumber = (String)input.getValueByField(KinesisProtobufRecordScheme.FIELD_SEQUENCE_NUMBER);
        byte[] payload = (byte[])input.getValueByField(KinesisProtobufRecordScheme.FIELD_RECORD_DATA);
        ByteBuffer buffer = ByteBuffer.wrap(payload);
        String data = null;

        try {
            EventContainerProto.EventContainer container = EventContainerProto.EventContainer.parseFrom(buffer.array());

            if(container.getType() == EventContainerProto.EventContainer.EventType.PAGEVIEW) {
                data = container.getPageview().getUrl() + ":" +container.getPageview().getReferrer();
            } else if(container.getType() == EventContainerProto.EventContainer.EventType.TRANSACTION) {
                data = container.getTransaction().getOrderNumber() + ":" + container.getTransaction().getTotal();
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        LOG.info("SampleBolt got record: partitionKey=" + partitionKey + ", " + " sequenceNumber=" + sequenceNumber
                + ", data=" + data);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
    }
}
