package com.ayemin.ratelimit.domain;

import java.util.List;

public class Root {
    private String domain;
    private List<Descriptor> descriptors;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<Descriptor> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(List<Descriptor> descriptors) {
        this.descriptors = descriptors;
    }
}
