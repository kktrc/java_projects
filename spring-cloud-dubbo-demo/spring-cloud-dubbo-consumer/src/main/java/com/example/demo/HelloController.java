package com.example.demo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(check = false)
    private HelloService helloService;

    @Autowired
    private HiService hiService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.sayHello();
    }

    @GetMapping("/saiHi")
    public String sayHi() {
        return hiService.sayHello();
    }
}
