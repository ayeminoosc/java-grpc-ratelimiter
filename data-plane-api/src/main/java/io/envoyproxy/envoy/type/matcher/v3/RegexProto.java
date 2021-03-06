// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/regex.proto

package io.envoyproxy.envoy.type.matcher.v3;

public final class RegexProto {
  private RegexProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_v3_RegexMatcher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_v3_RegexMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_v3_RegexMatcher_GoogleRE2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_v3_RegexMatcher_GoogleRE2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_v3_RegexMatchAndSubstitute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_v3_RegexMatchAndSubstitute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!envoy/type/matcher/v3/regex.proto\022\025env" +
      "oy.type.matcher.v3\032\036google/protobuf/wrap" +
      "pers.proto\032\035udpa/annotations/status.prot" +
      "o\032!udpa/annotations/versioning.proto\032\027va" +
      "lidate/validate.proto\"\254\002\n\014RegexMatcher\022M" +
      "\n\ngoogle_re2\030\001 \001(\0132-.envoy.type.matcher." +
      "v3.RegexMatcher.GoogleRE2B\010\372B\005\212\001\002\020\001H\000\022\026\n" +
      "\005regex\030\002 \001(\tB\007\372B\004r\002\020\001\032y\n\tGoogleRE2\022:\n\020ma" +
      "x_program_size\030\001 \001(\0132\034.google.protobuf.U" +
      "Int32ValueB\002\030\001:0\232\305\210\036+\n)envoy.type.matche" +
      "r.RegexMatcher.GoogleRE2:&\232\305\210\036!\n\037envoy.t" +
      "ype.matcher.RegexMatcherB\022\n\013engine_type\022" +
      "\003\370B\001\"\242\001\n\027RegexMatchAndSubstitute\022>\n\007patt" +
      "ern\030\001 \001(\0132#.envoy.type.matcher.v3.RegexM" +
      "atcherB\010\372B\005\212\001\002\020\001\022\024\n\014substitution\030\002 \001(\t:1" +
      "\232\305\210\036,\n*envoy.type.matcher.RegexMatchAndS" +
      "ubstituteB;\n#io.envoyproxy.envoy.type.ma" +
      "tcher.v3B\nRegexProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_matcher_v3_RegexMatcher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_matcher_v3_RegexMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_v3_RegexMatcher_descriptor,
        new java.lang.String[] { "GoogleRe2", "Regex", "EngineType", });
    internal_static_envoy_type_matcher_v3_RegexMatcher_GoogleRE2_descriptor =
      internal_static_envoy_type_matcher_v3_RegexMatcher_descriptor.getNestedTypes().get(0);
    internal_static_envoy_type_matcher_v3_RegexMatcher_GoogleRE2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_v3_RegexMatcher_GoogleRE2_descriptor,
        new java.lang.String[] { "MaxProgramSize", });
    internal_static_envoy_type_matcher_v3_RegexMatchAndSubstitute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_type_matcher_v3_RegexMatchAndSubstitute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_v3_RegexMatchAndSubstitute_descriptor,
        new java.lang.String[] { "Pattern", "Substitution", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
