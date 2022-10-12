package com.sysco.qe.subs.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

public class RedisConnection {

    public static final int PORT = 6379;
    private static final String HOSTURL = "pmt-redis-dev.n9cgta.clustercfg.use1.cache.amazonaws.com";
    private static RedisConnection redisSingletonConnection = null;
    private static JedisPoolConfig pool = new JedisPoolConfig();
    private static JedisCluster jedisCluster = new JedisCluster(new HostAndPort(HOSTURL, PORT), pool);

    private RedisConnection() {

    }

    private static RedisConnection getInstance() {
        if (redisSingletonConnection == null) {
            redisSingletonConnection = new RedisConnection();
        }
        return redisSingletonConnection;
    }

    public static JedisCluster getJedisCluster() {
        RedisConnection.getInstance();
        return RedisConnection.jedisCluster;
    }

    public static void deleteOpcoExclusionData(String opco) {
        String redisKey = "dds-qa-" + opco + "-exclusions";
        jedisCluster = RedisConnection.getJedisCluster();
        jedisCluster.del(redisKey);
    }

    public static void deleteOpcoThresholdData(String opco) {
        String redisKey = "dds-qa-" + opco + "-threshold-settings";
        jedisCluster = RedisConnection.getJedisCluster();
        jedisCluster.del(redisKey);
    }
}
