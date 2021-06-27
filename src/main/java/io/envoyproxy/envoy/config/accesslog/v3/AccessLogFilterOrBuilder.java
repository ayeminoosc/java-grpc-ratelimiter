// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

public interface AccessLogFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.accesslog.v3.AccessLogFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status code filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.StatusCodeFilter status_code_filter = 1;</code>
   * @return Whether the statusCodeFilter field is set.
   */
  boolean hasStatusCodeFilter();
  /**
   * <pre>
   * Status code filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.StatusCodeFilter status_code_filter = 1;</code>
   * @return The statusCodeFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.StatusCodeFilter getStatusCodeFilter();
  /**
   * <pre>
   * Status code filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.StatusCodeFilter status_code_filter = 1;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.StatusCodeFilterOrBuilder getStatusCodeFilterOrBuilder();

  /**
   * <pre>
   * Duration filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.DurationFilter duration_filter = 2;</code>
   * @return Whether the durationFilter field is set.
   */
  boolean hasDurationFilter();
  /**
   * <pre>
   * Duration filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.DurationFilter duration_filter = 2;</code>
   * @return The durationFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.DurationFilter getDurationFilter();
  /**
   * <pre>
   * Duration filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.DurationFilter duration_filter = 2;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.DurationFilterOrBuilder getDurationFilterOrBuilder();

  /**
   * <pre>
   * Not health check filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.NotHealthCheckFilter not_health_check_filter = 3;</code>
   * @return Whether the notHealthCheckFilter field is set.
   */
  boolean hasNotHealthCheckFilter();
  /**
   * <pre>
   * Not health check filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.NotHealthCheckFilter not_health_check_filter = 3;</code>
   * @return The notHealthCheckFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.NotHealthCheckFilter getNotHealthCheckFilter();
  /**
   * <pre>
   * Not health check filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.NotHealthCheckFilter not_health_check_filter = 3;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.NotHealthCheckFilterOrBuilder getNotHealthCheckFilterOrBuilder();

  /**
   * <pre>
   * Traceable filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.TraceableFilter traceable_filter = 4;</code>
   * @return Whether the traceableFilter field is set.
   */
  boolean hasTraceableFilter();
  /**
   * <pre>
   * Traceable filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.TraceableFilter traceable_filter = 4;</code>
   * @return The traceableFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.TraceableFilter getTraceableFilter();
  /**
   * <pre>
   * Traceable filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.TraceableFilter traceable_filter = 4;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.TraceableFilterOrBuilder getTraceableFilterOrBuilder();

  /**
   * <pre>
   * Runtime filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.RuntimeFilter runtime_filter = 5;</code>
   * @return Whether the runtimeFilter field is set.
   */
  boolean hasRuntimeFilter();
  /**
   * <pre>
   * Runtime filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.RuntimeFilter runtime_filter = 5;</code>
   * @return The runtimeFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter getRuntimeFilter();
  /**
   * <pre>
   * Runtime filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.RuntimeFilter runtime_filter = 5;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilterOrBuilder getRuntimeFilterOrBuilder();

  /**
   * <pre>
   * And filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.AndFilter and_filter = 6;</code>
   * @return Whether the andFilter field is set.
   */
  boolean hasAndFilter();
  /**
   * <pre>
   * And filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.AndFilter and_filter = 6;</code>
   * @return The andFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.AndFilter getAndFilter();
  /**
   * <pre>
   * And filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.AndFilter and_filter = 6;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AndFilterOrBuilder getAndFilterOrBuilder();

  /**
   * <pre>
   * Or filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.OrFilter or_filter = 7;</code>
   * @return Whether the orFilter field is set.
   */
  boolean hasOrFilter();
  /**
   * <pre>
   * Or filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.OrFilter or_filter = 7;</code>
   * @return The orFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.OrFilter getOrFilter();
  /**
   * <pre>
   * Or filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.OrFilter or_filter = 7;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.OrFilterOrBuilder getOrFilterOrBuilder();

  /**
   * <pre>
   * Header filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.HeaderFilter header_filter = 8;</code>
   * @return Whether the headerFilter field is set.
   */
  boolean hasHeaderFilter();
  /**
   * <pre>
   * Header filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.HeaderFilter header_filter = 8;</code>
   * @return The headerFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.HeaderFilter getHeaderFilter();
  /**
   * <pre>
   * Header filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.HeaderFilter header_filter = 8;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.HeaderFilterOrBuilder getHeaderFilterOrBuilder();

  /**
   * <pre>
   * Response flag filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ResponseFlagFilter response_flag_filter = 9;</code>
   * @return Whether the responseFlagFilter field is set.
   */
  boolean hasResponseFlagFilter();
  /**
   * <pre>
   * Response flag filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ResponseFlagFilter response_flag_filter = 9;</code>
   * @return The responseFlagFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.ResponseFlagFilter getResponseFlagFilter();
  /**
   * <pre>
   * Response flag filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ResponseFlagFilter response_flag_filter = 9;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.ResponseFlagFilterOrBuilder getResponseFlagFilterOrBuilder();

  /**
   * <pre>
   * gRPC status filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.GrpcStatusFilter grpc_status_filter = 10;</code>
   * @return Whether the grpcStatusFilter field is set.
   */
  boolean hasGrpcStatusFilter();
  /**
   * <pre>
   * gRPC status filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.GrpcStatusFilter grpc_status_filter = 10;</code>
   * @return The grpcStatusFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.GrpcStatusFilter getGrpcStatusFilter();
  /**
   * <pre>
   * gRPC status filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.GrpcStatusFilter grpc_status_filter = 10;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.GrpcStatusFilterOrBuilder getGrpcStatusFilterOrBuilder();

  /**
   * <pre>
   * Extension filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ExtensionFilter extension_filter = 11;</code>
   * @return Whether the extensionFilter field is set.
   */
  boolean hasExtensionFilter();
  /**
   * <pre>
   * Extension filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ExtensionFilter extension_filter = 11;</code>
   * @return The extensionFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.ExtensionFilter getExtensionFilter();
  /**
   * <pre>
   * Extension filter.
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.ExtensionFilter extension_filter = 11;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.ExtensionFilterOrBuilder getExtensionFilterOrBuilder();

  /**
   * <pre>
   * Metadata Filter
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.MetadataFilter metadata_filter = 12;</code>
   * @return Whether the metadataFilter field is set.
   */
  boolean hasMetadataFilter();
  /**
   * <pre>
   * Metadata Filter
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.MetadataFilter metadata_filter = 12;</code>
   * @return The metadataFilter.
   */
  io.envoyproxy.envoy.config.accesslog.v3.MetadataFilter getMetadataFilter();
  /**
   * <pre>
   * Metadata Filter
   * </pre>
   *
   * <code>.envoy.config.accesslog.v3.MetadataFilter metadata_filter = 12;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.MetadataFilterOrBuilder getMetadataFilterOrBuilder();

  public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.FilterSpecifierCase getFilterSpecifierCase();
}
