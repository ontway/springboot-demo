package com.dxf.config;

import com.dxf.properties.AcmeProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AcmeProperties.class)
public class MyConfiguration {
}
