package com.example.springcloudconsumer.remotemethod;

import com.example.springcloudconsumer.hystrix.HelloRemoteHytrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="spring-cloud-producer",fallback = HelloRemoteHytrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
