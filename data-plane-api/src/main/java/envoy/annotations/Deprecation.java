// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/annotations/deprecation.proto

package envoy.annotations;

public final class Deprecation {
  private Deprecation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(envoy.annotations.Deprecation.disallowedByDefault);
    registry.add(envoy.annotations.Deprecation.disallowedByDefaultEnum);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int DISALLOWED_BY_DEFAULT_FIELD_NUMBER = 189503207;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> disallowedByDefault = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int DISALLOWED_BY_DEFAULT_ENUM_FIELD_NUMBER = 70100853;
  /**
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      java.lang.Boolean> disallowedByDefaultEnum = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#envoy/annotations/deprecation.proto\022\021e" +
      "nvoy.annotations\032 google/protobuf/descri" +
      "ptor.proto:?\n\025disallowed_by_default\022\035.go" +
      "ogle.protobuf.FieldOptions\030\347\255\256Z \001(\010:H\n\032d" +
      "isallowed_by_default_enum\022!.google.proto" +
      "buf.EnumValueOptions\030\365\316\266! \001(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    disallowedByDefault.internalInit(descriptor.getExtensions().get(0));
    disallowedByDefaultEnum.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
