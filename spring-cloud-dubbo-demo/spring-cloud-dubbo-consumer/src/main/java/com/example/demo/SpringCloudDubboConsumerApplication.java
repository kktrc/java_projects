package com.example.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDubbo
@EnableFeignClients
public class SpringCloudDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboConsumerApplication.class, args);
    }

}
