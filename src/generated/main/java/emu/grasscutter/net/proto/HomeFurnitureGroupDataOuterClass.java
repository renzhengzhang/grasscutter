// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFurnitureGroupData.proto

package emu.grasscutter.net.proto;

public final class HomeFurnitureGroupDataOuterClass {
  private HomeFurnitureGroupDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFurnitureGroupDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFurnitureGroupData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> 
        getVirtualFurniureListList();
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurniureList(int index);
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    int getVirtualFurniureListCount();
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
        getVirtualFurniureListOrBuilderList();
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurniureListOrBuilder(
        int index);

    /**
     * <code>uint32 group_furniture_index = 12;</code>
     * @return The groupFurnitureIndex.
     */
    int getGroupFurnitureIndex();
  }
  /**
   * <pre>
   * Name: LONHLJHJKOJ
   * </pre>
   *
   * Protobuf type {@code HomeFurnitureGroupData}
   */
  public static final class HomeFurnitureGroupData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFurnitureGroupData)
      HomeFurnitureGroupDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFurnitureGroupData.newBuilder() to construct.
    private HomeFurnitureGroupData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFurnitureGroupData() {
      virtualFurniureList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFurnitureGroupData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeFurnitureGroupData(
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
            case 96: {

              groupFurnitureIndex_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                virtualFurniureList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData>();
                mutable_bitField0_ |= 0x00000001;
              }
              virtualFurniureList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          virtualFurniureList_ = java.util.Collections.unmodifiableList(virtualFurniureList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.class, emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.Builder.class);
    }

    public static final int VIRTUAL_FURNIURE_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> virtualFurniureList_;
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> getVirtualFurniureListList() {
      return virtualFurniureList_;
    }
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
        getVirtualFurniureListOrBuilderList() {
      return virtualFurniureList_;
    }
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    @java.lang.Override
    public int getVirtualFurniureListCount() {
      return virtualFurniureList_.size();
    }
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurniureList(int index) {
      return virtualFurniureList_.get(index);
    }
    /**
     * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurniureListOrBuilder(
        int index) {
      return virtualFurniureList_.get(index);
    }

    public static final int GROUP_FURNITURE_INDEX_FIELD_NUMBER = 12;
    private int groupFurnitureIndex_;
    /**
     * <code>uint32 group_furniture_index = 12;</code>
     * @return The groupFurnitureIndex.
     */
    @java.lang.Override
    public int getGroupFurnitureIndex() {
      return groupFurnitureIndex_;
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
      if (groupFurnitureIndex_ != 0) {
        output.writeUInt32(12, groupFurnitureIndex_);
      }
      for (int i = 0; i < virtualFurniureList_.size(); i++) {
        output.writeMessage(15, virtualFurniureList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupFurnitureIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, groupFurnitureIndex_);
      }
      for (int i = 0; i < virtualFurniureList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, virtualFurniureList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData other = (emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData) obj;

      if (!getVirtualFurniureListList()
          .equals(other.getVirtualFurniureListList())) return false;
      if (getGroupFurnitureIndex()
          != other.getGroupFurnitureIndex()) return false;
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
      if (getVirtualFurniureListCount() > 0) {
        hash = (37 * hash) + VIRTUAL_FURNIURE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getVirtualFurniureListList().hashCode();
      }
      hash = (37 * hash) + GROUP_FURNITURE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getGroupFurnitureIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData prototype) {
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
     * Name: LONHLJHJKOJ
     * </pre>
     *
     * Protobuf type {@code HomeFurnitureGroupData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFurnitureGroupData)
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.class, emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.newBuilder()
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
          getVirtualFurniureListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (virtualFurniureListBuilder_ == null) {
          virtualFurniureList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          virtualFurniureListBuilder_.clear();
        }
        groupFurnitureIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.internal_static_HomeFurnitureGroupData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData build() {
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData buildPartial() {
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData result = new emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData(this);
        int from_bitField0_ = bitField0_;
        if (virtualFurniureListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            virtualFurniureList_ = java.util.Collections.unmodifiableList(virtualFurniureList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.virtualFurniureList_ = virtualFurniureList_;
        } else {
          result.virtualFurniureList_ = virtualFurniureListBuilder_.build();
        }
        result.groupFurnitureIndex_ = groupFurnitureIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData) {
          return mergeFrom((emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData other) {
        if (other == emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData.getDefaultInstance()) return this;
        if (virtualFurniureListBuilder_ == null) {
          if (!other.virtualFurniureList_.isEmpty()) {
            if (virtualFurniureList_.isEmpty()) {
              virtualFurniureList_ = other.virtualFurniureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureVirtualFurniureListIsMutable();
              virtualFurniureList_.addAll(other.virtualFurniureList_);
            }
            onChanged();
          }
        } else {
          if (!other.virtualFurniureList_.isEmpty()) {
            if (virtualFurniureListBuilder_.isEmpty()) {
              virtualFurniureListBuilder_.dispose();
              virtualFurniureListBuilder_ = null;
              virtualFurniureList_ = other.virtualFurniureList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              virtualFurniureListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getVirtualFurniureListFieldBuilder() : null;
            } else {
              virtualFurniureListBuilder_.addAllMessages(other.virtualFurniureList_);
            }
          }
        }
        if (other.getGroupFurnitureIndex() != 0) {
          setGroupFurnitureIndex(other.getGroupFurnitureIndex());
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
        emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> virtualFurniureList_ =
        java.util.Collections.emptyList();
      private void ensureVirtualFurniureListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          virtualFurniureList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData>(virtualFurniureList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> virtualFurniureListBuilder_;

      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> getVirtualFurniureListList() {
        if (virtualFurniureListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(virtualFurniureList_);
        } else {
          return virtualFurniureListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public int getVirtualFurniureListCount() {
        if (virtualFurniureListBuilder_ == null) {
          return virtualFurniureList_.size();
        } else {
          return virtualFurniureListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData getVirtualFurniureList(int index) {
        if (virtualFurniureListBuilder_ == null) {
          return virtualFurniureList_.get(index);
        } else {
          return virtualFurniureListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder setVirtualFurniureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurniureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.set(index, value);
          onChanged();
        } else {
          virtualFurniureListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder setVirtualFurniureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurniureListBuilder_ == null) {
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.set(index, builderForValue.build());
          onChanged();
        } else {
          virtualFurniureListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder addVirtualFurniureList(emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurniureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.add(value);
          onChanged();
        } else {
          virtualFurniureListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder addVirtualFurniureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData value) {
        if (virtualFurniureListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.add(index, value);
          onChanged();
        } else {
          virtualFurniureListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder addVirtualFurniureList(
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurniureListBuilder_ == null) {
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.add(builderForValue.build());
          onChanged();
        } else {
          virtualFurniureListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder addVirtualFurniureList(
          int index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
        if (virtualFurniureListBuilder_ == null) {
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.add(index, builderForValue.build());
          onChanged();
        } else {
          virtualFurniureListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder addAllVirtualFurniureList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
        if (virtualFurniureListBuilder_ == null) {
          ensureVirtualFurniureListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, virtualFurniureList_);
          onChanged();
        } else {
          virtualFurniureListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder clearVirtualFurniureList() {
        if (virtualFurniureListBuilder_ == null) {
          virtualFurniureList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          virtualFurniureListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public Builder removeVirtualFurniureList(int index) {
        if (virtualFurniureListBuilder_ == null) {
          ensureVirtualFurniureListIsMutable();
          virtualFurniureList_.remove(index);
          onChanged();
        } else {
          virtualFurniureListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getVirtualFurniureListBuilder(
          int index) {
        return getVirtualFurniureListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getVirtualFurniureListOrBuilder(
          int index) {
        if (virtualFurniureListBuilder_ == null) {
          return virtualFurniureList_.get(index);  } else {
          return virtualFurniureListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
           getVirtualFurniureListOrBuilderList() {
        if (virtualFurniureListBuilder_ != null) {
          return virtualFurniureListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(virtualFurniureList_);
        }
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addVirtualFurniureListBuilder() {
        return getVirtualFurniureListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addVirtualFurniureListBuilder(
          int index) {
        return getVirtualFurniureListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFurnitureData virtual_furniure_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> 
           getVirtualFurniureListBuilderList() {
        return getVirtualFurniureListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> 
          getVirtualFurniureListFieldBuilder() {
        if (virtualFurniureListBuilder_ == null) {
          virtualFurniureListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(
                  virtualFurniureList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          virtualFurniureList_ = null;
        }
        return virtualFurniureListBuilder_;
      }

      private int groupFurnitureIndex_ ;
      /**
       * <code>uint32 group_furniture_index = 12;</code>
       * @return The groupFurnitureIndex.
       */
      @java.lang.Override
      public int getGroupFurnitureIndex() {
        return groupFurnitureIndex_;
      }
      /**
       * <code>uint32 group_furniture_index = 12;</code>
       * @param value The groupFurnitureIndex to set.
       * @return This builder for chaining.
       */
      public Builder setGroupFurnitureIndex(int value) {
        
        groupFurnitureIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_furniture_index = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupFurnitureIndex() {
        
        groupFurnitureIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeFurnitureGroupData)
    }

    // @@protoc_insertion_point(class_scope:HomeFurnitureGroupData)
    private static final emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData();
    }

    public static emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFurnitureGroupData>
        PARSER = new com.google.protobuf.AbstractParser<HomeFurnitureGroupData>() {
      @java.lang.Override
      public HomeFurnitureGroupData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeFurnitureGroupData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeFurnitureGroupData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFurnitureGroupData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFurnitureGroupDataOuterClass.HomeFurnitureGroupData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFurnitureGroupData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFurnitureGroupData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeFurnitureGroupData.proto\032\027HomeFurn" +
      "itureData.proto\"j\n\026HomeFurnitureGroupDat" +
      "a\0221\n\025virtual_furniure_list\030\017 \003(\0132\022.HomeF" +
      "urnitureData\022\035\n\025group_furniture_index\030\014 " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.getDescriptor(),
        });
    internal_static_HomeFurnitureGroupData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFurnitureGroupData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFurnitureGroupData_descriptor,
        new java.lang.String[] { "VirtualFurniureList", "GroupFurnitureIndex", });
    emu.grasscutter.net.proto.HomeFurnitureDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
