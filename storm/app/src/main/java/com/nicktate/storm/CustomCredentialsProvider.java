package com.nicktate.storm;

import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;

public class CustomCredentialsProvider extends AWSCredentialsProviderChain {

    public CustomCredentialsProvider() {
        super(new EnvironmentVariableCredentialsProvider(),
                new SystemPropertiesCredentialsProvider(),
                new ClasspathPropertiesFileCredentialsProvider(),
                new InstanceProfileCredentialsProvider());
    }
}
