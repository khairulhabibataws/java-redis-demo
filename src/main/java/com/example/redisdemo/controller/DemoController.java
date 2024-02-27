package com.example.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

@RestController
public class DemoController {

    @Autowired
    JedisCluster jedis;

    @GetMapping("/data")
    public String getRedisData(){
        String data = jedis.get("abc");
        System.out.println("data > " + data);
        return "My Data = " +data;
    }
}
