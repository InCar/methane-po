// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloM.proto

package com.incarcloud.std;

public final class HelloM {
  private HelloM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HelloCountArgV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloCountArgV1)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloCountArgV1}
   */
  public  static final class HelloCountArgV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloCountArgV1)
      HelloCountArgV1OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloCountArgV1.newBuilder() to construct.
    private HelloCountArgV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloCountArgV1() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloCountArgV1();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloCountArgV1(
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
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloM.HelloCountArgV1.class, com.incarcloud.std.HelloM.HelloCountArgV1.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.incarcloud.std.HelloM.HelloCountArgV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloM.HelloCountArgV1 other = (com.incarcloud.std.HelloM.HelloCountArgV1) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountArgV1 parseFrom(
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
    public static Builder newBuilder(com.incarcloud.std.HelloM.HelloCountArgV1 prototype) {
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
     * Protobuf type {@code com.incarcloud.std.HelloCountArgV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloCountArgV1)
        com.incarcloud.std.HelloM.HelloCountArgV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloM.HelloCountArgV1.class, com.incarcloud.std.HelloM.HelloCountArgV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloM.HelloCountArgV1.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloM.HelloCountArgV1.getDefaultInstance();
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountArgV1 build() {
        com.incarcloud.std.HelloM.HelloCountArgV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountArgV1 buildPartial() {
        com.incarcloud.std.HelloM.HelloCountArgV1 result = new com.incarcloud.std.HelloM.HelloCountArgV1(this);
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
        if (other instanceof com.incarcloud.std.HelloM.HelloCountArgV1) {
          return mergeFrom((com.incarcloud.std.HelloM.HelloCountArgV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloM.HelloCountArgV1 other) {
        if (other == com.incarcloud.std.HelloM.HelloCountArgV1.getDefaultInstance()) return this;
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
        com.incarcloud.std.HelloM.HelloCountArgV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloM.HelloCountArgV1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloCountArgV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloCountArgV1)
    private static final com.incarcloud.std.HelloM.HelloCountArgV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloM.HelloCountArgV1();
    }

    public static com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloCountArgV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloCountArgV1>() {
      @java.lang.Override
      public HelloCountArgV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloCountArgV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloCountArgV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloCountArgV1> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.incarcloud.std.HelloM.HelloCountArgV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HelloCountV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloCountV1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string vin = 1;</code>
     * @return The vin.
     */
    java.lang.String getVin();
    /**
     * <code>string vin = 1;</code>
     * @return The bytes for vin.
     */
    com.google.protobuf.ByteString
        getVinBytes();

    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    int getCount();
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloCountV1}
   */
  public  static final class HelloCountV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloCountV1)
      HelloCountV1OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloCountV1.newBuilder() to construct.
    private HelloCountV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloCountV1() {
      vin_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloCountV1();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloCountV1(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              vin_ = s;
              break;
            }
            case 16: {

              count_ = input.readInt32();
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
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloM.HelloCountV1.class, com.incarcloud.std.HelloM.HelloCountV1.Builder.class);
    }

    public static final int VIN_FIELD_NUMBER = 1;
    private volatile java.lang.Object vin_;
    /**
     * <code>string vin = 1;</code>
     * @return The vin.
     */
    public java.lang.String getVin() {
      java.lang.Object ref = vin_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vin_ = s;
        return s;
      }
    }
    /**
     * <code>string vin = 1;</code>
     * @return The bytes for vin.
     */
    public com.google.protobuf.ByteString
        getVinBytes() {
      java.lang.Object ref = vin_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    public int getCount() {
      return count_;
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
      if (!getVinBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vin_);
      }
      if (count_ != 0) {
        output.writeInt32(2, count_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getVinBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vin_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, count_);
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
      if (!(obj instanceof com.incarcloud.std.HelloM.HelloCountV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloM.HelloCountV1 other = (com.incarcloud.std.HelloM.HelloCountV1) obj;

      if (!getVin()
          .equals(other.getVin())) return false;
      if (getCount()
          != other.getCount()) return false;
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
      hash = (37 * hash) + VIN_FIELD_NUMBER;
      hash = (53 * hash) + getVin().hashCode();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloM.HelloCountV1 parseFrom(
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
    public static Builder newBuilder(com.incarcloud.std.HelloM.HelloCountV1 prototype) {
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
     * Protobuf type {@code com.incarcloud.std.HelloCountV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloCountV1)
        com.incarcloud.std.HelloM.HelloCountV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloM.HelloCountV1.class, com.incarcloud.std.HelloM.HelloCountV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloM.HelloCountV1.newBuilder()
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
        vin_ = "";

        count_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloM.internal_static_com_incarcloud_std_HelloCountV1_descriptor;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloM.HelloCountV1.getDefaultInstance();
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountV1 build() {
        com.incarcloud.std.HelloM.HelloCountV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloM.HelloCountV1 buildPartial() {
        com.incarcloud.std.HelloM.HelloCountV1 result = new com.incarcloud.std.HelloM.HelloCountV1(this);
        result.vin_ = vin_;
        result.count_ = count_;
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
        if (other instanceof com.incarcloud.std.HelloM.HelloCountV1) {
          return mergeFrom((com.incarcloud.std.HelloM.HelloCountV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloM.HelloCountV1 other) {
        if (other == com.incarcloud.std.HelloM.HelloCountV1.getDefaultInstance()) return this;
        if (!other.getVin().isEmpty()) {
          vin_ = other.vin_;
          onChanged();
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
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
        com.incarcloud.std.HelloM.HelloCountV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloM.HelloCountV1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object vin_ = "";
      /**
       * <code>string vin = 1;</code>
       * @return The vin.
       */
      public java.lang.String getVin() {
        java.lang.Object ref = vin_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          vin_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string vin = 1;</code>
       * @return The bytes for vin.
       */
      public com.google.protobuf.ByteString
          getVinBytes() {
        java.lang.Object ref = vin_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          vin_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string vin = 1;</code>
       * @param value The vin to set.
       * @return This builder for chaining.
       */
      public Builder setVin(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        vin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string vin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVin() {
        
        vin_ = getDefaultInstance().getVin();
        onChanged();
        return this;
      }
      /**
       * <code>string vin = 1;</code>
       * @param value The bytes for vin to set.
       * @return This builder for chaining.
       */
      public Builder setVinBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        vin_ = value;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>int32 count = 2;</code>
       * @return The count.
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>int32 count = 2;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 count = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloCountV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloCountV1)
    private static final com.incarcloud.std.HelloM.HelloCountV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloM.HelloCountV1();
    }

    public static com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloCountV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloCountV1>() {
      @java.lang.Override
      public HelloCountV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloCountV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloCountV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloCountV1> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.incarcloud.std.HelloM.HelloCountV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloCountArgV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloCountV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014HelloM.proto\022\022com.incarcloud.std\"\021\n\017He" +
      "lloCountArgV1\"*\n\014HelloCountV1\022\013\n\003vin\030\001 \001" +
      "(\t\022\r\n\005count\030\002 \001(\0052`\n\016CountServiceV1\022N\n\005C" +
      "ount\022#.com.incarcloud.std.HelloCountArgV" +
      "1\032 .com.incarcloud.std.HelloCountV1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_incarcloud_std_HelloCountArgV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_incarcloud_std_HelloCountArgV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloCountArgV1_descriptor,
        new java.lang.String[] { });
    internal_static_com_incarcloud_std_HelloCountV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_incarcloud_std_HelloCountV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloCountV1_descriptor,
        new java.lang.String[] { "Vin", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
