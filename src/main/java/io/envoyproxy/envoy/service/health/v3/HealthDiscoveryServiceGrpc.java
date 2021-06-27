package io.envoyproxy.envoy.service.health.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HDS is Health Discovery Service. It compliments Envoy’s health checking
 * service by designating this Envoy to be a healthchecker for a subset of hosts
 * in the cluster. The status of these health checks will be reported to the
 * management server, where it can be aggregated etc and redistributed back to
 * Envoy through EDS.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/health/v3/hds.proto")
public final class HealthDiscoveryServiceGrpc {

  private HealthDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.health.v3.HealthDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
      io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getStreamHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamHealthCheck",
      requestType = io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse.class,
      responseType = io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
      io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getStreamHealthCheckMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse, io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getStreamHealthCheckMethod;
    if ((getStreamHealthCheckMethod = HealthDiscoveryServiceGrpc.getStreamHealthCheckMethod) == null) {
      synchronized (HealthDiscoveryServiceGrpc.class) {
        if ((getStreamHealthCheckMethod = HealthDiscoveryServiceGrpc.getStreamHealthCheckMethod) == null) {
          HealthDiscoveryServiceGrpc.getStreamHealthCheckMethod = getStreamHealthCheckMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse, io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamHealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier.getDefaultInstance()))
              .setSchemaDescriptor(new HealthDiscoveryServiceMethodDescriptorSupplier("StreamHealthCheck"))
              .build();
        }
      }
    }
    return getStreamHealthCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
      io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getFetchHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchHealthCheck",
      requestType = io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse.class,
      responseType = io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
      io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getFetchHealthCheckMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse, io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> getFetchHealthCheckMethod;
    if ((getFetchHealthCheckMethod = HealthDiscoveryServiceGrpc.getFetchHealthCheckMethod) == null) {
      synchronized (HealthDiscoveryServiceGrpc.class) {
        if ((getFetchHealthCheckMethod = HealthDiscoveryServiceGrpc.getFetchHealthCheckMethod) == null) {
          HealthDiscoveryServiceGrpc.getFetchHealthCheckMethod = getFetchHealthCheckMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse, io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchHealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier.getDefaultInstance()))
              .setSchemaDescriptor(new HealthDiscoveryServiceMethodDescriptorSupplier("FetchHealthCheck"))
              .build();
        }
      }
    }
    return getFetchHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceStub>() {
        @java.lang.Override
        public HealthDiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthDiscoveryServiceStub(channel, callOptions);
        }
      };
    return HealthDiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public HealthDiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthDiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return HealthDiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthDiscoveryServiceFutureStub>() {
        @java.lang.Override
        public HealthDiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthDiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return HealthDiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HDS is Health Discovery Service. It compliments Envoy’s health checking
   * service by designating this Envoy to be a healthchecker for a subset of hosts
   * in the cluster. The status of these health checks will be reported to the
   * management server, where it can be aggregated etc and redistributed back to
   * Envoy through EDS.
   * </pre>
   */
  public static abstract class HealthDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 1. Envoy starts up and if its can_healthcheck option in the static
     *    bootstrap config is enabled, sends HealthCheckRequest to the management
     *    server. It supplies its capabilities (which protocol it can health check
     *    with, what zone it resides in, etc.).
     * 2. In response to (1), the management server designates this Envoy as a
     *    healthchecker to health check a subset of all upstream hosts for a given
     *    cluster (for example upstream Host 1 and Host 2). It streams
     *    HealthCheckSpecifier messages with cluster related configuration for all
     *    clusters this Envoy is designated to health check. Subsequent
     *    HealthCheckSpecifier message will be sent on changes to:
     *    a. Endpoints to health checks
     *    b. Per cluster configuration change
     * 3. Envoy creates a health probe based on the HealthCheck config and sends
     *    it to endpoint(ip:port) of Host 1 and 2. Based on the HealthCheck
     *    configuration Envoy waits upon the arrival of the probe response and
     *    looks at the content of the response to decide whether the endpoint is
     *    healthy or not. If a response hasn't been received within the timeout
     *    interval, the endpoint health status is considered TIMEOUT.
     * 4. Envoy reports results back in an EndpointHealthResponse message.
     *    Envoy streams responses as often as the interval configured by the
     *    management server in HealthCheckSpecifier.
     * 5. The management Server collects health statuses for all endpoints in the
     *    cluster (for all clusters) and uses this information to construct
     *    EndpointDiscoveryResponse messages.
     * 6. Once Envoy has a list of upstream endpoints to send traffic to, it load
     *    balances traffic to them without additional health checking. It may
     *    use inline healthcheck (i.e. consider endpoint UNHEALTHY if connection
     *    failed to a particular endpoint to account for health status propagation
     *    delay between HDS and EDS).
     * By default, can_healthcheck is true. If can_healthcheck is false, Cluster
     * configuration may not contain HealthCheck message.
     * TODO(htuch): How is can_healthcheck communicated to CDS to ensure the above
     * invariant?
     * TODO(htuch): Add &#64;amb67's diagram.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse> streamHealthCheck(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamHealthCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO(htuch): Unlike the gRPC version, there is no stream-based binding of
     * request/response. Should we add an identifier to the HealthCheckSpecifier
     * to bind with the response?
     * </pre>
     */
    public void fetchHealthCheck(io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchHealthCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamHealthCheckMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
                io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>(
                  this, METHODID_STREAM_HEALTH_CHECK)))
          .addMethod(
            getFetchHealthCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse,
                io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>(
                  this, METHODID_FETCH_HEALTH_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * HDS is Health Discovery Service. It compliments Envoy’s health checking
   * service by designating this Envoy to be a healthchecker for a subset of hosts
   * in the cluster. The status of these health checks will be reported to the
   * management server, where it can be aggregated etc and redistributed back to
   * Envoy through EDS.
   * </pre>
   */
  public static final class HealthDiscoveryServiceStub extends io.grpc.stub.AbstractAsyncStub<HealthDiscoveryServiceStub> {
    private HealthDiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthDiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthDiscoveryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1. Envoy starts up and if its can_healthcheck option in the static
     *    bootstrap config is enabled, sends HealthCheckRequest to the management
     *    server. It supplies its capabilities (which protocol it can health check
     *    with, what zone it resides in, etc.).
     * 2. In response to (1), the management server designates this Envoy as a
     *    healthchecker to health check a subset of all upstream hosts for a given
     *    cluster (for example upstream Host 1 and Host 2). It streams
     *    HealthCheckSpecifier messages with cluster related configuration for all
     *    clusters this Envoy is designated to health check. Subsequent
     *    HealthCheckSpecifier message will be sent on changes to:
     *    a. Endpoints to health checks
     *    b. Per cluster configuration change
     * 3. Envoy creates a health probe based on the HealthCheck config and sends
     *    it to endpoint(ip:port) of Host 1 and 2. Based on the HealthCheck
     *    configuration Envoy waits upon the arrival of the probe response and
     *    looks at the content of the response to decide whether the endpoint is
     *    healthy or not. If a response hasn't been received within the timeout
     *    interval, the endpoint health status is considered TIMEOUT.
     * 4. Envoy reports results back in an EndpointHealthResponse message.
     *    Envoy streams responses as often as the interval configured by the
     *    management server in HealthCheckSpecifier.
     * 5. The management Server collects health statuses for all endpoints in the
     *    cluster (for all clusters) and uses this information to construct
     *    EndpointDiscoveryResponse messages.
     * 6. Once Envoy has a list of upstream endpoints to send traffic to, it load
     *    balances traffic to them without additional health checking. It may
     *    use inline healthcheck (i.e. consider endpoint UNHEALTHY if connection
     *    failed to a particular endpoint to account for health status propagation
     *    delay between HDS and EDS).
     * By default, can_healthcheck is true. If can_healthcheck is false, Cluster
     * configuration may not contain HealthCheck message.
     * TODO(htuch): How is can_healthcheck communicated to CDS to ensure the above
     * invariant?
     * TODO(htuch): Add &#64;amb67's diagram.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse> streamHealthCheck(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamHealthCheckMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * TODO(htuch): Unlike the gRPC version, there is no stream-based binding of
     * request/response. Should we add an identifier to the HealthCheckSpecifier
     * to bind with the response?
     * </pre>
     */
    public void fetchHealthCheck(io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse request,
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * HDS is Health Discovery Service. It compliments Envoy’s health checking
   * service by designating this Envoy to be a healthchecker for a subset of hosts
   * in the cluster. The status of these health checks will be reported to the
   * management server, where it can be aggregated etc and redistributed back to
   * Envoy through EDS.
   * </pre>
   */
  public static final class HealthDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HealthDiscoveryServiceBlockingStub> {
    private HealthDiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthDiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * TODO(htuch): Unlike the gRPC version, there is no stream-based binding of
     * request/response. Should we add an identifier to the HealthCheckSpecifier
     * to bind with the response?
     * </pre>
     */
    public io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier fetchHealthCheck(io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * HDS is Health Discovery Service. It compliments Envoy’s health checking
   * service by designating this Envoy to be a healthchecker for a subset of hosts
   * in the cluster. The status of these health checks will be reported to the
   * management server, where it can be aggregated etc and redistributed back to
   * Envoy through EDS.
   * </pre>
   */
  public static final class HealthDiscoveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HealthDiscoveryServiceFutureStub> {
    private HealthDiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthDiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * TODO(htuch): Unlike the gRPC version, there is no stream-based binding of
     * request/response. Should we add an identifier to the HealthCheckSpecifier
     * to bind with the response?
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier> fetchHealthCheck(
        io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_HEALTH_CHECK = 0;
  private static final int METHODID_STREAM_HEALTH_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_HEALTH_CHECK:
          serviceImpl.fetchHealthCheck((io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse) request,
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>) responseObserver);
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
        case METHODID_STREAM_HEALTH_CHECK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamHealthCheck(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.health.v3.HealthCheckSpecifier>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HealthDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthDiscoveryService");
    }
  }

  private static final class HealthDiscoveryServiceFileDescriptorSupplier
      extends HealthDiscoveryServiceBaseDescriptorSupplier {
    HealthDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class HealthDiscoveryServiceMethodDescriptorSupplier
      extends HealthDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getStreamHealthCheckMethod())
              .addMethod(getFetchHealthCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
