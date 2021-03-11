package com.example.demo.service;

import com.example.demo.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloService {


    @Override
    public String hello() {
        return "hello boy";
    }
}
