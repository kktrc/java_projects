package com.example.demo.service;

import com.example.demo.HiService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class HiServiceImpl implements HiService {

    @Override
    public String sayHello() {
        return "Hello Feign";
    }
}
