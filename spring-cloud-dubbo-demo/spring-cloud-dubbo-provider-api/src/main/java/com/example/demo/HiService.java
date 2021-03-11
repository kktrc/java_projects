package com.example.demo;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-cloud-dubbo-provider")
public interface HiService {

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    @DubboTransported
    String sayHello();
}
