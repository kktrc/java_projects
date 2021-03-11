package com.example.demo.service;

import com.example.demo.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
