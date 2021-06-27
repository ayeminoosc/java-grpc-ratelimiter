package io.envoyproxy.envoy.service.secret.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/secret/v3/sds.proto")
public final class SecretDiscoveryServiceGrpc {

  private SecretDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.secret.v3.SecretDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeltaSecrets",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaSecretsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaSecretsMethod;
    if ((getDeltaSecretsMethod = SecretDiscoveryServiceGrpc.getDeltaSecretsMethod) == null) {
      synchronized (SecretDiscoveryServiceGrpc.class) {
        if ((getDeltaSecretsMethod = SecretDiscoveryServiceGrpc.getDeltaSecretsMethod) == null) {
          SecretDiscoveryServiceGrpc.getDeltaSecretsMethod = getDeltaSecretsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeltaSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretDiscoveryServiceMethodDescriptorSupplier("DeltaSecrets"))
              .build();
        }
      }
    }
    return getDeltaSecretsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSecrets",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamSecretsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamSecretsMethod;
    if ((getStreamSecretsMethod = SecretDiscoveryServiceGrpc.getStreamSecretsMethod) == null) {
      synchronized (SecretDiscoveryServiceGrpc.class) {
        if ((getStreamSecretsMethod = SecretDiscoveryServiceGrpc.getStreamSecretsMethod) == null) {
          SecretDiscoveryServiceGrpc.getStreamSecretsMethod = getStreamSecretsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretDiscoveryServiceMethodDescriptorSupplier("StreamSecrets"))
              .build();
        }
      }
    }
    return getStreamSecretsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchSecretsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchSecrets",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchSecretsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchSecretsMethod;
    if ((getFetchSecretsMethod = SecretDiscoveryServiceGrpc.getFetchSecretsMethod) == null) {
      synchronized (SecretDiscoveryServiceGrpc.class) {
        if ((getFetchSecretsMethod = SecretDiscoveryServiceGrpc.getFetchSecretsMethod) == null) {
          SecretDiscoveryServiceGrpc.getFetchSecretsMethod = getFetchSecretsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchSecrets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretDiscoveryServiceMethodDescriptorSupplier("FetchSecrets"))
              .build();
        }
      }
    }
    return getFetchSecretsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceStub>() {
        @java.lang.Override
        public SecretDiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretDiscoveryServiceStub(channel, callOptions);
        }
      };
    return SecretDiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public SecretDiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretDiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return SecretDiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretDiscoveryServiceFutureStub>() {
        @java.lang.Override
        public SecretDiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretDiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return SecretDiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SecretDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaSecrets(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDeltaSecretsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamSecrets(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamSecretsMethod(), responseObserver);
    }

    /**
     */
    public void fetchSecrets(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchSecretsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeltaSecretsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>(
                  this, METHODID_DELTA_SECRETS)))
          .addMethod(
            getStreamSecretsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_STREAM_SECRETS)))
          .addMethod(
            getFetchSecretsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_FETCH_SECRETS)))
          .build();
    }
  }

  /**
   */
  public static final class SecretDiscoveryServiceStub extends io.grpc.stub.AbstractAsyncStub<SecretDiscoveryServiceStub> {
    private SecretDiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretDiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretDiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaSecrets(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDeltaSecretsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamSecrets(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamSecretsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void fetchSecrets(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchSecretsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecretDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecretDiscoveryServiceBlockingStub> {
    private SecretDiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretDiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchSecrets(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchSecretsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecretDiscoveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SecretDiscoveryServiceFutureStub> {
    private SecretDiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretDiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> fetchSecrets(
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchSecretsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_SECRETS = 0;
  private static final int METHODID_DELTA_SECRETS = 1;
  private static final int METHODID_STREAM_SECRETS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_SECRETS:
          serviceImpl.fetchSecrets((io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest) request,
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELTA_SECRETS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deltaSecrets(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>) responseObserver);
        case METHODID_STREAM_SECRETS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamSecrets(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecretDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.secret.v3.SdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretDiscoveryService");
    }
  }

  private static final class SecretDiscoveryServiceFileDescriptorSupplier
      extends SecretDiscoveryServiceBaseDescriptorSupplier {
    SecretDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class SecretDiscoveryServiceMethodDescriptorSupplier
      extends SecretDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretDiscoveryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecretDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getDeltaSecretsMethod())
              .addMethod(getStreamSecretsMethod())
              .addMethod(getFetchSecretsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
