package com.sid.billing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "token")
@Data
public class Consulconfig {
    private Long accessTokenTimeout;
    private Long refreshTokenTimeout;

}
