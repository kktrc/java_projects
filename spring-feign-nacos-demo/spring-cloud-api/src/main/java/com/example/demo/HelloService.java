package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-provider")
public interface HelloService {


    @GetMapping("/hello")
    String hello();
}
