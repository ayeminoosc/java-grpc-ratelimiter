// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/rbac/v3/rbac.proto

package io.envoyproxy.envoy.config.rbac.v3;

public final class RbacProto {
  private RbacProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_RBAC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_RBAC_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_RBAC_PoliciesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_RBAC_PoliciesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Permission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Permission_Set_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Permission_Set_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Principal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Principal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Principal_Set_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Principal_Set_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_rbac_v3_Principal_Authenticated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_rbac_v3_Principal_Authenticated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037envoy/config/rbac/v3/rbac.proto\022\024envoy" +
      ".config.rbac.v3\032\"envoy/config/core/v3/ad" +
      "dress.proto\032,envoy/config/route/v3/route" +
      "_components.proto\032$envoy/type/matcher/v3" +
      "/metadata.proto\032 envoy/type/matcher/v3/p" +
      "ath.proto\032\"envoy/type/matcher/v3/string." +
      "proto\032&google/api/expr/v1alpha1/checked." +
      "proto\032%google/api/expr/v1alpha1/syntax.p" +
      "roto\032\036udpa/annotations/migrate.proto\032\035ud" +
      "pa/annotations/status.proto\032!udpa/annota" +
      "tions/versioning.proto\032\027validate/validat" +
      "e.proto\"\230\002\n\004RBAC\022;\n\006action\030\001 \001(\0162!.envoy" +
      ".config.rbac.v3.RBAC.ActionB\010\372B\005\202\001\002\020\001\022:\n" +
      "\010policies\030\002 \003(\0132(.envoy.config.rbac.v3.R" +
      "BAC.PoliciesEntry\032M\n\rPoliciesEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022+\n\005value\030\002 \001(\0132\034.envoy.config.rb" +
      "ac.v3.Policy:\0028\001\"&\n\006Action\022\t\n\005ALLOW\020\000\022\010\n" +
      "\004DENY\020\001\022\007\n\003LOG\020\002: \232\305\210\036\033\n\031envoy.config.rb" +
      "ac.v2.RBAC\"\335\002\n\006Policy\022?\n\013permissions\030\001 \003" +
      "(\0132 .envoy.config.rbac.v3.PermissionB\010\372B" +
      "\005\222\001\002\010\001\022=\n\nprincipals\030\002 \003(\0132\037.envoy.confi" +
      "g.rbac.v3.PrincipalB\010\372B\005\222\001\002\010\001\022O\n\tconditi" +
      "on\030\003 \001(\0132\036.google.api.expr.v1alpha1.Expr" +
      "B\034\362\230\376\217\005\026\022\024expression_specifier\022^\n\021checke" +
      "d_condition\030\004 \001(\0132%.google.api.expr.v1al" +
      "pha1.CheckedExprB\034\362\230\376\217\005\026\022\024expression_spe" +
      "cifier:\"\232\305\210\036\035\n\033envoy.config.rbac.v2.Poli" +
      "cy\"\307\005\n\nPermission\0229\n\tand_rules\030\001 \001(\0132$.e" +
      "nvoy.config.rbac.v3.Permission.SetH\000\0228\n\010" +
      "or_rules\030\002 \001(\0132$.envoy.config.rbac.v3.Pe" +
      "rmission.SetH\000\022\026\n\003any\030\003 \001(\010B\007\372B\004j\002\010\001H\000\0226" +
      "\n\006header\030\004 \001(\0132$.envoy.config.route.v3.H" +
      "eaderMatcherH\000\0226\n\010url_path\030\n \001(\0132\".envoy" +
      ".type.matcher.v3.PathMatcherH\000\0229\n\016destin" +
      "ation_ip\030\005 \001(\0132\037.envoy.config.core.v3.Ci" +
      "drRangeH\000\022%\n\020destination_port\030\006 \001(\rB\t\372B\006" +
      "*\004\030\377\377\003H\000\022:\n\010metadata\030\007 \001(\0132&.envoy.type." +
      "matcher.v3.MetadataMatcherH\000\0224\n\010not_rule" +
      "\030\010 \001(\0132 .envoy.config.rbac.v3.Permission" +
      "H\000\022E\n\025requested_server_name\030\t \001(\0132$.envo" +
      "y.type.matcher.v3.StringMatcherH\000\032l\n\003Set" +
      "\0229\n\005rules\030\001 \003(\0132 .envoy.config.rbac.v3.P" +
      "ermissionB\010\372B\005\222\001\002\010\001:*\232\305\210\036%\n#envoy.config" +
      ".rbac.v2.Permission.Set:&\232\305\210\036!\n\037envoy.co" +
      "nfig.rbac.v2.PermissionB\013\n\004rule\022\003\370B\001\"\225\007\n" +
      "\tPrincipal\0226\n\007and_ids\030\001 \001(\0132#.envoy.conf" +
      "ig.rbac.v3.Principal.SetH\000\0225\n\006or_ids\030\002 \001" +
      "(\0132#.envoy.config.rbac.v3.Principal.SetH" +
      "\000\022\026\n\003any\030\003 \001(\010B\007\372B\004j\002\010\001H\000\022F\n\rauthenticat" +
      "ed\030\004 \001(\0132-.envoy.config.rbac.v3.Principa" +
      "l.AuthenticatedH\000\0228\n\tsource_ip\030\005 \001(\0132\037.e" +
      "nvoy.config.core.v3.CidrRangeB\002\030\001H\000\022;\n\020d" +
      "irect_remote_ip\030\n \001(\0132\037.envoy.config.cor" +
      "e.v3.CidrRangeH\000\0224\n\tremote_ip\030\013 \001(\0132\037.en" +
      "voy.config.core.v3.CidrRangeH\000\0226\n\006header" +
      "\030\006 \001(\0132$.envoy.config.route.v3.HeaderMat" +
      "cherH\000\0226\n\010url_path\030\t \001(\0132\".envoy.type.ma" +
      "tcher.v3.PathMatcherH\000\022:\n\010metadata\030\007 \001(\013" +
      "2&.envoy.type.matcher.v3.MetadataMatcher" +
      "H\000\0221\n\006not_id\030\010 \001(\0132\037.envoy.config.rbac.v" +
      "3.PrincipalH\000\032h\n\003Set\0226\n\003ids\030\001 \003(\0132\037.envo" +
      "y.config.rbac.v3.PrincipalB\010\372B\005\222\001\002\010\001:)\232\305" +
      "\210\036$\n\"envoy.config.rbac.v2.Principal.Set\032" +
      "\210\001\n\rAuthenticated\022<\n\016principal_name\030\002 \001(" +
      "\0132$.envoy.type.matcher.v3.StringMatcher:" +
      "3\232\305\210\036.\n,envoy.config.rbac.v2.Principal.A" +
      "uthenticatedJ\004\010\001\020\002:%\232\305\210\036 \n\036envoy.config." +
      "rbac.v2.PrincipalB\021\n\nidentifier\022\003\370B\001B9\n\"" +
      "io.envoyproxy.envoy.config.rbac.v3B\tRbac" +
      "ProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.PathProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor(),
          com.google.api.expr.v1alpha1.DeclProto.getDescriptor(),
          com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_rbac_v3_RBAC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_rbac_v3_RBAC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_RBAC_descriptor,
        new java.lang.String[] { "Action", "Policies", });
    internal_static_envoy_config_rbac_v3_RBAC_PoliciesEntry_descriptor =
      internal_static_envoy_config_rbac_v3_RBAC_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v3_RBAC_PoliciesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_RBAC_PoliciesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_envoy_config_rbac_v3_Policy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_rbac_v3_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Policy_descriptor,
        new java.lang.String[] { "Permissions", "Principals", "Condition", "CheckedCondition", });
    internal_static_envoy_config_rbac_v3_Permission_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_rbac_v3_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Permission_descriptor,
        new java.lang.String[] { "AndRules", "OrRules", "Any", "Header", "UrlPath", "DestinationIp", "DestinationPort", "Metadata", "NotRule", "RequestedServerName", "Rule", });
    internal_static_envoy_config_rbac_v3_Permission_Set_descriptor =
      internal_static_envoy_config_rbac_v3_Permission_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v3_Permission_Set_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Permission_Set_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_envoy_config_rbac_v3_Principal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_rbac_v3_Principal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Principal_descriptor,
        new java.lang.String[] { "AndIds", "OrIds", "Any", "Authenticated", "SourceIp", "DirectRemoteIp", "RemoteIp", "Header", "UrlPath", "Metadata", "NotId", "Identifier", });
    internal_static_envoy_config_rbac_v3_Principal_Set_descriptor =
      internal_static_envoy_config_rbac_v3_Principal_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_rbac_v3_Principal_Set_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Principal_Set_descriptor,
        new java.lang.String[] { "Ids", });
    internal_static_envoy_config_rbac_v3_Principal_Authenticated_descriptor =
      internal_static_envoy_config_rbac_v3_Principal_descriptor.getNestedTypes().get(1);
    internal_static_envoy_config_rbac_v3_Principal_Authenticated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_rbac_v3_Principal_Authenticated_descriptor,
        new java.lang.String[] { "PrincipalName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fieldMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor();
    io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.PathProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor();
    com.google.api.expr.v1alpha1.DeclProto.getDescriptor();
    com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
