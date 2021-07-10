package com.ayemin.ratelimit.service;

import com.ayemin.ratelimit.domain.Root;

import java.util.List;
import java.util.Properties;

/**
 * load rate-limit configs into cache
 */
public interface DescriptorLoader {
    List<Root> loadConfig(Properties properties);
}
