package com.example.configdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties
@SpringBootApplication
public class ConfigdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigdemoApplication.class, args);
	}
}
