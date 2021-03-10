package com.example.servicec;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-b")
public interface ServiceBClient {

    @RequestMapping("/sayHello")
    String sayHello();
}
