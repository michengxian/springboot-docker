package com.example.springbootdocker;

import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
@Slf4j
class SpringbootDockerApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        boolean exits = redisTemplate.hasKey("name");
        if (exits){
            JSONValue.toJSONString(redisTemplate.opsForValue().get("name"));
            String test01 = String.valueOf(redisTemplate.opsForValue().get("name"));
            log.info(test01);
        }
        else {
            log.info("name不存在");
            redisTemplate.opsForValue().set("name","idea");
            String test02 = String.valueOf(redisTemplate.opsForValue().get("name"));
            log.info(test02);
            log.info("name:"+test02);
        }

    }

}
