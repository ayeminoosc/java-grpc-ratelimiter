package io.envoyproxy.envoy.service.tap.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * [#not-implemented-hide:] A tap service to receive incoming taps. Envoy will call
 * StreamTaps to deliver captured taps to the server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/tap/v3/tap.proto")
public final class TapSinkServiceGrpc {

  private TapSinkServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.tap.v3.TapSinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest,
      io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse> getStreamTapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTaps",
      requestType = io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest.class,
      responseType = io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest,
      io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse> getStreamTapsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest, io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse> getStreamTapsMethod;
    if ((getStreamTapsMethod = TapSinkServiceGrpc.getStreamTapsMethod) == null) {
      synchronized (TapSinkServiceGrpc.class) {
        if ((getStreamTapsMethod = TapSinkServiceGrpc.getStreamTapsMethod) == null) {
          TapSinkServiceGrpc.getStreamTapsMethod = getStreamTapsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest, io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TapSinkServiceMethodDescriptorSupplier("StreamTaps"))
              .build();
        }
      }
    }
    return getStreamTapsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TapSinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceStub>() {
        @java.lang.Override
        public TapSinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TapSinkServiceStub(channel, callOptions);
        }
      };
    return TapSinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TapSinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceBlockingStub>() {
        @java.lang.Override
        public TapSinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TapSinkServiceBlockingStub(channel, callOptions);
        }
      };
    return TapSinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TapSinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TapSinkServiceFutureStub>() {
        @java.lang.Override
        public TapSinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TapSinkServiceFutureStub(channel, callOptions);
        }
      };
    return TapSinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * [#not-implemented-hide:] A tap service to receive incoming taps. Envoy will call
   * StreamTaps to deliver captured taps to the server
   * </pre>
   */
  public static abstract class TapSinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Envoy will connect and send StreamTapsRequest messages forever. It does not expect any
     * response to be sent as nothing would be done in the case of failure. The server should
     * disconnect if it expects Envoy to reconnect.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest> streamTaps(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamTapsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamTapsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest,
                io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse>(
                  this, METHODID_STREAM_TAPS)))
          .build();
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:] A tap service to receive incoming taps. Envoy will call
   * StreamTaps to deliver captured taps to the server
   * </pre>
   */
  public static final class TapSinkServiceStub extends io.grpc.stub.AbstractAsyncStub<TapSinkServiceStub> {
    private TapSinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TapSinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TapSinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envoy will connect and send StreamTapsRequest messages forever. It does not expect any
     * response to be sent as nothing would be done in the case of failure. The server should
     * disconnect if it expects Envoy to reconnect.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest> streamTaps(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamTapsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:] A tap service to receive incoming taps. Envoy will call
   * StreamTaps to deliver captured taps to the server
   * </pre>
   */
  public static final class TapSinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TapSinkServiceBlockingStub> {
    private TapSinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TapSinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TapSinkServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:] A tap service to receive incoming taps. Envoy will call
   * StreamTaps to deliver captured taps to the server
   * </pre>
   */
  public static final class TapSinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TapSinkServiceFutureStub> {
    private TapSinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TapSinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TapSinkServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_TAPS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TapSinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TapSinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_TAPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamTaps(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.tap.v3.StreamTapsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TapSinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TapSinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.tap.v3.TapProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TapSinkService");
    }
  }

  private static final class TapSinkServiceFileDescriptorSupplier
      extends TapSinkServiceBaseDescriptorSupplier {
    TapSinkServiceFileDescriptorSupplier() {}
  }

  private static final class TapSinkServiceMethodDescriptorSupplier
      extends TapSinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TapSinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TapSinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TapSinkServiceFileDescriptorSupplier())
              .addMethod(getStreamTapsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
