// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/retry/host/omit_host_metadata/v3/omit_host_metadata_config.proto

package io.envoyproxy.envoy.extensions.retry.host.omit_host_metadata.v3;

public interface OmitHostMetadataConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.retry.host.omit_host_metadata.v3.OmitHostMetadataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Retry host predicate metadata match criteria. The hosts in
   * the upstream cluster with matching metadata will be omitted while
   * attempting a retry of a failed request. The metadata should be specified
   * under the *envoy.lb* key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 1;</code>
   * @return Whether the metadataMatch field is set.
   */
  boolean hasMetadataMatch();
  /**
   * <pre>
   * Retry host predicate metadata match criteria. The hosts in
   * the upstream cluster with matching metadata will be omitted while
   * attempting a retry of a failed request. The metadata should be specified
   * under the *envoy.lb* key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 1;</code>
   * @return The metadataMatch.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadataMatch();
  /**
   * <pre>
   * Retry host predicate metadata match criteria. The hosts in
   * the upstream cluster with matching metadata will be omitted while
   * attempting a retry of a failed request. The metadata should be specified
   * under the *envoy.lb* key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataMatchOrBuilder();
}
