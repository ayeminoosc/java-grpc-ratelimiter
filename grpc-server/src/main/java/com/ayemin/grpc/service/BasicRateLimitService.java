package com.ayemin.grpc.service;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.RateLimit;
import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.domain.Unit;
import com.ayemin.ratelimit.service.RateLimitService;
import com.ayemin.ratelimit.service.impl.RateLimitServiceBuilder;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitServiceGrpc;

import java.io.IOException;
import java.util.Arrays;

public class BasicRateLimitService extends RateLimitServiceGrpc.RateLimitServiceImplBase {
    private RateLimitService rateLimitService;

    public BasicRateLimitService() {
        try {
            rateLimitService = new RateLimitServiceBuilder().build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
                                io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
        System.out.println("hitting ratelimiter");

        //testing root data
        Root root = new Root();
        root.setDomain("banking");
        Descriptor orgDes = new Descriptor();
        orgDes.setKey("org");
        orgDes.setValue("rhovg");
        orgDes.setRateLimit(new RateLimit(20, Unit.MINUTE));
        Descriptor userDes = new Descriptor();
        userDes.setKey("user");
        userDes.setValue("tester1");
        userDes.setRateLimit(new RateLimit(4, Unit.MINUTE));
        orgDes.setDescriptors(Arrays.asList(userDes));
        root.setDescriptors(Arrays.asList(orgDes));


        RateLimitResponse.Code responseCode = RateLimitResponse.Code.OK;
        if (!rateLimitService.allow(root)) {
            responseCode = RateLimitResponse.Code.OVER_LIMIT;
        }
        RateLimitResponse response = RateLimitResponse.newBuilder()
                .setOverallCode(responseCode)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}