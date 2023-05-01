// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombineFormulaDataNotify.proto

package emu.grasscutter.net.proto;

public final class CombineFormulaDataNotifyOuterClass {
  private CombineFormulaDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombineFormulaDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombineFormulaDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_locked = 7;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>uint32 combine_id = 9;</code>
     * @return The combineId.
     */
    int getCombineId();
  }
  /**
   * <pre>
   * CmdId: 622
   * Name: BKJBIOIIJNB
   * </pre>
   *
   * Protobuf type {@code CombineFormulaDataNotify}
   */
  public static final class CombineFormulaDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombineFormulaDataNotify)
      CombineFormulaDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombineFormulaDataNotify.newBuilder() to construct.
    private CombineFormulaDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombineFormulaDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombineFormulaDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CombineFormulaDataNotify(
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
            case 56: {

              isLocked_ = input.readBool();
              break;
            }
            case 72: {

              combineId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.class, emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.Builder.class);
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 7;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 7;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int COMBINE_ID_FIELD_NUMBER = 9;
    private int combineId_;
    /**
     * <code>uint32 combine_id = 9;</code>
     * @return The combineId.
     */
    @java.lang.Override
    public int getCombineId() {
      return combineId_;
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
      if (isLocked_ != false) {
        output.writeBool(7, isLocked_);
      }
      if (combineId_ != 0) {
        output.writeUInt32(9, combineId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isLocked_);
      }
      if (combineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, combineId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify other = (emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (getCombineId()
          != other.getCombineId()) return false;
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
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      hash = (37 * hash) + COMBINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCombineId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify prototype) {
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
     * CmdId: 622
     * Name: BKJBIOIIJNB
     * </pre>
     *
     * Protobuf type {@code CombineFormulaDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombineFormulaDataNotify)
        emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.class, emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.newBuilder()
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
        isLocked_ = false;

        combineId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify build() {
        emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify buildPartial() {
        emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify result = new emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify(this);
        result.isLocked_ = isLocked_;
        result.combineId_ = combineId_;
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
        if (other instanceof emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify other) {
        if (other == emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (other.getCombineId() != 0) {
          setCombineId(other.getCombineId());
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
        emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 7;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 7;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
        onChanged();
        return this;
      }

      private int combineId_ ;
      /**
       * <code>uint32 combine_id = 9;</code>
       * @return The combineId.
       */
      @java.lang.Override
      public int getCombineId() {
        return combineId_;
      }
      /**
       * <code>uint32 combine_id = 9;</code>
       * @param value The combineId to set.
       * @return This builder for chaining.
       */
      public Builder setCombineId(int value) {
        
        combineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combine_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineId() {
        
        combineId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CombineFormulaDataNotify)
    }

    // @@protoc_insertion_point(class_scope:CombineFormulaDataNotify)
    private static final emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify();
    }

    public static emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombineFormulaDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<CombineFormulaDataNotify>() {
      @java.lang.Override
      public CombineFormulaDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CombineFormulaDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CombineFormulaDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombineFormulaDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CombineFormulaDataNotifyOuterClass.CombineFormulaDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombineFormulaDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombineFormulaDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036CombineFormulaDataNotify.proto\"A\n\030Comb" +
      "ineFormulaDataNotify\022\021\n\tis_locked\030\007 \001(\010\022" +
      "\022\n\ncombine_id\030\t \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CombineFormulaDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombineFormulaDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombineFormulaDataNotify_descriptor,
        new java.lang.String[] { "IsLocked", "CombineId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
