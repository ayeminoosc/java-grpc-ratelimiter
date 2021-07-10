package com.ayemin.grpc.service;

import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitServiceGrpc;

public class BasicRateLimitService extends RateLimitServiceGrpc.RateLimitServiceImplBase{
    @Override
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
                                io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
        System.out.println("hitting ratelimiter");
        RateLimitResponse response = RateLimitResponse.newBuilder()
                .setOverallCode(RateLimitResponse.Code.OVER_LIMIT)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}