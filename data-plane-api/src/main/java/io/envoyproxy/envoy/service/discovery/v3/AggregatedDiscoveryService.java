// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v3/ads.proto

package io.envoyproxy.envoy.service.discovery.v3;

/**
 * <pre>
 * See https://github.com/lyft/envoy-api#apis for a description of the role of
 * ADS and how it is intended to be used by a management server. ADS requests
 * have the same structure as their singleton xDS counterparts, but can
 * multiplex many resource types on a single stream. The type_url in the
 * DiscoveryRequest/DiscoveryResponse provides sufficient information to recover
 * the multiplexed singleton APIs at the Envoy instance and management server.
 * </pre>
 *
 * Protobuf service {@code envoy.service.discovery.v3.AggregatedDiscoveryService}
 */
public  abstract class AggregatedDiscoveryService
    implements com.google.protobuf.Service {
  protected AggregatedDiscoveryService() {}

  public interface Interface {
    /**
     * <pre>
     * This is a gRPC-only API.
     * </pre>
     *
     * <code>rpc StreamAggregatedResources(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
     */
    public abstract void streamAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

    /**
     * <code>rpc DeltaAggregatedResources(stream .envoy.service.discovery.v3.DeltaDiscoveryRequest) returns (stream .envoy.service.discovery.v3.DeltaDiscoveryResponse);</code>
     */
    public abstract void deltaAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new AggregatedDiscoveryService() {
      @java.lang.Override
      public  void streamAggregatedResources(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
        impl.streamAggregatedResources(controller, request, done);
      }

      @java.lang.Override
      public  void deltaAggregatedResources(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done) {
        impl.deltaAggregatedResources(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.streamAggregatedResources(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request);
          case 1:
            return impl.deltaAggregatedResources(controller, (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
          case 1:
            return io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
          case 1:
            return io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * This is a gRPC-only API.
   * </pre>
   *
   * <code>rpc StreamAggregatedResources(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
   */
  public abstract void streamAggregatedResources(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  /**
   * <code>rpc DeltaAggregatedResources(stream .envoy.service.discovery.v3.DeltaDiscoveryRequest) returns (stream .envoy.service.discovery.v3.DeltaDiscoveryResponse);</code>
   */
  public abstract void deltaAggregatedResources(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.discovery.v3.AdsProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.streamAggregatedResources(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>specializeCallback(
            done));
        return;
      case 1:
        this.deltaAggregatedResources(controller, (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
      case 1:
        return io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
      case 1:
        return io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.envoyproxy.envoy.service.discovery.v3.AggregatedDiscoveryService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()));
    }

    public  void deltaAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.class,
          io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;

    public io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse deltaAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance());
    }


    public io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse deltaAggregatedResources(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:envoy.service.discovery.v3.AggregatedDiscoveryService)
}
