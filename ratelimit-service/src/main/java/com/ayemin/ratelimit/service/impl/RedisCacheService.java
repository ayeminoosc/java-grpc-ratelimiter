package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.service.CacheService;
import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

public class RedisCacheService implements CacheService {
    private RedissonClient client;

    protected RedisCacheService(RedissonClient client) {
        this.client = client;
    }

    @Override
    public int increase(String key) {
         RAtomicLong atomicLong = client.getAtomicLong("someting");
         atomicLong.incrementAndGet();
         atomicLong.expireAsync(1, TimeUnit.MINUTES);
        return 0;
    }
}
