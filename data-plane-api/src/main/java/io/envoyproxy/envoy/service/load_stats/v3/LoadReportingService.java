// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/load_stats/v3/lrs.proto

package io.envoyproxy.envoy.service.load_stats.v3;

/**
 * Protobuf service {@code envoy.service.load_stats.v3.LoadReportingService}
 */
public  abstract class LoadReportingService
    implements com.google.protobuf.Service {
  protected LoadReportingService() {}

  public interface Interface {
    /**
     * <pre>
     * Advanced API to allow for multi-dimensional load balancing by remote
     * server. For receiving LB assignments, the steps are:
     * 1, The management server is configured with per cluster/zone/load metric
     *    capacity configuration. The capacity configuration definition is
     *    outside of the scope of this document.
     * 2. Envoy issues a standard {Stream,Fetch}Endpoints request for the clusters
     *    to balance.
     * Independently, Envoy will initiate a StreamLoadStats bidi stream with a
     * management server:
     * 1. Once a connection establishes, the management server publishes a
     *    LoadStatsResponse for all clusters it is interested in learning load
     *    stats about.
     * 2. For each cluster, Envoy load balances incoming traffic to upstream hosts
     *    based on per-zone weights and/or per-instance weights (if specified)
     *    based on intra-zone LbPolicy. This information comes from the above
     *    {Stream,Fetch}Endpoints.
     * 3. When upstream hosts reply, they optionally add header &lt;define header
     *    name&gt; with ASCII representation of EndpointLoadMetricStats.
     * 4. Envoy aggregates load reports over the period of time given to it in
     *    LoadStatsResponse.load_reporting_interval. This includes aggregation
     *    stats Envoy maintains by itself (total_requests, rpc_errors etc.) as
     *    well as load metrics from upstream hosts.
     * 5. When the timer of load_reporting_interval expires, Envoy sends new
     *    LoadStatsRequest filled with load reports for each cluster.
     * 6. The management server uses the load reports from all reported Envoys
     *    from around the world, computes global assignment and prepares traffic
     *    assignment destined for each zone Envoys are located in. Goto 2.
     * </pre>
     *
     * <code>rpc StreamLoadStats(stream .envoy.service.load_stats.v3.LoadStatsRequest) returns (stream .envoy.service.load_stats.v3.LoadStatsResponse);</code>
     */
    public abstract void streamLoadStats(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new LoadReportingService() {
      @java.lang.Override
      public  void streamLoadStats(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse> done) {
        impl.streamLoadStats(controller, request, done);
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
            return impl.streamLoadStats(controller, (io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest)request);
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
            return io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest.getDefaultInstance();
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
            return io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * Advanced API to allow for multi-dimensional load balancing by remote
   * server. For receiving LB assignments, the steps are:
   * 1, The management server is configured with per cluster/zone/load metric
   *    capacity configuration. The capacity configuration definition is
   *    outside of the scope of this document.
   * 2. Envoy issues a standard {Stream,Fetch}Endpoints request for the clusters
   *    to balance.
   * Independently, Envoy will initiate a StreamLoadStats bidi stream with a
   * management server:
   * 1. Once a connection establishes, the management server publishes a
   *    LoadStatsResponse for all clusters it is interested in learning load
   *    stats about.
   * 2. For each cluster, Envoy load balances incoming traffic to upstream hosts
   *    based on per-zone weights and/or per-instance weights (if specified)
   *    based on intra-zone LbPolicy. This information comes from the above
   *    {Stream,Fetch}Endpoints.
   * 3. When upstream hosts reply, they optionally add header &lt;define header
   *    name&gt; with ASCII representation of EndpointLoadMetricStats.
   * 4. Envoy aggregates load reports over the period of time given to it in
   *    LoadStatsResponse.load_reporting_interval. This includes aggregation
   *    stats Envoy maintains by itself (total_requests, rpc_errors etc.) as
   *    well as load metrics from upstream hosts.
   * 5. When the timer of load_reporting_interval expires, Envoy sends new
   *    LoadStatsRequest filled with load reports for each cluster.
   * 6. The management server uses the load reports from all reported Envoys
   *    from around the world, computes global assignment and prepares traffic
   *    assignment destined for each zone Envoys are located in. Goto 2.
   * </pre>
   *
   * <code>rpc StreamLoadStats(stream .envoy.service.load_stats.v3.LoadStatsRequest) returns (stream .envoy.service.load_stats.v3.LoadStatsResponse);</code>
   */
  public abstract void streamLoadStats(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.load_stats.v3.LrsProto.getDescriptor().getServices().get(0);
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
        this.streamLoadStats(controller, (io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse>specializeCallback(
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
        return io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest.getDefaultInstance();
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
        return io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.envoyproxy.envoy.service.load_stats.v3.LoadReportingService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamLoadStats(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.class,
          io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse streamLoadStats(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse streamLoadStats(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.load_stats.v3.LoadStatsResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:envoy.service.load_stats.v3.LoadReportingService)
}
