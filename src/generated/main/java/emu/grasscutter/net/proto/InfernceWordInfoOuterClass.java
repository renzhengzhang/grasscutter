// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InfernceWordInfo.proto

package emu.grasscutter.net.proto;

public final class InfernceWordInfoOuterClass {
  private InfernceWordInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InfernceWordInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InfernceWordInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool MDPDECFIPAN = 11;</code>
     * @return The mDPDECFIPAN.
     */
    boolean getMDPDECFIPAN();

    /**
     * <code>uint32 unlock_by_word_id = 1;</code>
     * @return The unlockByWordId.
     */
    int getUnlockByWordId();

    /**
     * <code>uint32 word_id = 10;</code>
     * @return The wordId.
     */
    int getWordId();

    /**
     * <code>bool DJFAOPBHEAL = 4;</code>
     * @return The dJFAOPBHEAL.
     */
    boolean getDJFAOPBHEAL();

    /**
     * <code>bool OPBALHEMOEE = 3;</code>
     * @return The oPBALHEMOEE.
     */
    boolean getOPBALHEMOEE();
  }
  /**
   * <pre>
   * Name: FKGOBJOHHBL
   * </pre>
   *
   * Protobuf type {@code InfernceWordInfo}
   */
  public static final class InfernceWordInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InfernceWordInfo)
      InfernceWordInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InfernceWordInfo.newBuilder() to construct.
    private InfernceWordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InfernceWordInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InfernceWordInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InfernceWordInfo(
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
            case 8: {

              unlockByWordId_ = input.readUInt32();
              break;
            }
            case 24: {

              oPBALHEMOEE_ = input.readBool();
              break;
            }
            case 32: {

              dJFAOPBHEAL_ = input.readBool();
              break;
            }
            case 80: {

              wordId_ = input.readUInt32();
              break;
            }
            case 88: {

              mDPDECFIPAN_ = input.readBool();
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
      return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.class, emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.Builder.class);
    }

    public static final int MDPDECFIPAN_FIELD_NUMBER = 11;
    private boolean mDPDECFIPAN_;
    /**
     * <code>bool MDPDECFIPAN = 11;</code>
     * @return The mDPDECFIPAN.
     */
    @java.lang.Override
    public boolean getMDPDECFIPAN() {
      return mDPDECFIPAN_;
    }

    public static final int UNLOCK_BY_WORD_ID_FIELD_NUMBER = 1;
    private int unlockByWordId_;
    /**
     * <code>uint32 unlock_by_word_id = 1;</code>
     * @return The unlockByWordId.
     */
    @java.lang.Override
    public int getUnlockByWordId() {
      return unlockByWordId_;
    }

    public static final int WORD_ID_FIELD_NUMBER = 10;
    private int wordId_;
    /**
     * <code>uint32 word_id = 10;</code>
     * @return The wordId.
     */
    @java.lang.Override
    public int getWordId() {
      return wordId_;
    }

    public static final int DJFAOPBHEAL_FIELD_NUMBER = 4;
    private boolean dJFAOPBHEAL_;
    /**
     * <code>bool DJFAOPBHEAL = 4;</code>
     * @return The dJFAOPBHEAL.
     */
    @java.lang.Override
    public boolean getDJFAOPBHEAL() {
      return dJFAOPBHEAL_;
    }

    public static final int OPBALHEMOEE_FIELD_NUMBER = 3;
    private boolean oPBALHEMOEE_;
    /**
     * <code>bool OPBALHEMOEE = 3;</code>
     * @return The oPBALHEMOEE.
     */
    @java.lang.Override
    public boolean getOPBALHEMOEE() {
      return oPBALHEMOEE_;
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
      if (unlockByWordId_ != 0) {
        output.writeUInt32(1, unlockByWordId_);
      }
      if (oPBALHEMOEE_ != false) {
        output.writeBool(3, oPBALHEMOEE_);
      }
      if (dJFAOPBHEAL_ != false) {
        output.writeBool(4, dJFAOPBHEAL_);
      }
      if (wordId_ != 0) {
        output.writeUInt32(10, wordId_);
      }
      if (mDPDECFIPAN_ != false) {
        output.writeBool(11, mDPDECFIPAN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unlockByWordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unlockByWordId_);
      }
      if (oPBALHEMOEE_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, oPBALHEMOEE_);
      }
      if (dJFAOPBHEAL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, dJFAOPBHEAL_);
      }
      if (wordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, wordId_);
      }
      if (mDPDECFIPAN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, mDPDECFIPAN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo other = (emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) obj;

      if (getMDPDECFIPAN()
          != other.getMDPDECFIPAN()) return false;
      if (getUnlockByWordId()
          != other.getUnlockByWordId()) return false;
      if (getWordId()
          != other.getWordId()) return false;
      if (getDJFAOPBHEAL()
          != other.getDJFAOPBHEAL()) return false;
      if (getOPBALHEMOEE()
          != other.getOPBALHEMOEE()) return false;
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
      hash = (37 * hash) + MDPDECFIPAN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMDPDECFIPAN());
      hash = (37 * hash) + UNLOCK_BY_WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUnlockByWordId();
      hash = (37 * hash) + WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWordId();
      hash = (37 * hash) + DJFAOPBHEAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDJFAOPBHEAL());
      hash = (37 * hash) + OPBALHEMOEE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOPBALHEMOEE());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo prototype) {
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
     * Name: FKGOBJOHHBL
     * </pre>
     *
     * Protobuf type {@code InfernceWordInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InfernceWordInfo)
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.class, emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.newBuilder()
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
        mDPDECFIPAN_ = false;

        unlockByWordId_ = 0;

        wordId_ = 0;

        dJFAOPBHEAL_ = false;

        oPBALHEMOEE_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.internal_static_InfernceWordInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo build() {
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo buildPartial() {
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo result = new emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo(this);
        result.mDPDECFIPAN_ = mDPDECFIPAN_;
        result.unlockByWordId_ = unlockByWordId_;
        result.wordId_ = wordId_;
        result.dJFAOPBHEAL_ = dJFAOPBHEAL_;
        result.oPBALHEMOEE_ = oPBALHEMOEE_;
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
        if (other instanceof emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo other) {
        if (other == emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo.getDefaultInstance()) return this;
        if (other.getMDPDECFIPAN() != false) {
          setMDPDECFIPAN(other.getMDPDECFIPAN());
        }
        if (other.getUnlockByWordId() != 0) {
          setUnlockByWordId(other.getUnlockByWordId());
        }
        if (other.getWordId() != 0) {
          setWordId(other.getWordId());
        }
        if (other.getDJFAOPBHEAL() != false) {
          setDJFAOPBHEAL(other.getDJFAOPBHEAL());
        }
        if (other.getOPBALHEMOEE() != false) {
          setOPBALHEMOEE(other.getOPBALHEMOEE());
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
        emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean mDPDECFIPAN_ ;
      /**
       * <code>bool MDPDECFIPAN = 11;</code>
       * @return The mDPDECFIPAN.
       */
      @java.lang.Override
      public boolean getMDPDECFIPAN() {
        return mDPDECFIPAN_;
      }
      /**
       * <code>bool MDPDECFIPAN = 11;</code>
       * @param value The mDPDECFIPAN to set.
       * @return This builder for chaining.
       */
      public Builder setMDPDECFIPAN(boolean value) {
        
        mDPDECFIPAN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool MDPDECFIPAN = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMDPDECFIPAN() {
        
        mDPDECFIPAN_ = false;
        onChanged();
        return this;
      }

      private int unlockByWordId_ ;
      /**
       * <code>uint32 unlock_by_word_id = 1;</code>
       * @return The unlockByWordId.
       */
      @java.lang.Override
      public int getUnlockByWordId() {
        return unlockByWordId_;
      }
      /**
       * <code>uint32 unlock_by_word_id = 1;</code>
       * @param value The unlockByWordId to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockByWordId(int value) {
        
        unlockByWordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unlock_by_word_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockByWordId() {
        
        unlockByWordId_ = 0;
        onChanged();
        return this;
      }

      private int wordId_ ;
      /**
       * <code>uint32 word_id = 10;</code>
       * @return The wordId.
       */
      @java.lang.Override
      public int getWordId() {
        return wordId_;
      }
      /**
       * <code>uint32 word_id = 10;</code>
       * @param value The wordId to set.
       * @return This builder for chaining.
       */
      public Builder setWordId(int value) {
        
        wordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 word_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordId() {
        
        wordId_ = 0;
        onChanged();
        return this;
      }

      private boolean dJFAOPBHEAL_ ;
      /**
       * <code>bool DJFAOPBHEAL = 4;</code>
       * @return The dJFAOPBHEAL.
       */
      @java.lang.Override
      public boolean getDJFAOPBHEAL() {
        return dJFAOPBHEAL_;
      }
      /**
       * <code>bool DJFAOPBHEAL = 4;</code>
       * @param value The dJFAOPBHEAL to set.
       * @return This builder for chaining.
       */
      public Builder setDJFAOPBHEAL(boolean value) {
        
        dJFAOPBHEAL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool DJFAOPBHEAL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDJFAOPBHEAL() {
        
        dJFAOPBHEAL_ = false;
        onChanged();
        return this;
      }

      private boolean oPBALHEMOEE_ ;
      /**
       * <code>bool OPBALHEMOEE = 3;</code>
       * @return The oPBALHEMOEE.
       */
      @java.lang.Override
      public boolean getOPBALHEMOEE() {
        return oPBALHEMOEE_;
      }
      /**
       * <code>bool OPBALHEMOEE = 3;</code>
       * @param value The oPBALHEMOEE to set.
       * @return This builder for chaining.
       */
      public Builder setOPBALHEMOEE(boolean value) {
        
        oPBALHEMOEE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool OPBALHEMOEE = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOPBALHEMOEE() {
        
        oPBALHEMOEE_ = false;
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


      // @@protoc_insertion_point(builder_scope:InfernceWordInfo)
    }

    // @@protoc_insertion_point(class_scope:InfernceWordInfo)
    private static final emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo();
    }

    public static emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InfernceWordInfo>
        PARSER = new com.google.protobuf.AbstractParser<InfernceWordInfo>() {
      @java.lang.Override
      public InfernceWordInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InfernceWordInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InfernceWordInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InfernceWordInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InfernceWordInfoOuterClass.InfernceWordInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfernceWordInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfernceWordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026InfernceWordInfo.proto\"}\n\020InfernceWord" +
      "Info\022\023\n\013MDPDECFIPAN\030\013 \001(\010\022\031\n\021unlock_by_w" +
      "ord_id\030\001 \001(\r\022\017\n\007word_id\030\n \001(\r\022\023\n\013DJFAOPB" +
      "HEAL\030\004 \001(\010\022\023\n\013OPBALHEMOEE\030\003 \001(\010B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InfernceWordInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InfernceWordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfernceWordInfo_descriptor,
        new java.lang.String[] { "MDPDECFIPAN", "UnlockByWordId", "WordId", "DJFAOPBHEAL", "OPBALHEMOEE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
