package io.envoyproxy.envoy.service.endpoint.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/endpoint/v3/eds.proto")
public final class EndpointDiscoveryServiceGrpc {

  private EndpointDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.endpoint.v3.EndpointDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEndpoints",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamEndpointsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getStreamEndpointsMethod;
    if ((getStreamEndpointsMethod = EndpointDiscoveryServiceGrpc.getStreamEndpointsMethod) == null) {
      synchronized (EndpointDiscoveryServiceGrpc.class) {
        if ((getStreamEndpointsMethod = EndpointDiscoveryServiceGrpc.getStreamEndpointsMethod) == null) {
          EndpointDiscoveryServiceGrpc.getStreamEndpointsMethod = getStreamEndpointsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointDiscoveryServiceMethodDescriptorSupplier("StreamEndpoints"))
              .build();
        }
      }
    }
    return getStreamEndpointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeltaEndpoints",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaEndpointsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> getDeltaEndpointsMethod;
    if ((getDeltaEndpointsMethod = EndpointDiscoveryServiceGrpc.getDeltaEndpointsMethod) == null) {
      synchronized (EndpointDiscoveryServiceGrpc.class) {
        if ((getDeltaEndpointsMethod = EndpointDiscoveryServiceGrpc.getDeltaEndpointsMethod) == null) {
          EndpointDiscoveryServiceGrpc.getDeltaEndpointsMethod = getDeltaEndpointsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeltaEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointDiscoveryServiceMethodDescriptorSupplier("DeltaEndpoints"))
              .build();
        }
      }
    }
    return getDeltaEndpointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchEndpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchEndpoints",
      requestType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.class,
      responseType = io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchEndpointsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> getFetchEndpointsMethod;
    if ((getFetchEndpointsMethod = EndpointDiscoveryServiceGrpc.getFetchEndpointsMethod) == null) {
      synchronized (EndpointDiscoveryServiceGrpc.class) {
        if ((getFetchEndpointsMethod = EndpointDiscoveryServiceGrpc.getFetchEndpointsMethod) == null) {
          EndpointDiscoveryServiceGrpc.getFetchEndpointsMethod = getFetchEndpointsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest, io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchEndpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EndpointDiscoveryServiceMethodDescriptorSupplier("FetchEndpoints"))
              .build();
        }
      }
    }
    return getFetchEndpointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EndpointDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceStub>() {
        @java.lang.Override
        public EndpointDiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointDiscoveryServiceStub(channel, callOptions);
        }
      };
    return EndpointDiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EndpointDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public EndpointDiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointDiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return EndpointDiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EndpointDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EndpointDiscoveryServiceFutureStub>() {
        @java.lang.Override
        public EndpointDiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EndpointDiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return EndpointDiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EndpointDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The resource_names field in DiscoveryRequest specifies a list of clusters
     * to subscribe to updates for.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamEndpoints(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamEndpointsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaEndpoints(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDeltaEndpointsMethod(), responseObserver);
    }

    /**
     */
    public void fetchEndpoints(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchEndpointsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamEndpointsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_STREAM_ENDPOINTS)))
          .addMethod(
            getDeltaEndpointsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>(
                  this, METHODID_DELTA_ENDPOINTS)))
          .addMethod(
            getFetchEndpointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest,
                io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>(
                  this, METHODID_FETCH_ENDPOINTS)))
          .build();
    }
  }

  /**
   */
  public static final class EndpointDiscoveryServiceStub extends io.grpc.stub.AbstractAsyncStub<EndpointDiscoveryServiceStub> {
    private EndpointDiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointDiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointDiscoveryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * The resource_names field in DiscoveryRequest specifies a list of clusters
     * to subscribe to updates for.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest> streamEndpoints(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamEndpointsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest> deltaEndpoints(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDeltaEndpointsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void fetchEndpoints(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchEndpointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EndpointDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EndpointDiscoveryServiceBlockingStub> {
    private EndpointDiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointDiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchEndpoints(io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchEndpointsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EndpointDiscoveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EndpointDiscoveryServiceFutureStub> {
    private EndpointDiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EndpointDiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EndpointDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> fetchEndpoints(
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchEndpointsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_ENDPOINTS = 0;
  private static final int METHODID_STREAM_ENDPOINTS = 1;
  private static final int METHODID_DELTA_ENDPOINTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EndpointDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EndpointDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_ENDPOINTS:
          serviceImpl.fetchEndpoints((io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest) request,
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
        case METHODID_STREAM_ENDPOINTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamEndpoints(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>) responseObserver);
        case METHODID_DELTA_ENDPOINTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deltaEndpoints(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EndpointDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EndpointDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.endpoint.v3.EdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EndpointDiscoveryService");
    }
  }

  private static final class EndpointDiscoveryServiceFileDescriptorSupplier
      extends EndpointDiscoveryServiceBaseDescriptorSupplier {
    EndpointDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class EndpointDiscoveryServiceMethodDescriptorSupplier
      extends EndpointDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EndpointDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EndpointDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EndpointDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getStreamEndpointsMethod())
              .addMethod(getDeltaEndpointsMethod())
              .addMethod(getFetchEndpointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
