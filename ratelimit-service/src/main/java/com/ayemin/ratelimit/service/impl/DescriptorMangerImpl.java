package com.ayemin.ratelimit.service.impl;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.DescriptorCacheService;
import com.ayemin.ratelimit.service.DescriptorLoader;
import com.ayemin.ratelimit.service.DescriptorManager;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class DescriptorMangerImpl implements DescriptorManager {
    private DescriptorLoader descriptorLoader;
    private Properties properties;
    private DescriptorCacheService descriptorCacheService;

    protected DescriptorMangerImpl(DescriptorLoader descriptorLoader, Properties properties, DescriptorCacheService descriptorCacheService) {
        this.descriptorLoader = descriptorLoader;
        this.properties = properties;
        this.descriptorCacheService = descriptorCacheService;
    }

    @Override
    public void reload(){
        List<Root> roots = descriptorLoader.loadConfig(properties);
        descriptorCacheService.storeInCache(roots);
    }

    /**
     * find the match rate-limit config.
     * if (A-B-C) is a nested descriptor, then it will find A-B-C(V), A-B-C, B-C(V), B-C, C(V), C where v = value of the descriptor
     * this given descriptor can have only one child or will throw IllegalArgumentException
     * It can have any number of nested but each level can have only one child.
     * @param domain
     * @param descriptor
     * @return
     */
    @Override
    public Optional<RateLimit> findNearestMatch(String domain, Descriptor descriptor) {
        StringBuffer buffer = new StringBuffer();
        Descriptor child = new Descriptor();
        while(child.getDescriptors()!=null && child.getDescriptors().size()> 0){
            if(child.getDescriptors().size()>1){
                throw new IllegalArgumentException("only one child allowed in each descriptor");
            }
            buffer.append(child.getKey());
            child.getValue().ifPresent(v->buffer.append(":").append(v));
            buffer.append("_");
            child = child.getDescriptors().get(0); // descriptor has only one child
        }

        buffer.append(child.getKey());
        Optional<RateLimit> rateLimit = child.getValue().map(v->descriptorCacheService.getRateLimit(domain, buffer + ":" +  v));
        rateLimit = rateLimit.or(()-> Optional.ofNullable(descriptorCacheService.getRateLimit(domain, buffer.toString())));

        rateLimit = rateLimit.or(()->{
            if(descriptor.getDescriptors() == null || descriptor.getDescriptors().size()==0) return Optional.empty();
            return findNearestMatch(domain, descriptor.getDescriptors().get(0)); // descriptor has only one child
        });

        return rateLimit;
    }
}
