package io.envoyproxy.envoy.service.route.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Scoped Routes Discovery Service (SRDS) API distributes
 * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
 * resources. Each ScopedRouteConfiguration resource represents a "routing
 * scope" containing a mapping that allows the HTTP connection manager to
 * dynamically assign a routing table (specified via a
 * :ref:`RouteConfiguration&lt;envoy_api_msg_config.route.v3.RouteConfiguration&gt;` message) to each
 * HTTP request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/route/v3/srds.proto")
public final class ScopedRoutesDiscoveryServiceGrpc {

  private ScopedRoutesDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.route.v3.ScopedRoutesDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamScopedRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamScopedRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamScopedRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamScopedRoutesMethod;
    if ((getStreamScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getStreamScopedRoutesMethod) == null) {
      synchronized (ScopedRoutesDiscoveryServiceGrpc.class) {
        if ((getStreamScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getStreamScopedRoutesMethod) == null) {
          ScopedRoutesDiscoveryServiceGrpc.getStreamScopedRoutesMethod = getStreamScopedRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamScopedRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScopedRoutesDiscoveryServiceMethodDescriptorSupplier("StreamScopedRoutes"))
              .build();
        }
      }
    }
    return getStreamScopedRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaScopedRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeltaScopedRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaScopedRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaScopedRoutesMethod;
    if ((getDeltaScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getDeltaScopedRoutesMethod) == null) {
      synchronized (ScopedRoutesDiscoveryServiceGrpc.class) {
        if ((getDeltaScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getDeltaScopedRoutesMethod) == null) {
          ScopedRoutesDiscoveryServiceGrpc.getDeltaScopedRoutesMethod = getDeltaScopedRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeltaScopedRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScopedRoutesDiscoveryServiceMethodDescriptorSupplier("DeltaScopedRoutes"))
              .build();
        }
      }
    }
    return getDeltaScopedRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchScopedRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchScopedRoutes",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchScopedRoutesMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchScopedRoutesMethod;
    if ((getFetchScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getFetchScopedRoutesMethod) == null) {
      synchronized (ScopedRoutesDiscoveryServiceGrpc.class) {
        if ((getFetchScopedRoutesMethod = ScopedRoutesDiscoveryServiceGrpc.getFetchScopedRoutesMethod) == null) {
          ScopedRoutesDiscoveryServiceGrpc.getFetchScopedRoutesMethod = getFetchScopedRoutesMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchScopedRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScopedRoutesDiscoveryServiceMethodDescriptorSupplier("FetchScopedRoutes"))
              .build();
        }
      }
    }
    return getFetchScopedRoutesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScopedRoutesDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceStub>() {
        @java.lang.Override
        public ScopedRoutesDiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScopedRoutesDiscoveryServiceStub(channel, callOptions);
        }
      };
    return ScopedRoutesDiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScopedRoutesDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public ScopedRoutesDiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScopedRoutesDiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return ScopedRoutesDiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScopedRoutesDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScopedRoutesDiscoveryServiceFutureStub>() {
        @java.lang.Override
        public ScopedRoutesDiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScopedRoutesDiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return ScopedRoutesDiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Scoped Routes Discovery Service (SRDS) API distributes
   * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
   * resources. Each ScopedRouteConfiguration resource represents a "routing
   * scope" containing a mapping that allows the HTTP connection manager to
   * dynamically assign a routing table (specified via a
   * :ref:`RouteConfiguration&lt;envoy_api_msg_config.route.v3.RouteConfiguration&gt;` message) to each
   * HTTP request.
   * </pre>
   */
  public static abstract class ScopedRoutesDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamScopedRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamScopedRoutesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaScopedRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDeltaScopedRoutesMethod(), responseObserver);
    }

    /**
     */
    public void fetchScopedRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchScopedRoutesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamScopedRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_STREAM_SCOPED_ROUTES)))
          .addMethod(
            getDeltaScopedRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>(
                  this, METHODID_DELTA_SCOPED_ROUTES)))
          .addMethod(
            getFetchScopedRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_FETCH_SCOPED_ROUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * The Scoped Routes Discovery Service (SRDS) API distributes
   * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
   * resources. Each ScopedRouteConfiguration resource represents a "routing
   * scope" containing a mapping that allows the HTTP connection manager to
   * dynamically assign a routing table (specified via a
   * :ref:`RouteConfiguration&lt;envoy_api_msg_config.route.v3.RouteConfiguration&gt;` message) to each
   * HTTP request.
   * </pre>
   */
  public static final class ScopedRoutesDiscoveryServiceStub extends io.grpc.stub.AbstractAsyncStub<ScopedRoutesDiscoveryServiceStub> {
    private ScopedRoutesDiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedRoutesDiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScopedRoutesDiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamScopedRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamScopedRoutesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaScopedRoutes(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDeltaScopedRoutesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void fetchScopedRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchScopedRoutesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Scoped Routes Discovery Service (SRDS) API distributes
   * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
   * resources. Each ScopedRouteConfiguration resource represents a "routing
   * scope" containing a mapping that allows the HTTP connection manager to
   * dynamically assign a routing table (specified via a
   * :ref:`RouteConfiguration&lt;envoy_api_msg_config.route.v3.RouteConfiguration&gt;` message) to each
   * HTTP request.
   * </pre>
   */
  public static final class ScopedRoutesDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScopedRoutesDiscoveryServiceBlockingStub> {
    private ScopedRoutesDiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedRoutesDiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScopedRoutesDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchScopedRoutes(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchScopedRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Scoped Routes Discovery Service (SRDS) API distributes
   * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
   * resources. Each ScopedRouteConfiguration resource represents a "routing
   * scope" containing a mapping that allows the HTTP connection manager to
   * dynamically assign a routing table (specified via a
   * :ref:`RouteConfiguration&lt;envoy_api_msg_config.route.v3.RouteConfiguration&gt;` message) to each
   * HTTP request.
   * </pre>
   */
  public static final class ScopedRoutesDiscoveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ScopedRoutesDiscoveryServiceFutureStub> {
    private ScopedRoutesDiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScopedRoutesDiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScopedRoutesDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> fetchScopedRoutes(
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchScopedRoutesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_SCOPED_ROUTES = 0;
  private static final int METHODID_STREAM_SCOPED_ROUTES = 1;
  private static final int METHODID_DELTA_SCOPED_ROUTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScopedRoutesDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScopedRoutesDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_SCOPED_ROUTES:
          serviceImpl.fetchScopedRoutes((io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest) request,
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
        case METHODID_STREAM_SCOPED_ROUTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamScopedRoutes(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>) responseObserver);
        case METHODID_DELTA_SCOPED_ROUTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deltaScopedRoutes(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ScopedRoutesDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScopedRoutesDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.route.v3.SrdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScopedRoutesDiscoveryService");
    }
  }

  private static final class ScopedRoutesDiscoveryServiceFileDescriptorSupplier
      extends ScopedRoutesDiscoveryServiceBaseDescriptorSupplier {
    ScopedRoutesDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class ScopedRoutesDiscoveryServiceMethodDescriptorSupplier
      extends ScopedRoutesDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScopedRoutesDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScopedRoutesDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScopedRoutesDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getStreamScopedRoutesMethod())
              .addMethod(getDeltaScopedRoutesMethod())
              .addMethod(getFetchScopedRoutesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
