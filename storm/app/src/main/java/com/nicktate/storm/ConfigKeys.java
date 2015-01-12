package com.nicktate.storm;

/**
 * Keys for configuration of overrides (via properties file).
 */
public class ConfigKeys {
    public static final String STREAM_NAME_KEY = "streamName";

    public static final String INITIAL_POSITION_IN_STREAM_KEY = "initialPositionInStream";

    public static final String RECORD_RETRY_LIMIT = "recordRetryLimit";

    public static final String REGION_KEY = "region";

    public static final String ZOOKEEPER_ENDPOINT_KEY = "zookeeperEndpoint";

    public static final String ZOOKEEPER_PREFIX_KEY = "zookeeperPrefix";

    public static final String TOPOLOGY_NAME_KEY = "topologyName";
}
