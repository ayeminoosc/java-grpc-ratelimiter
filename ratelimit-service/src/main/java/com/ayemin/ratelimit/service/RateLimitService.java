package com.ayemin.ratelimit.service;

import com.ayemin.ratelimit.domain.Root;

/**
 * decide to allow or deny the request
 */
public interface RateLimitService {
    boolean allow(Root root);
}
