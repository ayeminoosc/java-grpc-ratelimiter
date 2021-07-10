package com.ayemin.ratelimit.service;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.RateLimit;

import java.util.Optional;

/**
 * find nearest match for config provided against configs store in cache
 */
public interface DescriptorManager {
    Optional<RateLimit> findNearestMatch(String domain, Descriptor descriptor);

    void reload();

}
