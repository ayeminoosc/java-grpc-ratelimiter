package io.envoyproxy.envoy.service.accesslog.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for streaming access logs from Envoy to an access log server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/accesslog/v3/als.proto")
public final class AccessLogServiceGrpc {

  private AccessLogServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.accesslog.v3.AccessLogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
      io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAccessLogs",
      requestType = io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.class,
      responseType = io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
      io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage, io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> getStreamAccessLogsMethod;
    if ((getStreamAccessLogsMethod = AccessLogServiceGrpc.getStreamAccessLogsMethod) == null) {
      synchronized (AccessLogServiceGrpc.class) {
        if ((getStreamAccessLogsMethod = AccessLogServiceGrpc.getStreamAccessLogsMethod) == null) {
          AccessLogServiceGrpc.getStreamAccessLogsMethod = getStreamAccessLogsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage, io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAccessLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessLogServiceMethodDescriptorSupplier("StreamAccessLogs"))
              .build();
        }
      }
    }
    return getStreamAccessLogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessLogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceStub>() {
        @java.lang.Override
        public AccessLogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessLogServiceStub(channel, callOptions);
        }
      };
    return AccessLogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessLogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceBlockingStub>() {
        @java.lang.Override
        public AccessLogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessLogServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessLogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessLogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessLogServiceFutureStub>() {
        @java.lang.Override
        public AccessLogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessLogServiceFutureStub(channel, callOptions);
        }
      };
    return AccessLogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for streaming access logs from Envoy to an access log server.
   * </pre>
   */
  public static abstract class AccessLogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Envoy will connect and send StreamAccessLogsMessage messages forever. It does not expect any
     * response to be sent as nothing would be done in the case of failure. The server should
     * disconnect if it expects Envoy to reconnect. In the future we may decide to add a different
     * API for "critical" access logs in which Envoy will buffer access logs for some period of time
     * until it gets an ACK so it could then retry. This API is designed for high throughput with the
     * expectation that it might be lossy.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage> streamAccessLogs(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamAccessLogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamAccessLogsMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage,
                io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>(
                  this, METHODID_STREAM_ACCESS_LOGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for streaming access logs from Envoy to an access log server.
   * </pre>
   */
  public static final class AccessLogServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessLogServiceStub> {
    private AccessLogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessLogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessLogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envoy will connect and send StreamAccessLogsMessage messages forever. It does not expect any
     * response to be sent as nothing would be done in the case of failure. The server should
     * disconnect if it expects Envoy to reconnect. In the future we may decide to add a different
     * API for "critical" access logs in which Envoy will buffer access logs for some period of time
     * until it gets an ACK so it could then retry. This API is designed for high throughput with the
     * expectation that it might be lossy.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsMessage> streamAccessLogs(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamAccessLogsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service for streaming access logs from Envoy to an access log server.
   * </pre>
   */
  public static final class AccessLogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessLogServiceBlockingStub> {
    private AccessLogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessLogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessLogServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service for streaming access logs from Envoy to an access log server.
   * </pre>
   */
  public static final class AccessLogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessLogServiceFutureStub> {
    private AccessLogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessLogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessLogServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_ACCESS_LOGS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessLogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessLogServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_STREAM_ACCESS_LOGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamAccessLogs(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.accesslog.v3.StreamAccessLogsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AccessLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessLogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.accesslog.v3.AlsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessLogService");
    }
  }

  private static final class AccessLogServiceFileDescriptorSupplier
      extends AccessLogServiceBaseDescriptorSupplier {
    AccessLogServiceFileDescriptorSupplier() {}
  }

  private static final class AccessLogServiceMethodDescriptorSupplier
      extends AccessLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessLogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessLogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessLogServiceFileDescriptorSupplier())
              .addMethod(getStreamAccessLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
