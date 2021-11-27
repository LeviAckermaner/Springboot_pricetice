package com.example.springboot.controller;

import com.example.springboot.model.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shishuaiyang
 * @date 2021/11/27-下午3:14
 */
@RestController
public class RedisController {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/addData")
    public String addData(String key, String value){
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set(key,value);
        return "往redis中添加数据成功";
    }
    @GetMapping("/redis/getData/{key}")
    public String getData(@PathVariable String key){
        ValueOperations operations = redisTemplate.opsForValue();
        Object o = operations.get(key);
        return o.toString();
    }

    @PostMapping("/redis/addStringData")
    public String addStringData(String key, String value){
        ValueOperations operations = stringRedisTemplate.opsForValue();
        operations.set(key,value);
        return "往redis中添加数据成功";
    }

    @GetMapping("/redis/getStringData/{key}")
    public String getStringData(@PathVariable String key){
        ValueOperations operations = stringRedisTemplate.opsForValue();
        Object o = operations.get(key);
        return o.toString();
    }

    /**
     * 设置redisTemplate对key，value对序列化方式,默认使用对是JdkSerializationRedisSerializer
     * @param key
     * @param value
     * @return
     */
    @PostMapping("/redis/addString")
    public String addString(String key, String value){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(key, value);
        return "add success";
    }

    @PostMapping("/redis/addjson")
    public String addJson(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Student shishuai = new Student(1, "shishuai", 18);
        redisTemplate.opsForValue().set("student",shishuai);
        return "add json success";
    }

    @GetMapping("/redis/getjson")
    public String getJson(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Student student = (Student) redisTemplate.opsForValue().get("student");
        return student.toString();
    }
}
