package com.example.servicec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/hello")
    public String hello() {
        return serviceBClient.sayHello();
    }
}
