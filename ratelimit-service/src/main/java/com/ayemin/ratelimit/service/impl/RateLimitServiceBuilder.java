package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.service.*;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Properties;

public class RateLimitServiceBuilder {
    private CacheService cacheService;
    private DescriptorCacheService descriptorCacheService;
    private RateLimitAlgorithm algorithm;
    private Properties properties;
    private DescriptorLoader descriptorLoader;

    private final String REDIS_CONFIG_LOCATION = "REDIS_CONFIG_LOCATION";

    public RateLimitServiceBuilder() {
    }

    enum CounterCacheType {
        EHCACHE, REDIS, HAZELCAST, MEM_CACHE;
    }

    enum DescriptorCacheType {
        IN_MEMORY_HEAP;
    }

    enum RateLimitAlgorithm {
        SLIDING_WINDOW, FIX_WINDOW, TOKEN_BUCKET, LEAKY_BUCKET;
    }

    public RateLimitService build() throws IOException {
        if (Objects.isNull(descriptorLoader)) {
            descriptorLoader = new YamlDescriptorLoader();
        }

        if (Objects.isNull(properties)) {
            withProperties(this.getClass().getClassLoader().getResource("application.properties"));
        }

        if (Objects.isNull(descriptorCacheService)) {
            withDescriptorCache(DescriptorCacheType.IN_MEMORY_HEAP);
        }

        if(Objects.isNull(cacheService) && Objects.nonNull(properties.getProperty("REDIS_CONFIG_LOCATION"))){
            withRedis(Paths.get(properties.getProperty("REDIS_CONFIG_LOCATION")));
        }

        if (Objects.isNull(cacheService)) {
            withRedis(this.getClass().getClassLoader().getResource("redisson.yml"));
        }

        if (Objects.isNull(algorithm)) {
            algorithm = RateLimitAlgorithm.FIX_WINDOW;
        }

        DescriptorManager descriptorManager = new DescriptorMangerImpl(descriptorLoader, properties, descriptorCacheService);

        switch (algorithm) {
            case FIX_WINDOW:
                return new FixWindowRateLimitService(descriptorManager, cacheService);
            default:
                throw new UnsupportedOperationException(); //todo: add more later
        }
    }

    public RateLimitServiceBuilder withProperties(Path path) throws IOException {
        this.properties = new Properties();
        try (InputStream in = new FileInputStream(path.toFile())) {
            properties.load(in);
        }
        return this;
    }

    public RateLimitServiceBuilder withProperties(URL path) throws IOException {
        this.properties = new Properties();
        try (InputStream in = path.openStream()) {
            properties.load(in);
        }
        return this;
    }

    public RateLimitServiceBuilder withCounterCache(CounterCacheType type) {
        this.cacheService = getCounterCache(type);
        return this;
    }

    public RateLimitServiceBuilder withCounterCache(CacheService cacheService) {
        this.cacheService = cacheService;
        return this;
    }

    public RateLimitServiceBuilder withDescriptorCache(DescriptorCacheType descriptorCacheType) {
        this.descriptorCacheService = getDescriptorCacheService(descriptorCacheType);
        return this;
    }

    public RateLimitServiceBuilder withDescriptorCache(DescriptorCacheService descriptorCacheService) {
        this.descriptorCacheService = descriptorCacheService;
        return this;
    }

    public RateLimitServiceBuilder withAlgorithm(RateLimitAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public RateLimitServiceBuilder withDescriptorLoader(DescriptorLoader descriptorLoader) {
        this.descriptorLoader = descriptorLoader;
        return this;
    }

    public RateLimitServiceBuilder withRedis(Path configPath) throws IOException {
        Config config = Config.fromYAML(configPath.toFile());
        return withRedis(config);
    }

    public RateLimitServiceBuilder withRedis(URL configPath) throws IOException {
        Config config = Config.fromYAML(configPath);
        return withRedis(config);
    }

    public RateLimitServiceBuilder withRedis(Config config) {
        RedissonClient client = Redisson.create(config);
        this.cacheService = new RedisCacheService(client);
        return this;
    }

    private CacheService getCounterCache(CounterCacheType type) {
        switch (type) {
            case EHCACHE:
                throw new UnsupportedOperationException(); //todo: add later
            case HAZELCAST:
                throw new UnsupportedOperationException(); //todo: add later
            case MEM_CACHE:
                throw new UnsupportedOperationException(); //todo: add later
            default:
                throw new UnsupportedOperationException();
        }
    }

    private DescriptorCacheService getDescriptorCacheService(DescriptorCacheType type) {
        switch (type) {
            case IN_MEMORY_HEAP:
                return new InHeapDescriptorCacheService();
            default:
                throw new UnsupportedOperationException(); //todo: add more later
        }
    }

}
