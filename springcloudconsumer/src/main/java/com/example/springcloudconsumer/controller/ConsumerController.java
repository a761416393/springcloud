package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.remotemethod.HelloRemote;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/hello/{name}")
    public String index (@PathVariable("name") String name){
        return helloRemote.hello(name);

    }
    @RequestMapping("/hello1")
    public String from(){
        return this.hello;
    }
}
