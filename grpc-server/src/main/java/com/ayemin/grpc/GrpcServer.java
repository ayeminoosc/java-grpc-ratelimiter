package com.ayemin.grpc;

import com.ayemin.grpc.service.BasicRateLimitService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
          .forPort(8082)
          .addService(new BasicRateLimitService(convert(args))).build();
        System.out.println("started Grpc Server");
        server.start();
        server.awaitTermination();
    }

    static Map<String, String> convert(String[]args){
        Map<String, String> argMap = new HashMap<>();
        if(Objects.isNull(args)) return argMap;
        for(String arg: args){
            String[] tmp = arg.split("=");
            argMap.put(tmp[0], tmp[1]);
        }
        return argMap;
    }
}