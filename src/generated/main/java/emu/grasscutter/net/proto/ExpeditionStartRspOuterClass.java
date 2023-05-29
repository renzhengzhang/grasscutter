// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionStartRsp.proto

package emu.grasscutter.net.proto;

public final class ExpeditionStartRspOuterClass {
    private ExpeditionStartRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ExpeditionStartRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ExpeditionStartRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 3;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 FLHKBCEIKLE = 9;</code>
         *
         * @return The fLHKBCEIKLE.
         */
        int getFLHKBCEIKLE();

        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @return A list containing the avatarIdList.
         */
        java.util.List<java.lang.Integer> getAvatarIdListList();
        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @return The count of avatarIdList.
         */
        int getAvatarIdListCount();
        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @param index The index of the element to return.
         * @return The avatarIdList at the given index.
         */
        int getAvatarIdList(int index);

        /**
         * <code>uint32 MFNGJOCIAPE = 6;</code>
         *
         * @return The mFNGJOCIAPE.
         */
        int getMFNGJOCIAPE();

        /**
         * <code>uint32 path_id = 1;</code>
         *
         * @return The pathId.
         */
        int getPathId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2049
     * Obf: OKAMLPHOFID
     * </pre>
     *
     * Protobuf type {@code ExpeditionStartRsp}
     */
    public static final class ExpeditionStartRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ExpeditionStartRsp)
            ExpeditionStartRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ExpeditionStartRsp.newBuilder() to construct.
        private ExpeditionStartRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ExpeditionStartRsp() {
            avatarIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ExpeditionStartRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ExpeditionStartRsp(
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
                        case 8:
                            {
                                pathId_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 48:
                            {
                                mFNGJOCIAPE_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    avatarIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                avatarIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 66:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    avatarIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    avatarIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 72:
                            {
                                fLHKBCEIKLE_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    avatarIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass
                    .internal_static_ExpeditionStartRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass
                    .internal_static_ExpeditionStartRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp.class,
                            emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp.Builder
                                    .class);
        }

        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        /**
         * <code>int32 retcode = 3;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int FLHKBCEIKLE_FIELD_NUMBER = 9;
        private int fLHKBCEIKLE_;
        /**
         * <code>uint32 FLHKBCEIKLE = 9;</code>
         *
         * @return The fLHKBCEIKLE.
         */
        @java.lang.Override
        public int getFLHKBCEIKLE() {
            return fLHKBCEIKLE_;
        }

        public static final int AVATAR_ID_LIST_FIELD_NUMBER = 8;
        private com.google.protobuf.Internal.IntList avatarIdList_;
        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @return A list containing the avatarIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getAvatarIdListList() {
            return avatarIdList_;
        }
        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @return The count of avatarIdList.
         */
        public int getAvatarIdListCount() {
            return avatarIdList_.size();
        }
        /**
         * <code>repeated uint32 avatar_id_list = 8;</code>
         *
         * @param index The index of the element to return.
         * @return The avatarIdList at the given index.
         */
        public int getAvatarIdList(int index) {
            return avatarIdList_.getInt(index);
        }

        private int avatarIdListMemoizedSerializedSize = -1;

        public static final int MFNGJOCIAPE_FIELD_NUMBER = 6;
        private int mFNGJOCIAPE_;
        /**
         * <code>uint32 MFNGJOCIAPE = 6;</code>
         *
         * @return The mFNGJOCIAPE.
         */
        @java.lang.Override
        public int getMFNGJOCIAPE() {
            return mFNGJOCIAPE_;
        }

        public static final int PATH_ID_FIELD_NUMBER = 1;
        private int pathId_;
        /**
         * <code>uint32 path_id = 1;</code>
         *
         * @return The pathId.
         */
        @java.lang.Override
        public int getPathId() {
            return pathId_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            if (pathId_ != 0) {
                output.writeUInt32(1, pathId_);
            }
            if (retcode_ != 0) {
                output.writeInt32(3, retcode_);
            }
            if (mFNGJOCIAPE_ != 0) {
                output.writeUInt32(6, mFNGJOCIAPE_);
            }
            if (getAvatarIdListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(avatarIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < avatarIdList_.size(); i++) {
                output.writeUInt32NoTag(avatarIdList_.getInt(i));
            }
            if (fLHKBCEIKLE_ != 0) {
                output.writeUInt32(9, fLHKBCEIKLE_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (pathId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, pathId_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, retcode_);
            }
            if (mFNGJOCIAPE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, mFNGJOCIAPE_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < avatarIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(avatarIdList_.getInt(i));
                }
                size += dataSize;
                if (!getAvatarIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                avatarIdListMemoizedSerializedSize = dataSize;
            }
            if (fLHKBCEIKLE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, fLHKBCEIKLE_);
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
            if (!(obj
                    instanceof emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp other =
                    (emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp) obj;

            if (getRetcode() != other.getRetcode()) return false;
            if (getFLHKBCEIKLE() != other.getFLHKBCEIKLE()) return false;
            if (!getAvatarIdListList().equals(other.getAvatarIdListList())) return false;
            if (getMFNGJOCIAPE() != other.getMFNGJOCIAPE()) return false;
            if (getPathId() != other.getPathId()) return false;
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
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + FLHKBCEIKLE_FIELD_NUMBER;
            hash = (53 * hash) + getFLHKBCEIKLE();
            if (getAvatarIdListCount() > 0) {
                hash = (37 * hash) + AVATAR_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getAvatarIdListList().hashCode();
            }
            hash = (37 * hash) + MFNGJOCIAPE_FIELD_NUMBER;
            hash = (53 * hash) + getMFNGJOCIAPE();
            hash = (37 * hash) + PATH_ID_FIELD_NUMBER;
            hash = (53 * hash) + getPathId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 2049
         * Obf: OKAMLPHOFID
         * </pre>
         *
         * Protobuf type {@code ExpeditionStartRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ExpeditionStartRsp)
                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass
                        .internal_static_ExpeditionStartRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass
                        .internal_static_ExpeditionStartRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp.class,
                                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                retcode_ = 0;

                fLHKBCEIKLE_ = 0;

                avatarIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                mFNGJOCIAPE_ = 0;

                pathId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass
                        .internal_static_ExpeditionStartRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp build() {
                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                    buildPartial() {
                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp result =
                        new emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp(this);
                int from_bitField0_ = bitField0_;
                result.retcode_ = retcode_;
                result.fLHKBCEIKLE_ = fLHKBCEIKLE_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    avatarIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.avatarIdList_ = avatarIdList_;
                result.mFNGJOCIAPE_ = mFNGJOCIAPE_;
                result.pathId_ = pathId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp other) {
                if (other
                        == emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                                .getDefaultInstance()) return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getFLHKBCEIKLE() != 0) {
                    setFLHKBCEIKLE(other.getFLHKBCEIKLE());
                }
                if (!other.avatarIdList_.isEmpty()) {
                    if (avatarIdList_.isEmpty()) {
                        avatarIdList_ = other.avatarIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureAvatarIdListIsMutable();
                        avatarIdList_.addAll(other.avatarIdList_);
                    }
                    onChanged();
                }
                if (other.getMFNGJOCIAPE() != 0) {
                    setMFNGJOCIAPE(other.getMFNGJOCIAPE());
                }
                if (other.getPathId() != 0) {
                    setPathId(other.getPathId());
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
                emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int retcode_;
            /**
             * <code>int32 retcode = 3;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 3;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private int fLHKBCEIKLE_;
            /**
             * <code>uint32 FLHKBCEIKLE = 9;</code>
             *
             * @return The fLHKBCEIKLE.
             */
            @java.lang.Override
            public int getFLHKBCEIKLE() {
                return fLHKBCEIKLE_;
            }
            /**
             * <code>uint32 FLHKBCEIKLE = 9;</code>
             *
             * @param value The fLHKBCEIKLE to set.
             * @return This builder for chaining.
             */
            public Builder setFLHKBCEIKLE(int value) {

                fLHKBCEIKLE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 FLHKBCEIKLE = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFLHKBCEIKLE() {

                fLHKBCEIKLE_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.Internal.IntList avatarIdList_ = emptyIntList();

            private void ensureAvatarIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    avatarIdList_ = mutableCopy(avatarIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @return A list containing the avatarIdList.
             */
            public java.util.List<java.lang.Integer> getAvatarIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(avatarIdList_)
                        : avatarIdList_;
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @return The count of avatarIdList.
             */
            public int getAvatarIdListCount() {
                return avatarIdList_.size();
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @param index The index of the element to return.
             * @return The avatarIdList at the given index.
             */
            public int getAvatarIdList(int index) {
                return avatarIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @param index The index to set the value at.
             * @param value The avatarIdList to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarIdList(int index, int value) {
                ensureAvatarIdListIsMutable();
                avatarIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @param value The avatarIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAvatarIdList(int value) {
                ensureAvatarIdListIsMutable();
                avatarIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @param values The avatarIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllAvatarIdList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureAvatarIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, avatarIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 avatar_id_list = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarIdList() {
                avatarIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int mFNGJOCIAPE_;
            /**
             * <code>uint32 MFNGJOCIAPE = 6;</code>
             *
             * @return The mFNGJOCIAPE.
             */
            @java.lang.Override
            public int getMFNGJOCIAPE() {
                return mFNGJOCIAPE_;
            }
            /**
             * <code>uint32 MFNGJOCIAPE = 6;</code>
             *
             * @param value The mFNGJOCIAPE to set.
             * @return This builder for chaining.
             */
            public Builder setMFNGJOCIAPE(int value) {

                mFNGJOCIAPE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 MFNGJOCIAPE = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMFNGJOCIAPE() {

                mFNGJOCIAPE_ = 0;
                onChanged();
                return this;
            }

            private int pathId_;
            /**
             * <code>uint32 path_id = 1;</code>
             *
             * @return The pathId.
             */
            @java.lang.Override
            public int getPathId() {
                return pathId_;
            }
            /**
             * <code>uint32 path_id = 1;</code>
             *
             * @param value The pathId to set.
             * @return This builder for chaining.
             */
            public Builder setPathId(int value) {

                pathId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 path_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPathId() {

                pathId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ExpeditionStartRsp)
        }

        // @@protoc_insertion_point(class_scope:ExpeditionStartRsp)
        private static final emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp();
        }

        public static emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ExpeditionStartRsp> PARSER =
                new com.google.protobuf.AbstractParser<ExpeditionStartRsp>() {
                    @java.lang.Override
                    public ExpeditionStartRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ExpeditionStartRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ExpeditionStartRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ExpeditionStartRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ExpeditionStartRspOuterClass.ExpeditionStartRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ExpeditionStartRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ExpeditionStartRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\030ExpeditionStartRsp.proto\"x\n\022Expedition"
                    + "StartRsp\022\017\n\007retcode\030\003 \001(\005\022\023\n\013FLHKBCEIKLE"
                    + "\030\t \001(\r\022\026\n\016avatar_id_list\030\010 \003(\r\022\023\n\013MFNGJO"
                    + "CIAPE\030\006 \001(\r\022\017\n\007path_id\030\001 \001(\rB\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ExpeditionStartRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ExpeditionStartRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ExpeditionStartRsp_descriptor,
                        new java.lang.String[] {
                            "Retcode", "FLHKBCEIKLE", "AvatarIdList", "MFNGJOCIAPE", "PathId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}