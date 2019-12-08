package com.buba.ridesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RidesdemoApplication {

    @Autowired
    RedisTemplate redisTemplate;
    public static void main(String[] args) {
        SpringApplication.run(RidesdemoApplication.class, args);
    }




}
