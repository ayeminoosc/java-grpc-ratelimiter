package io.envoyproxy.envoy.service.route.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The resource_names field in DiscoveryRequest specifies a route configuration.
 * This allows an Envoy configuration with multiple HTTP listeners (and
 * associated HTTP connection manager filters) to use different route
 * configurations. Each listener will bind its HTTP connection manager filter to
 * a route table via this identifier.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/route/v3/rds.proto")
public final class RouteDiscoveryServiceGrpc {

  private RouteDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.route.v3.RouteDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamRoutesMethod;
    if ((getStreamRoutesMethod = RouteDiscoveryServiceGrpc.getStreamRoutesMethod) == null) {
      synchronized (RouteDiscoveryServiceGrpc.class) {
        if ((getStreamRoutesMethod = RouteDiscoveryServiceGrpc.getStreamRoutesMethod) == null) {
          RouteDiscoveryServiceGrpc.getStreamRoutesMethod = getStreamRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteDiscoveryServiceMethodDescriptorSupplier("StreamRoutes"))
              .build();
        }
      }
    }
    return getStreamRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeltaRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaRoutesMethod;
    if ((getDeltaRoutesMethod = RouteDiscoveryServiceGrpc.getDeltaRoutesMethod) == null) {
      synchronized (RouteDiscoveryServiceGrpc.class) {
        if ((getDeltaRoutesMethod = RouteDiscoveryServiceGrpc.getDeltaRoutesMethod) == null) {
          RouteDiscoveryServiceGrpc.getDeltaRoutesMethod = getDeltaRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeltaRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteDiscoveryServiceMethodDescriptorSupplier("DeltaRoutes"))
              .build();
        }
      }
    }
    return getDeltaRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchRoutesMethod;
    if ((getFetchRoutesMethod = RouteDiscoveryServiceGrpc.getFetchRoutesMethod) == null) {
      synchronized (RouteDiscoveryServiceGrpc.class) {
        if ((getFetchRoutesMethod = RouteDiscoveryServiceGrpc.getFetchRoutesMethod) == null) {
          RouteDiscoveryServiceGrpc.getFetchRoutesMethod = getFetchRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RouteDiscoveryServiceMethodDescriptorSupplier("FetchRoutes"))
              .build();
        }
      }
    }
    return getFetchRoutesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceStub>() {
        @java.lang.Override
        public RouteDiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteDiscoveryServiceStub(channel, callOptions);
        }
      };
    return RouteDiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public RouteDiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteDiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return RouteDiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouteDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RouteDiscoveryServiceFutureStub>() {
        @java.lang.Override
        public RouteDiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RouteDiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return RouteDiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The resource_names field in DiscoveryRequest specifies a route configuration.
   * This allows an Envoy configuration with multiple HTTP listeners (and
   * associated HTTP connection manager filters) to use different route
   * configurations. Each listener will bind its HTTP connection manager filter to
   * a route table via this identifier.
   * </pre>
   */
  public static abstract class RouteDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamRoutesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDeltaRoutesMethod(), responseObserver);
    }

    /**
     */
    public void fetchRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchRoutesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_STREAM_ROUTES)))
          .addMethod(
            getDeltaRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>(
                  this, METHODID_DELTA_ROUTES)))
          .addMethod(
            getFetchRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_FETCH_ROUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * The resource_names field in DiscoveryRequest specifies a route configuration.
   * This allows an Envoy configuration with multiple HTTP listeners (and
   * associated HTTP connection manager filters) to use different route
   * configurations. Each listener will bind its HTTP connection manager filter to
   * a route table via this identifier.
   * </pre>
   */
  public static final class RouteDiscoveryServiceStub extends io.grpc.stub.AbstractAsyncStub<RouteDiscoveryServiceStub> {
    private RouteDiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteDiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteDiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamRoutesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDeltaRoutesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void fetchRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchRoutesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The resource_names field in DiscoveryRequest specifies a route configuration.
   * This allows an Envoy configuration with multiple HTTP listeners (and
   * associated HTTP connection manager filters) to use different route
   * configurations. Each listener will bind its HTTP connection manager filter to
   * a route table via this identifier.
   * </pre>
   */
  public static final class RouteDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RouteDiscoveryServiceBlockingStub> {
    private RouteDiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteDiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The resource_names field in DiscoveryRequest specifies a route configuration.
   * This allows an Envoy configuration with multiple HTTP listeners (and
   * associated HTTP connection manager filters) to use different route
   * configurations. Each listener will bind its HTTP connection manager filter to
   * a route table via this identifier.
   * </pre>
   */
  public static final class RouteDiscoveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RouteDiscoveryServiceFutureStub> {
    private RouteDiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteDiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RouteDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> fetchRoutes(
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchRoutesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_ROUTES = 0;
  private static final int METHODID_STREAM_ROUTES = 1;
  private static final int METHODID_DELTA_ROUTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouteDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_ROUTES:
          serviceImpl.fetchRoutes((io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest) request,
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
        case METHODID_STREAM_ROUTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamRoutes(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>) responseObserver);
        case METHODID_DELTA_ROUTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deltaRoutes(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RouteDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RouteDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.route.v3.RdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RouteDiscoveryService");
    }
  }

  private static final class RouteDiscoveryServiceFileDescriptorSupplier
      extends RouteDiscoveryServiceBaseDescriptorSupplier {
    RouteDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class RouteDiscoveryServiceMethodDescriptorSupplier
      extends RouteDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RouteDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RouteDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouteDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getStreamRoutesMethod())
              .addMethod(getDeltaRoutesMethod())
              .addMethod(getFetchRoutesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
