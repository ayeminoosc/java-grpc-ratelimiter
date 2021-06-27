package io.envoyproxy.envoy.service.event_reporting.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * [#not-implemented-hide:]
 * Service for streaming different types of events from Envoy to a server. The examples of
 * such events may be health check or outlier detection events.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: envoy/service/event_reporting/v3/event_reporting_service.proto")
public final class EventReportingServiceGrpc {

  private EventReportingServiceGrpc() {}

  public static final String SERVICE_NAME = "envoy.service.event_reporting.v3.EventReportingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest,
      io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse> getStreamEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEvents",
      requestType = io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest.class,
      responseType = io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest,
      io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse> getStreamEventsMethod() {
    io.grpc.MethodDescriptor<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest, io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse> getStreamEventsMethod;
    if ((getStreamEventsMethod = EventReportingServiceGrpc.getStreamEventsMethod) == null) {
      synchronized (EventReportingServiceGrpc.class) {
        if ((getStreamEventsMethod = EventReportingServiceGrpc.getStreamEventsMethod) == null) {
          EventReportingServiceGrpc.getStreamEventsMethod = getStreamEventsMethod =
              io.grpc.MethodDescriptor.<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest, io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventReportingServiceMethodDescriptorSupplier("StreamEvents"))
              .build();
        }
      }
    }
    return getStreamEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventReportingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceStub>() {
        @java.lang.Override
        public EventReportingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventReportingServiceStub(channel, callOptions);
        }
      };
    return EventReportingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventReportingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceBlockingStub>() {
        @java.lang.Override
        public EventReportingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventReportingServiceBlockingStub(channel, callOptions);
        }
      };
    return EventReportingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventReportingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventReportingServiceFutureStub>() {
        @java.lang.Override
        public EventReportingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventReportingServiceFutureStub(channel, callOptions);
        }
      };
    return EventReportingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Service for streaming different types of events from Envoy to a server. The examples of
   * such events may be health check or outlier detection events.
   * </pre>
   */
  public static abstract class EventReportingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Envoy will connect and send StreamEventsRequest messages forever.
     * The management server may send StreamEventsResponse to configure event stream. See below.
     * This API is designed for high throughput with the expectation that it might be lossy.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest> streamEvents(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamEventsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest,
                io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse>(
                  this, METHODID_STREAM_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Service for streaming different types of events from Envoy to a server. The examples of
   * such events may be health check or outlier detection events.
   * </pre>
   */
  public static final class EventReportingServiceStub extends io.grpc.stub.AbstractAsyncStub<EventReportingServiceStub> {
    private EventReportingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventReportingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventReportingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envoy will connect and send StreamEventsRequest messages forever.
     * The management server may send StreamEventsResponse to configure event stream. See below.
     * This API is designed for high throughput with the expectation that it might be lossy.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest> streamEvents(
        io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamEventsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Service for streaming different types of events from Envoy to a server. The examples of
   * such events may be health check or outlier detection events.
   * </pre>
   */
  public static final class EventReportingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventReportingServiceBlockingStub> {
    private EventReportingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventReportingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventReportingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Service for streaming different types of events from Envoy to a server. The examples of
   * such events may be health check or outlier detection events.
   * </pre>
   */
  public static final class EventReportingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventReportingServiceFutureStub> {
    private EventReportingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventReportingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventReportingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_EVENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventReportingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventReportingServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_STREAM_EVENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamEvents(
              (io.grpc.stub.StreamObserver<io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventReportingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventReportingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.envoyproxy.envoy.service.event_reporting.v3.EventReportingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventReportingService");
    }
  }

  private static final class EventReportingServiceFileDescriptorSupplier
      extends EventReportingServiceBaseDescriptorSupplier {
    EventReportingServiceFileDescriptorSupplier() {}
  }

  private static final class EventReportingServiceMethodDescriptorSupplier
      extends EventReportingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventReportingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventReportingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventReportingServiceFileDescriptorSupplier())
              .addMethod(getStreamEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
