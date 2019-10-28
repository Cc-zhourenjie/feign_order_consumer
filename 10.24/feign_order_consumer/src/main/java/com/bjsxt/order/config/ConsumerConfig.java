package com.bjsxt.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import feign.Retryer;
import feign.Retryer.Default;

@Configuration
public class ConsumerConfig {

    @Bean
    public Retryer retryer(){
        return new Default();
    }


}
