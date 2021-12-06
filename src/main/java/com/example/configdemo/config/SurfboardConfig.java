package com.example.configdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "setting")
@Component
public class SurfboardConfig {
    private String myConf;
    private String myOtherConf;

    @Value("${my.specific.setting}")
    private String myEnvironmentConfig;
}
