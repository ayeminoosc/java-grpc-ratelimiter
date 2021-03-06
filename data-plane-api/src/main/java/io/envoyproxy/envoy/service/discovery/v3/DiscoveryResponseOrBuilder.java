// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v3/discovery.proto

package io.envoyproxy.envoy.service.discovery.v3;

public interface DiscoveryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.discovery.v3.DiscoveryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The version of the response data.
   * </pre>
   *
   * <code>string version_info = 1;</code>
   * @return The versionInfo.
   */
  java.lang.String getVersionInfo();
  /**
   * <pre>
   * The version of the response data.
   * </pre>
   *
   * <code>string version_info = 1;</code>
   * @return The bytes for versionInfo.
   */
  com.google.protobuf.ByteString
      getVersionInfoBytes();

  /**
   * <pre>
   * The response resources. These resources are typed and depend on the API being called.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any resources = 2;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getResourcesList();
  /**
   * <pre>
   * The response resources. These resources are typed and depend on the API being called.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any resources = 2;</code>
   */
  com.google.protobuf.Any getResources(int index);
  /**
   * <pre>
   * The response resources. These resources are typed and depend on the API being called.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any resources = 2;</code>
   */
  int getResourcesCount();
  /**
   * <pre>
   * The response resources. These resources are typed and depend on the API being called.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any resources = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <pre>
   * The response resources. These resources are typed and depend on the API being called.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any resources = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * [#not-implemented-hide:]
   * Canary is used to support two Envoy command line flags:
   * * --terminate-on-canary-transition-failure. When set, Envoy is able to
   *   terminate if it detects that configuration is stuck at canary. Consider
   *   this example sequence of updates:
   *   - Management server applies a canary config successfully.
   *   - Management server rolls back to a production config.
   *   - Envoy rejects the new production config.
   *   Since there is no sensible way to continue receiving configuration
   *   updates, Envoy will then terminate and apply production config from a
   *   clean slate.
   * * --dry-run-canary. When set, a canary response will never be applied, only
   *   validated via a dry run.
   * </pre>
   *
   * <code>bool canary = 3;</code>
   * @return The canary.
   */
  boolean getCanary();

  /**
   * <pre>
   * Type URL for resources. Identifies the xDS API when muxing over ADS.
   * Must be consistent with the type_url in the 'resources' repeated Any (if non-empty).
   * </pre>
   *
   * <code>string type_url = 4;</code>
   * @return The typeUrl.
   */
  java.lang.String getTypeUrl();
  /**
   * <pre>
   * Type URL for resources. Identifies the xDS API when muxing over ADS.
   * Must be consistent with the type_url in the 'resources' repeated Any (if non-empty).
   * </pre>
   *
   * <code>string type_url = 4;</code>
   * @return The bytes for typeUrl.
   */
  com.google.protobuf.ByteString
      getTypeUrlBytes();

  /**
   * <pre>
   * For gRPC based subscriptions, the nonce provides a way to explicitly ack a
   * specific DiscoveryResponse in a following DiscoveryRequest. Additional
   * messages may have been sent by Envoy to the management server for the
   * previous version on the stream prior to this DiscoveryResponse, that were
   * unprocessed at response send time. The nonce allows the management server
   * to ignore any further DiscoveryRequests for the previous version until a
   * DiscoveryRequest bearing the nonce. The nonce is optional and is not
   * required for non-stream based xDS implementations.
   * </pre>
   *
   * <code>string nonce = 5;</code>
   * @return The nonce.
   */
  java.lang.String getNonce();
  /**
   * <pre>
   * For gRPC based subscriptions, the nonce provides a way to explicitly ack a
   * specific DiscoveryResponse in a following DiscoveryRequest. Additional
   * messages may have been sent by Envoy to the management server for the
   * previous version on the stream prior to this DiscoveryResponse, that were
   * unprocessed at response send time. The nonce allows the management server
   * to ignore any further DiscoveryRequests for the previous version until a
   * DiscoveryRequest bearing the nonce. The nonce is optional and is not
   * required for non-stream based xDS implementations.
   * </pre>
   *
   * <code>string nonce = 5;</code>
   * @return The bytes for nonce.
   */
  com.google.protobuf.ByteString
      getNonceBytes();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * The control plane instance that sent the response.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ControlPlane control_plane = 6;</code>
   * @return Whether the controlPlane field is set.
   */
  boolean hasControlPlane();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The control plane instance that sent the response.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ControlPlane control_plane = 6;</code>
   * @return The controlPlane.
   */
  io.envoyproxy.envoy.config.core.v3.ControlPlane getControlPlane();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The control plane instance that sent the response.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ControlPlane control_plane = 6;</code>
   */
  io.envoyproxy.envoy.config.core.v3.ControlPlaneOrBuilder getControlPlaneOrBuilder();
}
