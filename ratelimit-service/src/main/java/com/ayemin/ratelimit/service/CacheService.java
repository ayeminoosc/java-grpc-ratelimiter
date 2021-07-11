package com.ayemin.ratelimit.service;

public interface CacheService {
    /**
     * atomic increase of the given cache key
     * @param key
     * @return
     */
    long increase(String key);
}
