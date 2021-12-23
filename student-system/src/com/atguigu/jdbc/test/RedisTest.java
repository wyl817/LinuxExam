package com.atguigu.jdbc.test;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("47.98.202.6",6379);
        System.out.println(jedis.ping());
    }
}
