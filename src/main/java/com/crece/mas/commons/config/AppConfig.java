package com.crece.mas.commons.config;

import com.crece.mas.commons.guid.GUIDGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Value("${guid.context}")
    private Integer contextNumber;

    @Bean("clienteRestCustomers")
    @LoadBalanced
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    protected OAuth2TokenRetriever tokenRetriever() {
        return new OAuth2TokenRetriever();
    }

    @Bean
    public GUIDGenerator guidGenerator() {
        if(contextNumber == null)
            contextNumber = 0;
        return new GUIDGenerator(1, contextNumber);
    }
}
