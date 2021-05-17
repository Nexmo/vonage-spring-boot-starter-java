package com.example.vonagespringbootstarterjava;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vonage")
public class VonageProperties {
    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    private String apiKey;
    private String apiSecret;
}
