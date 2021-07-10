package com.ayemin.ratelimit.service;

import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Root;

import java.util.List;
import java.util.Optional;

public interface DescriptorCacheService {
    void storeInCache(List<Root> rootList);
    RateLimit getRateLimit(String domain, String descriptorCacheKey);
}
