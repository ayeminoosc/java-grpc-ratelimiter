// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/route/v3/rds.proto

package io.envoyproxy.envoy.service.route.v3;

/**
 * <pre>
 * The resource_names field in DiscoveryRequest specifies a route configuration.
 * This allows an Envoy configuration with multiple HTTP listeners (and
 * associated HTTP connection manager filters) to use different route
 * configurations. Each listener will bind its HTTP connection manager filter to
 * a route table via this identifier.
 * </pre>
 *
 * Protobuf service {@code envoy.service.route.v3.RouteDiscoveryService}
 */
public  abstract class RouteDiscoveryService
    implements com.google.protobuf.Service {
  protected RouteDiscoveryService() {}

  public interface Interface {
    /**
     * <code>rpc StreamRoutes(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
     */
    public abstract void streamRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

    /**
     * <code>rpc DeltaRoutes(stream .envoy.service.discovery.v3.DeltaDiscoveryRequest) returns (stream .envoy.service.discovery.v3.DeltaDiscoveryResponse);</code>
     */
    public abstract void deltaRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done);

    /**
     * <code>rpc FetchRoutes(.envoy.service.discovery.v3.DiscoveryRequest) returns (.envoy.service.discovery.v3.DiscoveryResponse) { ... }</code>
     */
    public abstract void fetchRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new RouteDiscoveryService() {
      @java.lang.Override
      public  void streamRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
        impl.streamRoutes(controller, request, done);
      }

      @java.lang.Override
      public  void deltaRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done) {
        impl.deltaRoutes(controller, request, done);
      }

      @java.lang.Override
      public  void fetchRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
        impl.fetchRoutes(controller, request, done);
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
            return impl.streamRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request);
          case 1:
            return impl.deltaRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest)request);
          case 2:
            return impl.fetchRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request);
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
          case 2:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
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
          case 2:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc StreamRoutes(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
   */
  public abstract void streamRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  /**
   * <code>rpc DeltaRoutes(stream .envoy.service.discovery.v3.DeltaDiscoveryRequest) returns (stream .envoy.service.discovery.v3.DeltaDiscoveryResponse);</code>
   */
  public abstract void deltaRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse> done);

  /**
   * <code>rpc FetchRoutes(.envoy.service.discovery.v3.DiscoveryRequest) returns (.envoy.service.discovery.v3.DiscoveryResponse) { ... }</code>
   */
  public abstract void fetchRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.route.v3.RdsProto.getDescriptor().getServices().get(0);
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
        this.streamRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>specializeCallback(
            done));
        return;
      case 1:
        this.deltaRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse>specializeCallback(
            done));
        return;
      case 2:
        this.fetchRoutes(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>specializeCallback(
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
      case 2:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
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
      case 2:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.envoyproxy.envoy.service.route.v3.RouteDiscoveryService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamRoutes(
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

    public  void deltaRoutes(
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

    public  void fetchRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;

    public io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse deltaRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException;

    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance());
    }


    public io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse deltaRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DeltaDiscoveryResponse.getDefaultInstance());
    }


    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse fetchRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:envoy.service.route.v3.RouteDiscoveryService)
}

