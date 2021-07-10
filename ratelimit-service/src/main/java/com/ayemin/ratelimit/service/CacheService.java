package com.ayemin.ratelimit.service;

public interface CacheService {
    /**
     * atomic increase of the given cache key
     * @param key
     * @return
     */
    int increase(String key);
}
