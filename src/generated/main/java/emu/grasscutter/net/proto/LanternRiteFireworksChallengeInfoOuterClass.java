// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteFireworksChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class LanternRiteFireworksChallengeInfoOuterClass {
  private LanternRiteFireworksChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteFireworksChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteFireworksChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 5;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 best_score = 14;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>bool is_full_score = 13;</code>
     * @return The isFullScore.
     */
    boolean getIsFullScore();
  }
  /**
   * <pre>
   * Name: PHALMEICHMB
   * </pre>
   *
   * Protobuf type {@code LanternRiteFireworksChallengeInfo}
   */
  public static final class LanternRiteFireworksChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteFireworksChallengeInfo)
      LanternRiteFireworksChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteFireworksChallengeInfo.newBuilder() to construct.
    private LanternRiteFireworksChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteFireworksChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteFireworksChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanternRiteFireworksChallengeInfo(
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
            case 40: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 104: {

              isFullScore_ = input.readBool();
              break;
            }
            case 112: {

              bestScore_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.class, emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 5;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 5;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 14;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 14;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int IS_FULL_SCORE_FIELD_NUMBER = 13;
    private boolean isFullScore_;
    /**
     * <code>bool is_full_score = 13;</code>
     * @return The isFullScore.
     */
    @java.lang.Override
    public boolean getIsFullScore() {
      return isFullScore_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(5, challengeId_);
      }
      if (isFullScore_ != false) {
        output.writeBool(13, isFullScore_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(14, bestScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeId_);
      }
      if (isFullScore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isFullScore_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, bestScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo other = (emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getIsFullScore()
          != other.getIsFullScore()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + IS_FULL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFullScore());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo prototype) {
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
     * Name: PHALMEICHMB
     * </pre>
     *
     * Protobuf type {@code LanternRiteFireworksChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteFireworksChallengeInfo)
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.class, emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.newBuilder()
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
        challengeId_ = 0;

        bestScore_ = 0;

        isFullScore_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo build() {
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo result = new emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo(this);
        result.challengeId_ = challengeId_;
        result.bestScore_ = bestScore_;
        result.isFullScore_ = isFullScore_;
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
        if (other instanceof emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getIsFullScore() != false) {
          setIsFullScore(other.getIsFullScore());
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
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 14;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 14;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isFullScore_ ;
      /**
       * <code>bool is_full_score = 13;</code>
       * @return The isFullScore.
       */
      @java.lang.Override
      public boolean getIsFullScore() {
        return isFullScore_;
      }
      /**
       * <code>bool is_full_score = 13;</code>
       * @param value The isFullScore to set.
       * @return This builder for chaining.
       */
      public Builder setIsFullScore(boolean value) {
        
        isFullScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_full_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFullScore() {
        
        isFullScore_ = false;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteFireworksChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteFireworksChallengeInfo)
    private static final emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo();
    }

    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksChallengeInfo>() {
      @java.lang.Override
      public LanternRiteFireworksChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanternRiteFireworksChallengeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteFireworksChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'LanternRiteFireworksChallengeInfo.prot" +
      "o\"d\n!LanternRiteFireworksChallengeInfo\022\024" +
      "\n\014challenge_id\030\005 \001(\r\022\022\n\nbest_score\030\016 \001(\r" +
      "\022\025\n\ris_full_score\030\r \001(\010B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteFireworksChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteFireworksChallengeInfo_descriptor,
        new java.lang.String[] { "ChallengeId", "BestScore", "IsFullScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
