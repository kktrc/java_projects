package org.example;

import redis.clients.jedis.Jedis;

public class JedisBootstrap {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set("hello", "world");
        jedis.close();
    }
}
