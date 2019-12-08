package com.buba.ridesdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RidesdemoApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        ValueOperations vo = redisTemplate.opsForValue();
        vo.set("syh","123");
        Object k1 = vo.get("syh");
        System.out.println(k1);
    }

}
