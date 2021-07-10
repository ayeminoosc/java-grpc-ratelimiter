package com.ayemin.ratelimit.domain;

import java.util.List;
import java.util.Optional;

public class Descriptor {
    private String key;
    private String value;
    private RateLimit rateLimit;
    private List<Descriptor> descriptors;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Optional<RateLimit> getRateLimit() {
        return Optional.ofNullable(rateLimit);
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public List<Descriptor> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(List<Descriptor> descriptors) {
        this.descriptors = descriptors;
    }
}
