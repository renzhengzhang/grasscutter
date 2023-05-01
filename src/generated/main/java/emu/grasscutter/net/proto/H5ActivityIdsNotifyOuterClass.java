// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: H5ActivityIdsNotify.proto

package emu.grasscutter.net.proto;

public final class H5ActivityIdsNotifyOuterClass {
  private H5ActivityIdsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface H5ActivityIdsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:H5ActivityIdsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    int getH5ActivityMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    boolean containsH5ActivityMap(
        int key);
    /**
     * Use {@link #getH5ActivityMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getH5ActivityMap();
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getH5ActivityMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */

    int getH5ActivityMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */

    int getH5ActivityMapOrThrow(
        int key);

    /**
     * <code>uint32 client_red_dot_timestamp = 14;</code>
     * @return The clientRedDotTimestamp.
     */
    int getClientRedDotTimestamp();
  }
  /**
   * <pre>
   * CmdId: 5667
   * Name: NKAFABCJHNC
   * </pre>
   *
   * Protobuf type {@code H5ActivityIdsNotify}
   */
  public static final class H5ActivityIdsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:H5ActivityIdsNotify)
      H5ActivityIdsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use H5ActivityIdsNotify.newBuilder() to construct.
    private H5ActivityIdsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private H5ActivityIdsNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new H5ActivityIdsNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private H5ActivityIdsNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 112: {

              clientRedDotTimestamp_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                h5ActivityMap_ = com.google.protobuf.MapField.newMapField(
                    H5ActivityMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              h5ActivityMap__ = input.readMessage(
                  H5ActivityMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              h5ActivityMap_.getMutableMap().put(
                  h5ActivityMap__.getKey(), h5ActivityMap__.getValue());
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
      return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetH5ActivityMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.class, emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.Builder.class);
    }

    public static final int H5_ACTIVITY_MAP_FIELD_NUMBER = 15;
    private static final class H5ActivityMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> h5ActivityMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetH5ActivityMap() {
      if (h5ActivityMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            H5ActivityMapDefaultEntryHolder.defaultEntry);
      }
      return h5ActivityMap_;
    }

    public int getH5ActivityMapCount() {
      return internalGetH5ActivityMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */

    @java.lang.Override
    public boolean containsH5ActivityMap(
        int key) {
      
      return internalGetH5ActivityMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getH5ActivityMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getH5ActivityMap() {
      return getH5ActivityMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getH5ActivityMapMap() {
      return internalGetH5ActivityMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    @java.lang.Override

    public int getH5ActivityMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetH5ActivityMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
     */
    @java.lang.Override

    public int getH5ActivityMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetH5ActivityMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int CLIENT_RED_DOT_TIMESTAMP_FIELD_NUMBER = 14;
    private int clientRedDotTimestamp_;
    /**
     * <code>uint32 client_red_dot_timestamp = 14;</code>
     * @return The clientRedDotTimestamp.
     */
    @java.lang.Override
    public int getClientRedDotTimestamp() {
      return clientRedDotTimestamp_;
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
      if (clientRedDotTimestamp_ != 0) {
        output.writeUInt32(14, clientRedDotTimestamp_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetH5ActivityMap(),
          H5ActivityMapDefaultEntryHolder.defaultEntry,
          15);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clientRedDotTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, clientRedDotTimestamp_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetH5ActivityMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        h5ActivityMap__ = H5ActivityMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(15, h5ActivityMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify other = (emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify) obj;

      if (!internalGetH5ActivityMap().equals(
          other.internalGetH5ActivityMap())) return false;
      if (getClientRedDotTimestamp()
          != other.getClientRedDotTimestamp()) return false;
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
      if (!internalGetH5ActivityMap().getMap().isEmpty()) {
        hash = (37 * hash) + H5_ACTIVITY_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetH5ActivityMap().hashCode();
      }
      hash = (37 * hash) + CLIENT_RED_DOT_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getClientRedDotTimestamp();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify prototype) {
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
     * CmdId: 5667
     * Name: NKAFABCJHNC
     * </pre>
     *
     * Protobuf type {@code H5ActivityIdsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:H5ActivityIdsNotify)
        emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetH5ActivityMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetMutableH5ActivityMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.class, emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.newBuilder()
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
        internalGetMutableH5ActivityMap().clear();
        clientRedDotTimestamp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.internal_static_H5ActivityIdsNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify build() {
        emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify buildPartial() {
        emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify result = new emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify(this);
        int from_bitField0_ = bitField0_;
        result.h5ActivityMap_ = internalGetH5ActivityMap();
        result.h5ActivityMap_.makeImmutable();
        result.clientRedDotTimestamp_ = clientRedDotTimestamp_;
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
        if (other instanceof emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify) {
          return mergeFrom((emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify other) {
        if (other == emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify.getDefaultInstance()) return this;
        internalGetMutableH5ActivityMap().mergeFrom(
            other.internalGetH5ActivityMap());
        if (other.getClientRedDotTimestamp() != 0) {
          setClientRedDotTimestamp(other.getClientRedDotTimestamp());
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
        emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> h5ActivityMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetH5ActivityMap() {
        if (h5ActivityMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              H5ActivityMapDefaultEntryHolder.defaultEntry);
        }
        return h5ActivityMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableH5ActivityMap() {
        onChanged();;
        if (h5ActivityMap_ == null) {
          h5ActivityMap_ = com.google.protobuf.MapField.newMapField(
              H5ActivityMapDefaultEntryHolder.defaultEntry);
        }
        if (!h5ActivityMap_.isMutable()) {
          h5ActivityMap_ = h5ActivityMap_.copy();
        }
        return h5ActivityMap_;
      }

      public int getH5ActivityMapCount() {
        return internalGetH5ActivityMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */

      @java.lang.Override
      public boolean containsH5ActivityMap(
          int key) {
        
        return internalGetH5ActivityMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getH5ActivityMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getH5ActivityMap() {
        return getH5ActivityMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getH5ActivityMapMap() {
        return internalGetH5ActivityMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */
      @java.lang.Override

      public int getH5ActivityMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetH5ActivityMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */
      @java.lang.Override

      public int getH5ActivityMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetH5ActivityMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearH5ActivityMap() {
        internalGetMutableH5ActivityMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */

      public Builder removeH5ActivityMap(
          int key) {
        
        internalGetMutableH5ActivityMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableH5ActivityMap() {
        return internalGetMutableH5ActivityMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */
      public Builder putH5ActivityMap(
          int key,
          int value) {
        
        
        internalGetMutableH5ActivityMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; h5_activity_map = 15;</code>
       */

      public Builder putAllH5ActivityMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableH5ActivityMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int clientRedDotTimestamp_ ;
      /**
       * <code>uint32 client_red_dot_timestamp = 14;</code>
       * @return The clientRedDotTimestamp.
       */
      @java.lang.Override
      public int getClientRedDotTimestamp() {
        return clientRedDotTimestamp_;
      }
      /**
       * <code>uint32 client_red_dot_timestamp = 14;</code>
       * @param value The clientRedDotTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setClientRedDotTimestamp(int value) {
        
        clientRedDotTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_red_dot_timestamp = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientRedDotTimestamp() {
        
        clientRedDotTimestamp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:H5ActivityIdsNotify)
    }

    // @@protoc_insertion_point(class_scope:H5ActivityIdsNotify)
    private static final emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify();
    }

    public static emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<H5ActivityIdsNotify>
        PARSER = new com.google.protobuf.AbstractParser<H5ActivityIdsNotify>() {
      @java.lang.Override
      public H5ActivityIdsNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new H5ActivityIdsNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<H5ActivityIdsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<H5ActivityIdsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.H5ActivityIdsNotifyOuterClass.H5ActivityIdsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_H5ActivityIdsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_H5ActivityIdsNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031H5ActivityIdsNotify.proto\"\257\001\n\023H5Activi" +
      "tyIdsNotify\022@\n\017h5_activity_map\030\017 \003(\0132\'.H" +
      "5ActivityIdsNotify.H5ActivityMapEntry\022 \n" +
      "\030client_red_dot_timestamp\030\016 \001(\r\0324\n\022H5Act" +
      "ivityMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(" +
      "\r:\0028\001B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_H5ActivityIdsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_H5ActivityIdsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_H5ActivityIdsNotify_descriptor,
        new java.lang.String[] { "H5ActivityMap", "ClientRedDotTimestamp", });
    internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor =
      internal_static_H5ActivityIdsNotify_descriptor.getNestedTypes().get(0);
    internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_H5ActivityIdsNotify_H5ActivityMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
