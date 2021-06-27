package com.ayemin.grpc.service;

import com.ayemin.grpc.proto.HelloRequest;
import com.ayemin.grpc.proto.HelloResponse;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitServiceGrpc;
import io.grpc.stub.StreamObserver;

import static io.envoyproxy.envoy.service.ratelimit.v3.RateLimitServiceGrpc.getShouldRateLimitMethod;

public class BasicRateLimitService extends RateLimitServiceGrpc.RateLimitServiceImplBase{

//    @Override
    public void hello(
            HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = new StringBuilder()
          .append("Hello, ")
          .append(request.getFirstName())
          .append(" ")
          .append(request.getLastName())
          .toString();

        HelloResponse response = HelloResponse.newBuilder()
          .setGreeting(greeting)
          .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
                                io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
//        io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShouldRateLimitMethod(), responseObserver);
        RateLimitResponse response = RateLimitResponse.newBuilder()
                .setOverallCode(RateLimitResponse.Code.OVER_LIMIT)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}