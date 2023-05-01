// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientLoadingCostumeVerificationNotify.proto

package emu.grasscutter.net.proto;

public final class ClientLoadingCostumeVerificationNotifyOuterClass {
  private ClientLoadingCostumeVerificationNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientLoadingCostumeVerificationNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientLoadingCostumeVerificationNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>uint64 guid = 7;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint64 prefab_hash = 4;</code>
     * @return The prefabHash.
     */
    long getPrefabHash();
  }
  /**
   * <pre>
   * CmdId: 3270
   * Name: FGNKEMCGCCD
   * </pre>
   *
   * Protobuf type {@code ClientLoadingCostumeVerificationNotify}
   */
  public static final class ClientLoadingCostumeVerificationNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientLoadingCostumeVerificationNotify)
      ClientLoadingCostumeVerificationNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientLoadingCostumeVerificationNotify.newBuilder() to construct.
    private ClientLoadingCostumeVerificationNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientLoadingCostumeVerificationNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientLoadingCostumeVerificationNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientLoadingCostumeVerificationNotify(
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
            case 24: {

              costumeId_ = input.readUInt32();
              break;
            }
            case 32: {

              prefabHash_ = input.readUInt64();
              break;
            }
            case 56: {

              guid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.internal_static_ClientLoadingCostumeVerificationNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.internal_static_ClientLoadingCostumeVerificationNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.class, emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.Builder.class);
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 3;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int GUID_FIELD_NUMBER = 7;
    private long guid_;
    /**
     * <code>uint64 guid = 7;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int PREFAB_HASH_FIELD_NUMBER = 4;
    private long prefabHash_;
    /**
     * <code>uint64 prefab_hash = 4;</code>
     * @return The prefabHash.
     */
    @java.lang.Override
    public long getPrefabHash() {
      return prefabHash_;
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
      if (costumeId_ != 0) {
        output.writeUInt32(3, costumeId_);
      }
      if (prefabHash_ != 0L) {
        output.writeUInt64(4, prefabHash_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(7, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, costumeId_);
      }
      if (prefabHash_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, prefabHash_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify other = (emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify) obj;

      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getPrefabHash()
          != other.getPrefabHash()) return false;
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
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + PREFAB_HASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPrefabHash());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify prototype) {
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
     * CmdId: 3270
     * Name: FGNKEMCGCCD
     * </pre>
     *
     * Protobuf type {@code ClientLoadingCostumeVerificationNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientLoadingCostumeVerificationNotify)
        emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.internal_static_ClientLoadingCostumeVerificationNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.internal_static_ClientLoadingCostumeVerificationNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.class, emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.newBuilder()
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
        costumeId_ = 0;

        guid_ = 0L;

        prefabHash_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.internal_static_ClientLoadingCostumeVerificationNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify build() {
        emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify buildPartial() {
        emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify result = new emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify(this);
        result.costumeId_ = costumeId_;
        result.guid_ = guid_;
        result.prefabHash_ = prefabHash_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify other) {
        if (other == emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify.getDefaultInstance()) return this;
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getPrefabHash() != 0L) {
          setPrefabHash(other.getPrefabHash());
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
        emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 7;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 7;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private long prefabHash_ ;
      /**
       * <code>uint64 prefab_hash = 4;</code>
       * @return The prefabHash.
       */
      @java.lang.Override
      public long getPrefabHash() {
        return prefabHash_;
      }
      /**
       * <code>uint64 prefab_hash = 4;</code>
       * @param value The prefabHash to set.
       * @return This builder for chaining.
       */
      public Builder setPrefabHash(long value) {
        
        prefabHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 prefab_hash = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrefabHash() {
        
        prefabHash_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ClientLoadingCostumeVerificationNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientLoadingCostumeVerificationNotify)
    private static final emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify();
    }

    public static emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientLoadingCostumeVerificationNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientLoadingCostumeVerificationNotify>() {
      @java.lang.Override
      public ClientLoadingCostumeVerificationNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientLoadingCostumeVerificationNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientLoadingCostumeVerificationNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientLoadingCostumeVerificationNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientLoadingCostumeVerificationNotifyOuterClass.ClientLoadingCostumeVerificationNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientLoadingCostumeVerificationNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientLoadingCostumeVerificationNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,ClientLoadingCostumeVerificationNotify" +
      ".proto\"_\n&ClientLoadingCostumeVerificati" +
      "onNotify\022\022\n\ncostume_id\030\003 \001(\r\022\014\n\004guid\030\007 \001" +
      "(\004\022\023\n\013prefab_hash\030\004 \001(\004B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientLoadingCostumeVerificationNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientLoadingCostumeVerificationNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientLoadingCostumeVerificationNotify_descriptor,
        new java.lang.String[] { "CostumeId", "Guid", "PrefabHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
