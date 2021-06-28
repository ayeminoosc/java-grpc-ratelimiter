package io.envoyproxy.envoy.service.ratelimit.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/ratelimit/v3/rls.proto")
public final class RateLimitServiceGrpc {

  private RateLimitServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.ratelimit.v3.RateLimitService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest,
      io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> getShouldRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShouldRateLimit",
      requestType = io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest.class,
      responseType = io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest,
      io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> getShouldRateLimitMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest, io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> getShouldRateLimitMethod;
    if ((getShouldRateLimitMethod = RateLimitServiceGrpc.getShouldRateLimitMethod) == null) {
      synchronized (RateLimitServiceGrpc.class) {
        if ((getShouldRateLimitMethod = RateLimitServiceGrpc.getShouldRateLimitMethod) == null) {
          RateLimitServiceGrpc.getShouldRateLimitMethod = getShouldRateLimitMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest, io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShouldRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RateLimitServiceMethodDescriptorSupplier("ShouldRateLimit"))
              .build();
        }
      }
    }
    return getShouldRateLimitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RateLimitServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceStub>() {
        @java.lang.Override
        public RateLimitServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateLimitServiceStub(channel, callOptions);
        }
      };
    return RateLimitServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RateLimitServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceBlockingStub>() {
        @java.lang.Override
        public RateLimitServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateLimitServiceBlockingStub(channel, callOptions);
        }
      };
    return RateLimitServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RateLimitServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RateLimitServiceFutureStub>() {
        @java.lang.Override
        public RateLimitServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RateLimitServiceFutureStub(channel, callOptions);
        }
      };
    return RateLimitServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RateLimitServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Determine whether rate limiting should take place.
     * </pre>
     */
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShouldRateLimitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShouldRateLimitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest,
                io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse>(
                  this, METHODID_SHOULD_RATE_LIMIT)))
          .build();
    }
  }

  /**
   */
  public static final class RateLimitServiceStub extends io.grpc.stub.AbstractAsyncStub<RateLimitServiceStub> {
    private RateLimitServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RateLimitServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateLimitServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Determine whether rate limiting should take place.
     * </pre>
     */
    public void shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShouldRateLimitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RateLimitServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RateLimitServiceBlockingStub> {
    private RateLimitServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RateLimitServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateLimitServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Determine whether rate limiting should take place.
     * </pre>
     */
    public io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse shouldRateLimit(io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShouldRateLimitMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RateLimitServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RateLimitServiceFutureStub> {
    private RateLimitServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RateLimitServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RateLimitServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Determine whether rate limiting should take place.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse> shouldRateLimit(
        io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShouldRateLimitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOULD_RATE_LIMIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RateLimitServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RateLimitServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOULD_RATE_LIMIT:
          serviceImpl.shouldRateLimit((io.envoyproxy.envoy.service.ratelimit.v3.RateLimitRequest) request,
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RateLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RateLimitServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.ratelimit.v3.RlsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RateLimitService");
    }
  }

  private static final class RateLimitServiceFileDescriptorSupplier
      extends RateLimitServiceBaseDescriptorSupplier {
    RateLimitServiceFileDescriptorSupplier() {}
  }

  private static final class RateLimitServiceMethodDescriptorSupplier
      extends RateLimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RateLimitServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RateLimitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RateLimitServiceFileDescriptorSupplier())
              .addMethod(getShouldRateLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
