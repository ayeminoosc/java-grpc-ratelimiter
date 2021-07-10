package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.domain.Pair;
import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.DescriptorCacheService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ayemin.ratelimit.util.functions.getAllRateLimitFromDescriptor;

public class InHeapDescriptorCacheService implements DescriptorCacheService {

    private Map<String, Map<String, RateLimit>> mapOfRateLimit = new HashMap<>();

    @Override
    public void storeInCache(List<Root> rootList) {
        rootList.forEach(root -> {
            Map<String, RateLimit> rateLimitMap = new HashMap<>();
            mapOfRateLimit.put(root.getDomain(), rateLimitMap);
            root.getDescriptors().forEach(descriptor -> {
                List<Pair<String, RateLimit>> rateLimitPairList = getAllRateLimitFromDescriptor(descriptor);
                rateLimitPairList.forEach(pair->{
                    rateLimitMap.put(pair.getLeft(), pair.getRight());
                });
            });
        });
    }

    @Override
    public RateLimit getRateLimit(String domain, String descriptorCacheKey) {
        if(mapOfRateLimit.containsKey(domain)) return mapOfRateLimit.get(domain).get(descriptorCacheKey);
        return null;
    }
}
