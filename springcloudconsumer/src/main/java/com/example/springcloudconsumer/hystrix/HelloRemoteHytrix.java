package com.example.springcloudconsumer.hystrix;

import com.example.springcloudconsumer.remotemethod.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHytrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" + name +", this message send failed!";
    }
}
