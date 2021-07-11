package com.ayemin.grpc.service;

import com.ayemin.ratelimit.domain.Descriptor;
import com.ayemin.ratelimit.domain.Root;
import com.ayemin.ratelimit.service.RateLimitService;
import com.ayemin.ratelimit.service.impl.RateLimitServiceBuilder;
import io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse;
import io.envoyproxy.envoy.service.ratelimit.v3.RateLimitServiceGrpc;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicRateLimitService extends RateLimitServiceGrpc.RateLimitServiceImplBase {
    private RateLimitService rateLimitService;

    public BasicRateLimitService(Map<String,String> argMap) {
        RateLimitServiceBuilder builder = new RateLimitServiceBuilder();
        try {
            if(Objects.nonNull(argMap.get("--rt.config.location"))){
                builder = builder.withProperties(Paths.get(argMap.get("--rt.config.location")));
            }
            rateLimitService = builder.build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
                                io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
        System.out.println("hitting rate-limiter");
                Root root = new Root();
        root.setDomain(request.getDomain());
        List<Descriptor> descriptorList = request.getDescriptorsList().stream().map(convert).collect(Collectors.toList());
        root.setDescriptors(descriptorList);

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

    private Function<RateLimitDescriptor, Descriptor> convert = rld->{
        Descriptor descriptor = new Descriptor();
        Descriptor lastChild = descriptor;
        Descriptor parentOfLastChild = null;
        for(RateLimitDescriptor.Entry entry: rld.getEntriesList()){
            lastChild.setKey(entry.getKey());
            lastChild.setValue(entry.getValue());
            parentOfLastChild = lastChild;
            Descriptor tmpChild = new Descriptor();
            lastChild.setDescriptors(Arrays.asList(tmpChild));
            lastChild = tmpChild;
        }

        parentOfLastChild.setDescriptors(null);
        return descriptor;
    };
}