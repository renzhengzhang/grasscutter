// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityClientExtraInfo.proto

package emu.grasscutter.net.proto;

public final class EntityClientExtraInfoOuterClass {
  private EntityClientExtraInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityClientExtraInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityClientExtraInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    boolean hasSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return The skillAnchorPosition.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder();
  }
  /**
   * <pre>
   * Name: KGEALKMFDMM
   * </pre>
   *
   * Protobuf type {@code EntityClientExtraInfo}
   */
  public static final class EntityClientExtraInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityClientExtraInfo)
      EntityClientExtraInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityClientExtraInfo.newBuilder() to construct.
    private EntityClientExtraInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityClientExtraInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityClientExtraInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EntityClientExtraInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (skillAnchorPosition_ != null) {
                subBuilder = skillAnchorPosition_.toBuilder();
              }
              skillAnchorPosition_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(skillAnchorPosition_);
                skillAnchorPosition_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.class, emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.Builder.class);
    }

    public static final int SKILL_ANCHOR_POSITION_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector skillAnchorPosition_;
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    @java.lang.Override
    public boolean hasSkillAnchorPosition() {
      return skillAnchorPosition_ != null;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return The skillAnchorPosition.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getSkillAnchorPosition() {
      return skillAnchorPosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
      return getSkillAnchorPosition();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (skillAnchorPosition_ != null) {
        output.writeMessage(1, getSkillAnchorPosition());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillAnchorPosition_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSkillAnchorPosition());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo other = (emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo) obj;

      if (hasSkillAnchorPosition() != other.hasSkillAnchorPosition()) return false;
      if (hasSkillAnchorPosition()) {
        if (!getSkillAnchorPosition()
            .equals(other.getSkillAnchorPosition())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSkillAnchorPosition()) {
        hash = (37 * hash) + SKILL_ANCHOR_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getSkillAnchorPosition().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: KGEALKMFDMM
     * </pre>
     *
     * Protobuf type {@code EntityClientExtraInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityClientExtraInfo)
        emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.class, emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = null;
        } else {
          skillAnchorPosition_ = null;
          skillAnchorPositionBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo build() {
        emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo buildPartial() {
        emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo result = new emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo(this);
        if (skillAnchorPositionBuilder_ == null) {
          result.skillAnchorPosition_ = skillAnchorPosition_;
        } else {
          result.skillAnchorPosition_ = skillAnchorPositionBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo other) {
        if (other == emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.getDefaultInstance()) return this;
        if (other.hasSkillAnchorPosition()) {
          mergeSkillAnchorPosition(other.getSkillAnchorPosition());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector skillAnchorPosition_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> skillAnchorPositionBuilder_;
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       * @return Whether the skillAnchorPosition field is set.
       */
      public boolean hasSkillAnchorPosition() {
        return skillAnchorPositionBuilder_ != null || skillAnchorPosition_ != null;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       * @return The skillAnchorPosition.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getSkillAnchorPosition() {
        if (skillAnchorPositionBuilder_ == null) {
          return skillAnchorPosition_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        } else {
          return skillAnchorPositionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder setSkillAnchorPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          skillAnchorPosition_ = value;
          onChanged();
        } else {
          skillAnchorPositionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder setSkillAnchorPosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = builderForValue.build();
          onChanged();
        } else {
          skillAnchorPositionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder mergeSkillAnchorPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (skillAnchorPosition_ != null) {
            skillAnchorPosition_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(skillAnchorPosition_).mergeFrom(value).buildPartial();
          } else {
            skillAnchorPosition_ = value;
          }
          onChanged();
        } else {
          skillAnchorPositionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder clearSkillAnchorPosition() {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = null;
          onChanged();
        } else {
          skillAnchorPosition_ = null;
          skillAnchorPositionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getSkillAnchorPositionBuilder() {
        
        onChanged();
        return getSkillAnchorPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
        if (skillAnchorPositionBuilder_ != null) {
          return skillAnchorPositionBuilder_.getMessageOrBuilder();
        } else {
          return skillAnchorPosition_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSkillAnchorPositionFieldBuilder() {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSkillAnchorPosition(),
                  getParentForChildren(),
                  isClean());
          skillAnchorPosition_ = null;
        }
        return skillAnchorPositionBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EntityClientExtraInfo)
    }

    // @@protoc_insertion_point(class_scope:EntityClientExtraInfo)
    private static final emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo();
    }

    public static emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityClientExtraInfo>
        PARSER = new com.google.protobuf.AbstractParser<EntityClientExtraInfo>() {
      @java.lang.Override
      public EntityClientExtraInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityClientExtraInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EntityClientExtraInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityClientExtraInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityClientExtraInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityClientExtraInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EntityClientExtraInfo.proto\032\014Vector.pr" +
      "oto\"?\n\025EntityClientExtraInfo\022&\n\025skill_an" +
      "chor_position\030\001 \001(\0132\007.VectorB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EntityClientExtraInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityClientExtraInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityClientExtraInfo_descriptor,
        new java.lang.String[] { "SkillAnchorPosition", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
