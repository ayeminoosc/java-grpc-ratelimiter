package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.CacheService;
import com.ayemin.ratelimit.service.DescriptorManager;
import com.ayemin.ratelimit.service.RateLimitService;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.ayemin.ratelimit.util.functions.convertToDescriptorCacheKey;
import static com.ayemin.ratelimit.util.functions.getCurrentWindowKey;

public class FixWindowRateLimitService implements RateLimitService {
    private DescriptorManager descriptorManager;
    private CacheService cacheService;

    protected FixWindowRateLimitService(DescriptorManager descriptorManager, CacheService cacheService) {
        this.descriptorManager = descriptorManager;
        this.cacheService = cacheService;
    }

    @Override
    public boolean allow(Root root) {
        AtomicBoolean isAllow = new AtomicBoolean(true);
        for (Descriptor descriptor : root.getDescriptors()) {
            String cacheKey = convertToDescriptorCacheKey(descriptor);

            Optional<RateLimit> rateLimit = descriptorManager.findNearestMatch(root.getDomain(), descriptor);

            rateLimit.ifPresent(rl -> {
                long currentUnitKey = getCurrentWindowKey(rl.getUnit());
                long totalCount = cacheService.increase(root.getDomain() + "-" + cacheKey + "_" + currentUnitKey);
                if (totalCount > rl.getRequestPerUnit()) {
                    isAllow.set(false);
                }
                System.out.println("currentUnitKey " + currentUnitKey);
                System.out.println("totalCount " + totalCount);
                System.out.println("allowed count "+ rl.getRequestPerUnit());
                System.out.println("allowed "+ (totalCount > rl.getRequestPerUnit()));
            });

        }

        return isAllow.get();
    }
}
