package com.ayemin.ratelimit.util;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.Pair;
import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class functions {

    /**
     * Find all config-key and rate-limit pair from a given descriptor.
     * config-key will be generated in the format key[:value](_key[:value])*
     * this methods support full complex structure of Descriptor class
     * @param descriptor
     * @return
     */
    public static List<Pair<String, RateLimit>> getAllRateLimitFromDescriptor(Descriptor descriptor){
        return getAllRateLimitFromDescriptor(descriptor, "");
    }

    /**
     * convert given descriptor to descriptor_cache_key in key[:value](_key[:value])* format.
     * this given descriptor can have only one child or will throw IllegalArgumentException
     * It can have any number of nested but each level can have only one child.
     * @param descriptor
     * @return
     */

    public static String convertToDescriptorCacheKey(Descriptor descriptor) {
        StringBuffer buffer = new StringBuffer();
        convertToDescriptorCacheKey(descriptor, buffer);
        return buffer.toString();
    }

    private static void convertToDescriptorCacheKey(Descriptor descriptor, StringBuffer buffer) {
        buffer.append(descriptor.getKey());
        descriptor.getValue().ifPresent(v-> buffer.append(":").append(v));
        if(descriptor.getDescriptors() != null && descriptor.getDescriptors().size()>1) {
            throw new IllegalArgumentException("only one child allowed in each descriptor");
        }
        if(descriptor.getDescriptors() != null && descriptor.getDescriptors().size() == 1) {
            buffer.append("_");
            convertToDescriptorCacheKey(descriptor.getDescriptors().get(0), buffer); // we take only first user
        }
    }

    private static List<Pair<String, RateLimit>> getAllRateLimitFromDescriptor(Descriptor descriptor, String prefix) {
        StringBuffer buffer = new StringBuffer(prefix);
        List<Pair<String, RateLimit>> pairList = new ArrayList<>();
        buffer.append(descriptor.getKey());
        descriptor.getValue().ifPresent(v -> buffer.append(":" + v));

        descriptor.getRateLimit().ifPresent(rl -> {
            Pair<String, RateLimit> rateLimitPair = new Pair<>();
            rateLimitPair.setLeft(buffer.toString());
            rateLimitPair.setRight(rl);
            pairList.add(rateLimitPair);
        });

        if (descriptor.getDescriptors() != null && descriptor.getDescriptors().size() > 0) {
            buffer.append("_");
            for (Descriptor d : descriptor.getDescriptors()) {
                pairList.addAll(getAllRateLimitFromDescriptor(d, buffer.toString()));
            }
        }

        return pairList;
    }


    public static long getCurrentWindowKey(Unit unit) {
        long nowInMillisecond = System.currentTimeMillis();
        switch (unit) {
            case SECOND:
                return nowInMillisecond / 1000;
            case MINUTE:
                return nowInMillisecond / 60000; // 1000 * 60
            case HOUR:
                return nowInMillisecond / 3600000;  // 1000 * 60 * 60
            case DAY:
                return nowInMillisecond / 86400000; // 1000 * 60 * 60 * 24
            default:
                throw new IllegalArgumentException("Unsupported Time Unit");
        }
    }

    public static <T, R> Function<T, R> wrap(CheckedFunction<T, R> checkedFunction) {
        return t -> {
            try {
                return checkedFunction.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
