package com.ayemin.grpc;

import com.ayemin.grpc.proto.HelloRequest;
import com.ayemin.grpc.proto.HelloResponse;
import com.ayemin.grpc.proto.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
          .usePlaintext()
          .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
          = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
          .setFirstName("Aye Min")
          .setLastName("Oo")
          .build());
        System.out.println(helloResponse.getGreeting());
        channel.shutdown();
    }
}