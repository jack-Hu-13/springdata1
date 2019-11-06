package com.offcn.springdata.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
@SpringBootTest
public class APPTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void getRedis(){
        redisTemplate.opsForValue().set("fe","jdfdff");
        String str = (String) redisTemplate.opsForValue().get("fe");

        System.out.println(str);
    }
}
