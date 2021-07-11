package com.ayemin.grpc;

import com.ayemin.grpc.service.BasicRateLimitService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
          .forPort(8082)
          .addService(new BasicRateLimitService()).build();
        System.out.println("started Grpc Server");
        server.start();
        server.awaitTermination();
    }
}