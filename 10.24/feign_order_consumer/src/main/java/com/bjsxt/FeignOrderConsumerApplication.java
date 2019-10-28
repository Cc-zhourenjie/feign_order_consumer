package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启Feign的远程调用服务
public class FeignOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrderConsumerApplication.class, args);
    }

}
