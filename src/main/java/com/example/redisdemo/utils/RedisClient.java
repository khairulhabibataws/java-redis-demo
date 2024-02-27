package com.example.redisdemo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@Component
public class RedisClient {

    @Bean
    public JedisCluster getJedisConnection() throws Exception{
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        jedisClusterNodes.add(new HostAndPort("redis-new.i7ldaj.clustercfg.apse1.cache.amazonaws.com",6379));
        return new JedisCluster(jedisClusterNodes);
    }

}
