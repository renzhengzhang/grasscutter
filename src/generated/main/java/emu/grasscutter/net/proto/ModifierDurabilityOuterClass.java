// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ModifierDurability.proto

package emu.grasscutter.net.proto;

public final class ModifierDurabilityOuterClass {
  private ModifierDurabilityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModifierDurabilityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ModifierDurability)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float HGJMHAFDFOC = 1;</code>
     * @return The hGJMHAFDFOC.
     */
    float getHGJMHAFDFOC();

    /**
     * <code>float AFFIDFJHCFM = 2;</code>
     * @return The aFFIDFJHCFM.
     */
    float getAFFIDFJHCFM();
  }
  /**
   * <pre>
   * Name: DKJFENEJIFH
   * </pre>
   *
   * Protobuf type {@code ModifierDurability}
   */
  public static final class ModifierDurability extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ModifierDurability)
      ModifierDurabilityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifierDurability.newBuilder() to construct.
    private ModifierDurability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifierDurability() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ModifierDurability();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ModifierDurability(
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
            case 13: {

              hGJMHAFDFOC_ = input.readFloat();
              break;
            }
            case 21: {

              aFFIDFJHCFM_ = input.readFloat();
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
      return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.class, emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.Builder.class);
    }

    public static final int HGJMHAFDFOC_FIELD_NUMBER = 1;
    private float hGJMHAFDFOC_;
    /**
     * <code>float HGJMHAFDFOC = 1;</code>
     * @return The hGJMHAFDFOC.
     */
    @java.lang.Override
    public float getHGJMHAFDFOC() {
      return hGJMHAFDFOC_;
    }

    public static final int AFFIDFJHCFM_FIELD_NUMBER = 2;
    private float aFFIDFJHCFM_;
    /**
     * <code>float AFFIDFJHCFM = 2;</code>
     * @return The aFFIDFJHCFM.
     */
    @java.lang.Override
    public float getAFFIDFJHCFM() {
      return aFFIDFJHCFM_;
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
      if (hGJMHAFDFOC_ != 0F) {
        output.writeFloat(1, hGJMHAFDFOC_);
      }
      if (aFFIDFJHCFM_ != 0F) {
        output.writeFloat(2, aFFIDFJHCFM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hGJMHAFDFOC_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, hGJMHAFDFOC_);
      }
      if (aFFIDFJHCFM_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, aFFIDFJHCFM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability other = (emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability) obj;

      if (java.lang.Float.floatToIntBits(getHGJMHAFDFOC())
          != java.lang.Float.floatToIntBits(
              other.getHGJMHAFDFOC())) return false;
      if (java.lang.Float.floatToIntBits(getAFFIDFJHCFM())
          != java.lang.Float.floatToIntBits(
              other.getAFFIDFJHCFM())) return false;
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
      hash = (37 * hash) + HGJMHAFDFOC_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHGJMHAFDFOC());
      hash = (37 * hash) + AFFIDFJHCFM_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAFFIDFJHCFM());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability prototype) {
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
     * Name: DKJFENEJIFH
     * </pre>
     *
     * Protobuf type {@code ModifierDurability}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ModifierDurability)
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurabilityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.class, emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.newBuilder()
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
        hGJMHAFDFOC_ = 0F;

        aFFIDFJHCFM_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.internal_static_ModifierDurability_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability build() {
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability buildPartial() {
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability result = new emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability(this);
        result.hGJMHAFDFOC_ = hGJMHAFDFOC_;
        result.aFFIDFJHCFM_ = aFFIDFJHCFM_;
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
        if (other instanceof emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability) {
          return mergeFrom((emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability other) {
        if (other == emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability.getDefaultInstance()) return this;
        if (other.getHGJMHAFDFOC() != 0F) {
          setHGJMHAFDFOC(other.getHGJMHAFDFOC());
        }
        if (other.getAFFIDFJHCFM() != 0F) {
          setAFFIDFJHCFM(other.getAFFIDFJHCFM());
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
        emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float hGJMHAFDFOC_ ;
      /**
       * <code>float HGJMHAFDFOC = 1;</code>
       * @return The hGJMHAFDFOC.
       */
      @java.lang.Override
      public float getHGJMHAFDFOC() {
        return hGJMHAFDFOC_;
      }
      /**
       * <code>float HGJMHAFDFOC = 1;</code>
       * @param value The hGJMHAFDFOC to set.
       * @return This builder for chaining.
       */
      public Builder setHGJMHAFDFOC(float value) {
        
        hGJMHAFDFOC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float HGJMHAFDFOC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHGJMHAFDFOC() {
        
        hGJMHAFDFOC_ = 0F;
        onChanged();
        return this;
      }

      private float aFFIDFJHCFM_ ;
      /**
       * <code>float AFFIDFJHCFM = 2;</code>
       * @return The aFFIDFJHCFM.
       */
      @java.lang.Override
      public float getAFFIDFJHCFM() {
        return aFFIDFJHCFM_;
      }
      /**
       * <code>float AFFIDFJHCFM = 2;</code>
       * @param value The aFFIDFJHCFM to set.
       * @return This builder for chaining.
       */
      public Builder setAFFIDFJHCFM(float value) {
        
        aFFIDFJHCFM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float AFFIDFJHCFM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAFFIDFJHCFM() {
        
        aFFIDFJHCFM_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:ModifierDurability)
    }

    // @@protoc_insertion_point(class_scope:ModifierDurability)
    private static final emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability();
    }

    public static emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ModifierDurability>
        PARSER = new com.google.protobuf.AbstractParser<ModifierDurability>() {
      @java.lang.Override
      public ModifierDurability parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ModifierDurability(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ModifierDurability> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ModifierDurability> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ModifierDurabilityOuterClass.ModifierDurability getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifierDurability_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifierDurability_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ModifierDurability.proto\">\n\022ModifierDu" +
      "rability\022\023\n\013HGJMHAFDFOC\030\001 \001(\002\022\023\n\013AFFIDFJ" +
      "HCFM\030\002 \001(\002B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ModifierDurability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ModifierDurability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifierDurability_descriptor,
        new java.lang.String[] { "HGJMHAFDFOC", "AFFIDFJHCFM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
