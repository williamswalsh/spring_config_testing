package com.example.configdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "setting")
@Component
public class BasicConfig {
    private String myConf;
    private String myOtherConf;
}
