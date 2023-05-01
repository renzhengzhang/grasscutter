// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VectorPlane.proto

package emu.grasscutter.net.proto;

public final class VectorPlaneOuterClass {
  private VectorPlaneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VectorPlaneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VectorPlane)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float x = 1;</code>
     * @return The x.
     */
    float getX();

    /**
     * <code>float y = 2;</code>
     * @return The y.
     */
    float getY();
  }
  /**
   * <pre>
   * Name: KCKOEEDAIMB
   * </pre>
   *
   * Protobuf type {@code VectorPlane}
   */
  public static final class VectorPlane extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VectorPlane)
      VectorPlaneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VectorPlane.newBuilder() to construct.
    private VectorPlane(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VectorPlane() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VectorPlane();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VectorPlane(
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

              x_ = input.readFloat();
              break;
            }
            case 21: {

              y_ = input.readFloat();
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
      return emu.grasscutter.net.proto.VectorPlaneOuterClass.internal_static_VectorPlane_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VectorPlaneOuterClass.internal_static_VectorPlane_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.class, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private float x_;
    /**
     * <code>float x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private float y_;
    /**
     * <code>float y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
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
      if (x_ != 0F) {
        output.writeFloat(1, x_);
      }
      if (y_ != 0F) {
        output.writeFloat(2, y_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (x_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, x_);
      }
      if (y_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, y_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane other = (emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane) obj;

      if (java.lang.Float.floatToIntBits(getX())
          != java.lang.Float.floatToIntBits(
              other.getX())) return false;
      if (java.lang.Float.floatToIntBits(getY())
          != java.lang.Float.floatToIntBits(
              other.getY())) return false;
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
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getX());
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getY());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane prototype) {
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
     * Name: KCKOEEDAIMB
     * </pre>
     *
     * Protobuf type {@code VectorPlane}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VectorPlane)
        emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VectorPlaneOuterClass.internal_static_VectorPlane_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VectorPlaneOuterClass.internal_static_VectorPlane_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.class, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.newBuilder()
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
        x_ = 0F;

        y_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VectorPlaneOuterClass.internal_static_VectorPlane_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane build() {
        emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane buildPartial() {
        emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane result = new emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane(this);
        result.x_ = x_;
        result.y_ = y_;
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
        if (other instanceof emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane) {
          return mergeFrom((emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane other) {
        if (other == emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.getDefaultInstance()) return this;
        if (other.getX() != 0F) {
          setX(other.getX());
        }
        if (other.getY() != 0F) {
          setY(other.getY());
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
        emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float x_ ;
      /**
       * <code>float x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public float getX() {
        return x_;
      }
      /**
       * <code>float x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(float value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0F;
        onChanged();
        return this;
      }

      private float y_ ;
      /**
       * <code>float y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public float getY() {
        return y_;
      }
      /**
       * <code>float y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(float value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:VectorPlane)
    }

    // @@protoc_insertion_point(class_scope:VectorPlane)
    private static final emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane();
    }

    public static emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VectorPlane>
        PARSER = new com.google.protobuf.AbstractParser<VectorPlane>() {
      @java.lang.Override
      public VectorPlane parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VectorPlane(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VectorPlane> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VectorPlane> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VectorPlane_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VectorPlane_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021VectorPlane.proto\"#\n\013VectorPlane\022\t\n\001x\030" +
      "\001 \001(\002\022\t\n\001y\030\002 \001(\002B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VectorPlane_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VectorPlane_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VectorPlane_descriptor,
        new java.lang.String[] { "X", "Y", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
