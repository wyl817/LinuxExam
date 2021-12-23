package com.atguigu.jdbc.util;

import redis.clients.jedis.Jedis;

public class redisUtil {
    Jedis jedis=null;
    public static Jedis getConnection(){
        return new Jedis("47.98.202.6",6379);
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
