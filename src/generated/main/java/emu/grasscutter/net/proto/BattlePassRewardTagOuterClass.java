// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassRewardTag.proto

package emu.grasscutter.net.proto;

public final class BattlePassRewardTagOuterClass {
  private BattlePassRewardTagOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassRewardTagOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassRewardTag)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
     * @return The enum numeric value on the wire for unlockStatus.
     */
    int getUnlockStatusValue();
    /**
     * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
     * @return The unlockStatus.
     */
    emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus();

    /**
     * <code>uint32 reward_id = 10;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    int getLevel();
  }
  /**
   * <pre>
   * Name: IHONIMHMIGN
   * </pre>
   *
   * Protobuf type {@code BattlePassRewardTag}
   */
  public static final class BattlePassRewardTag extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassRewardTag)
      BattlePassRewardTagOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassRewardTag.newBuilder() to construct.
    private BattlePassRewardTag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassRewardTag() {
      unlockStatus_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassRewardTag();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassRewardTag(
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
            case 16: {

              level_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              unlockStatus_ = rawValue;
              break;
            }
            case 80: {

              rewardId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.class, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder.class);
    }

    public static final int UNLOCK_STATUS_FIELD_NUMBER = 5;
    private int unlockStatus_;
    /**
     * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
     * @return The enum numeric value on the wire for unlockStatus.
     */
    @java.lang.Override public int getUnlockStatusValue() {
      return unlockStatus_;
    }
    /**
     * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
     * @return The unlockStatus.
     */
    @java.lang.Override public emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(unlockStatus_);
      return result == null ? emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 10;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 10;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
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
      if (level_ != 0) {
        output.writeUInt32(2, level_);
      }
      if (unlockStatus_ != emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
        output.writeEnum(5, unlockStatus_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(10, rewardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, level_);
      }
      if (unlockStatus_ != emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, unlockStatus_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, rewardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag other = (emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag) obj;

      if (unlockStatus_ != other.unlockStatus_) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
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
      hash = (37 * hash) + UNLOCK_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + unlockStatus_;
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag prototype) {
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
     * Name: IHONIMHMIGN
     * </pre>
     *
     * Protobuf type {@code BattlePassRewardTag}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassRewardTag)
        emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.class, emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.newBuilder()
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
        unlockStatus_ = 0;

        rewardId_ = 0;

        level_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag build() {
        emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag buildPartial() {
        emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag result = new emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag(this);
        result.unlockStatus_ = unlockStatus_;
        result.rewardId_ = rewardId_;
        result.level_ = level_;
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag other) {
        if (other == emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance()) return this;
        if (other.unlockStatus_ != 0) {
          setUnlockStatusValue(other.getUnlockStatusValue());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
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
        emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unlockStatus_ = 0;
      /**
       * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
       * @return The enum numeric value on the wire for unlockStatus.
       */
      @java.lang.Override public int getUnlockStatusValue() {
        return unlockStatus_;
      }
      /**
       * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
       * @param value The enum numeric value on the wire for unlockStatus to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockStatusValue(int value) {
        
        unlockStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
       * @return The unlockStatus.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(unlockStatus_);
        return result == null ? emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
      }
      /**
       * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
       * @param value The unlockStatus to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockStatus(emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unlockStatus_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassUnlockStatus unlock_status = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockStatus() {
        
        unlockStatus_ = 0;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 10;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 10;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 2;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:BattlePassRewardTag)
    }

    // @@protoc_insertion_point(class_scope:BattlePassRewardTag)
    private static final emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag();
    }

    public static emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassRewardTag>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassRewardTag>() {
      @java.lang.Override
      public BattlePassRewardTag parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassRewardTag(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassRewardTag> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassRewardTag> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassRewardTag_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassRewardTag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031BattlePassRewardTag.proto\032\034BattlePassU" +
      "nlockStatus.proto\"g\n\023BattlePassRewardTag" +
      "\022.\n\runlock_status\030\005 \001(\0162\027.BattlePassUnlo" +
      "ckStatus\022\021\n\treward_id\030\n \001(\r\022\r\n\005level\030\002 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.getDescriptor(),
        });
    internal_static_BattlePassRewardTag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassRewardTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassRewardTag_descriptor,
        new java.lang.String[] { "UnlockStatus", "RewardId", "Level", });
    emu.grasscutter.net.proto.BattlePassUnlockStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
