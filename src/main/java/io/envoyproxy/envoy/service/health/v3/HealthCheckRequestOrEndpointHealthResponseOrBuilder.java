// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

public interface HealthCheckRequestOrEndpointHealthResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.service.health.v3.HealthCheckRequest health_check_request = 1;</code>
   * @return Whether the healthCheckRequest field is set.
   */
  boolean hasHealthCheckRequest();
  /**
   * <code>.envoy.service.health.v3.HealthCheckRequest health_check_request = 1;</code>
   * @return The healthCheckRequest.
   */
  io.envoyproxy.envoy.service.health.v3.HealthCheckRequest getHealthCheckRequest();
  /**
   * <code>.envoy.service.health.v3.HealthCheckRequest health_check_request = 1;</code>
   */
  io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrBuilder getHealthCheckRequestOrBuilder();

  /**
   * <code>.envoy.service.health.v3.EndpointHealthResponse endpoint_health_response = 2;</code>
   * @return Whether the endpointHealthResponse field is set.
   */
  boolean hasEndpointHealthResponse();
  /**
   * <code>.envoy.service.health.v3.EndpointHealthResponse endpoint_health_response = 2;</code>
   * @return The endpointHealthResponse.
   */
  io.envoyproxy.envoy.service.health.v3.EndpointHealthResponse getEndpointHealthResponse();
  /**
   * <code>.envoy.service.health.v3.EndpointHealthResponse endpoint_health_response = 2;</code>
   */
  io.envoyproxy.envoy.service.health.v3.EndpointHealthResponseOrBuilder getEndpointHealthResponseOrBuilder();

  public io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse.RequestTypeCase getRequestTypeCase();
}
