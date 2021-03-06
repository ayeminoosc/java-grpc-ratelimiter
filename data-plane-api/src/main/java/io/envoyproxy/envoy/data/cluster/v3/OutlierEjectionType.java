// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/cluster/v3/outlier_detection_event.proto

package io.envoyproxy.envoy.data.cluster.v3;

/**
 * <pre>
 * Type of ejection that took place
 * </pre>
 *
 * Protobuf enum {@code envoy.data.cluster.v3.OutlierEjectionType}
 */
public enum OutlierEjectionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * In case upstream host returns certain number of consecutive 5xx.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all type of errors are treated as HTTP 5xx errors.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * </pre>
   *
   * <code>CONSECUTIVE_5XX = 0;</code>
   */
  CONSECUTIVE_5XX(0),
  /**
   * <pre>
   * In case upstream host returns certain number of consecutive gateway errors
   * </pre>
   *
   * <code>CONSECUTIVE_GATEWAY_FAILURE = 1;</code>
   */
  CONSECUTIVE_GATEWAY_FAILURE(1),
  /**
   * <pre>
   * Runs over aggregated success rate statistics from every host in cluster
   * and selects hosts for which ratio of successful replies deviates from other hosts
   * in the cluster.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all errors (externally and locally generated) are used to calculate success rate
   * statistics. See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;`
   * documentation for details.
   * </pre>
   *
   * <code>SUCCESS_RATE = 2;</code>
   */
  SUCCESS_RATE(2),
  /**
   * <pre>
   * Consecutive local origin failures: Connection failures, resets, timeouts, etc
   * This type of ejection happens only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * </pre>
   *
   * <code>CONSECUTIVE_LOCAL_ORIGIN_FAILURE = 3;</code>
   */
  CONSECUTIVE_LOCAL_ORIGIN_FAILURE(3),
  /**
   * <pre>
   * Runs over aggregated success rate statistics for local origin failures
   * for all hosts in the cluster and selects hosts for which success rate deviates from other
   * hosts in the cluster. This type of ejection happens only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * </pre>
   *
   * <code>SUCCESS_RATE_LOCAL_ORIGIN = 4;</code>
   */
  SUCCESS_RATE_LOCAL_ORIGIN(4),
  /**
   * <pre>
   * Runs over aggregated success rate statistics from every host in cluster and selects hosts for
   * which ratio of failed replies is above configured value.
   * </pre>
   *
   * <code>FAILURE_PERCENTAGE = 5;</code>
   */
  FAILURE_PERCENTAGE(5),
  /**
   * <pre>
   * Runs over aggregated success rate statistics for local origin failures from every host in
   * cluster and selects hosts for which ratio of failed replies is above configured value.
   * </pre>
   *
   * <code>FAILURE_PERCENTAGE_LOCAL_ORIGIN = 6;</code>
   */
  FAILURE_PERCENTAGE_LOCAL_ORIGIN(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * In case upstream host returns certain number of consecutive 5xx.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all type of errors are treated as HTTP 5xx errors.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * </pre>
   *
   * <code>CONSECUTIVE_5XX = 0;</code>
   */
  public static final int CONSECUTIVE_5XX_VALUE = 0;
  /**
   * <pre>
   * In case upstream host returns certain number of consecutive gateway errors
   * </pre>
   *
   * <code>CONSECUTIVE_GATEWAY_FAILURE = 1;</code>
   */
  public static final int CONSECUTIVE_GATEWAY_FAILURE_VALUE = 1;
  /**
   * <pre>
   * Runs over aggregated success rate statistics from every host in cluster
   * and selects hosts for which ratio of successful replies deviates from other hosts
   * in the cluster.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all errors (externally and locally generated) are used to calculate success rate
   * statistics. See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;`
   * documentation for details.
   * </pre>
   *
   * <code>SUCCESS_RATE = 2;</code>
   */
  public static final int SUCCESS_RATE_VALUE = 2;
  /**
   * <pre>
   * Consecutive local origin failures: Connection failures, resets, timeouts, etc
   * This type of ejection happens only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * </pre>
   *
   * <code>CONSECUTIVE_LOCAL_ORIGIN_FAILURE = 3;</code>
   */
  public static final int CONSECUTIVE_LOCAL_ORIGIN_FAILURE_VALUE = 3;
  /**
   * <pre>
   * Runs over aggregated success rate statistics for local origin failures
   * for all hosts in the cluster and selects hosts for which success rate deviates from other
   * hosts in the cluster. This type of ejection happens only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is set to *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * </pre>
   *
   * <code>SUCCESS_RATE_LOCAL_ORIGIN = 4;</code>
   */
  public static final int SUCCESS_RATE_LOCAL_ORIGIN_VALUE = 4;
  /**
   * <pre>
   * Runs over aggregated success rate statistics from every host in cluster and selects hosts for
   * which ratio of failed replies is above configured value.
   * </pre>
   *
   * <code>FAILURE_PERCENTAGE = 5;</code>
   */
  public static final int FAILURE_PERCENTAGE_VALUE = 5;
  /**
   * <pre>
   * Runs over aggregated success rate statistics for local origin failures from every host in
   * cluster and selects hosts for which ratio of failed replies is above configured value.
   * </pre>
   *
   * <code>FAILURE_PERCENTAGE_LOCAL_ORIGIN = 6;</code>
   */
  public static final int FAILURE_PERCENTAGE_LOCAL_ORIGIN_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OutlierEjectionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OutlierEjectionType forNumber(int value) {
    switch (value) {
      case 0: return CONSECUTIVE_5XX;
      case 1: return CONSECUTIVE_GATEWAY_FAILURE;
      case 2: return SUCCESS_RATE;
      case 3: return CONSECUTIVE_LOCAL_ORIGIN_FAILURE;
      case 4: return SUCCESS_RATE_LOCAL_ORIGIN;
      case 5: return FAILURE_PERCENTAGE;
      case 6: return FAILURE_PERCENTAGE_LOCAL_ORIGIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OutlierEjectionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OutlierEjectionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OutlierEjectionType>() {
          public OutlierEjectionType findValueByNumber(int number) {
            return OutlierEjectionType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.data.cluster.v3.OutlierDetectionEventProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OutlierEjectionType[] VALUES = values();

  public static OutlierEjectionType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OutlierEjectionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.data.cluster.v3.OutlierEjectionType)
}

