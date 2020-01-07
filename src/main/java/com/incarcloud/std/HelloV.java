// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloV.proto

package com.incarcloud.std;

public final class HelloV {
  private HelloV() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HelloRequestV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloRequestV1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * vin
     * </pre>
     *
     * <code>string vin = 1;</code>
     * @return The vin.
     */
    java.lang.String getVin();
    /**
     * <pre>
     * vin
     * </pre>
     *
     * <code>string vin = 1;</code>
     * @return The bytes for vin.
     */
    com.google.protobuf.ByteString
        getVinBytes();
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloRequestV1}
   */
  public  static final class HelloRequestV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloRequestV1)
      HelloRequestV1OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloRequestV1.newBuilder() to construct.
    private HelloRequestV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloRequestV1() {
      vin_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloRequestV1();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloRequestV1(
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
      return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloRequestV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloRequestV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloV.HelloRequestV1.class, com.incarcloud.std.HelloV.HelloRequestV1.Builder.class);
    }

    public static final int VIN_FIELD_NUMBER = 1;
    private volatile java.lang.Object vin_;
    /**
     * <pre>
     * vin
     * </pre>
     *
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
     * <pre>
     * vin
     * </pre>
     *
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.incarcloud.std.HelloV.HelloRequestV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloV.HelloRequestV1 other = (com.incarcloud.std.HelloV.HelloRequestV1) obj;

      if (!getVin()
          .equals(other.getVin())) return false;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloRequestV1 parseFrom(
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
    public static Builder newBuilder(com.incarcloud.std.HelloV.HelloRequestV1 prototype) {
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
     * Protobuf type {@code com.incarcloud.std.HelloRequestV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloRequestV1)
        com.incarcloud.std.HelloV.HelloRequestV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloRequestV1_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloRequestV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloV.HelloRequestV1.class, com.incarcloud.std.HelloV.HelloRequestV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloV.HelloRequestV1.newBuilder()
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

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloRequestV1_descriptor;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloRequestV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloV.HelloRequestV1.getDefaultInstance();
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloRequestV1 build() {
        com.incarcloud.std.HelloV.HelloRequestV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloRequestV1 buildPartial() {
        com.incarcloud.std.HelloV.HelloRequestV1 result = new com.incarcloud.std.HelloV.HelloRequestV1(this);
        result.vin_ = vin_;
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
        if (other instanceof com.incarcloud.std.HelloV.HelloRequestV1) {
          return mergeFrom((com.incarcloud.std.HelloV.HelloRequestV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloV.HelloRequestV1 other) {
        if (other == com.incarcloud.std.HelloV.HelloRequestV1.getDefaultInstance()) return this;
        if (!other.getVin().isEmpty()) {
          vin_ = other.vin_;
          onChanged();
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
        com.incarcloud.std.HelloV.HelloRequestV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloV.HelloRequestV1) e.getUnfinishedMessage();
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
       * <pre>
       * vin
       * </pre>
       *
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
       * <pre>
       * vin
       * </pre>
       *
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
       * <pre>
       * vin
       * </pre>
       *
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
       * <pre>
       * vin
       * </pre>
       *
       * <code>string vin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVin() {
        
        vin_ = getDefaultInstance().getVin();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * vin
       * </pre>
       *
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


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloRequestV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloRequestV1)
    private static final com.incarcloud.std.HelloV.HelloRequestV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloV.HelloRequestV1();
    }

    public static com.incarcloud.std.HelloV.HelloRequestV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloRequestV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloRequestV1>() {
      @java.lang.Override
      public HelloRequestV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloRequestV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloRequestV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloRequestV1> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.incarcloud.std.HelloV.HelloRequestV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HelloResponseV1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.incarcloud.std.HelloResponseV1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 成功返回正值,失败返回负值
     * </pre>
     *
     * <code>int32 res = 1;</code>
     * @return The res.
     */
    int getRes();
  }
  /**
   * Protobuf type {@code com.incarcloud.std.HelloResponseV1}
   */
  public  static final class HelloResponseV1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.incarcloud.std.HelloResponseV1)
      HelloResponseV1OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloResponseV1.newBuilder() to construct.
    private HelloResponseV1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloResponseV1() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloResponseV1();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloResponseV1(
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

              res_ = input.readInt32();
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
      return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloResponseV1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloResponseV1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.incarcloud.std.HelloV.HelloResponseV1.class, com.incarcloud.std.HelloV.HelloResponseV1.Builder.class);
    }

    public static final int RES_FIELD_NUMBER = 1;
    private int res_;
    /**
     * <pre>
     * 成功返回正值,失败返回负值
     * </pre>
     *
     * <code>int32 res = 1;</code>
     * @return The res.
     */
    public int getRes() {
      return res_;
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
      if (res_ != 0) {
        output.writeInt32(1, res_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (res_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, res_);
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
      if (!(obj instanceof com.incarcloud.std.HelloV.HelloResponseV1)) {
        return super.equals(obj);
      }
      com.incarcloud.std.HelloV.HelloResponseV1 other = (com.incarcloud.std.HelloV.HelloResponseV1) obj;

      if (getRes()
          != other.getRes()) return false;
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
      hash = (37 * hash) + RES_FIELD_NUMBER;
      hash = (53 * hash) + getRes();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.incarcloud.std.HelloV.HelloResponseV1 parseFrom(
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
    public static Builder newBuilder(com.incarcloud.std.HelloV.HelloResponseV1 prototype) {
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
     * Protobuf type {@code com.incarcloud.std.HelloResponseV1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.incarcloud.std.HelloResponseV1)
        com.incarcloud.std.HelloV.HelloResponseV1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloResponseV1_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloResponseV1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.incarcloud.std.HelloV.HelloResponseV1.class, com.incarcloud.std.HelloV.HelloResponseV1.Builder.class);
      }

      // Construct using com.incarcloud.std.HelloV.HelloResponseV1.newBuilder()
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
        res_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.incarcloud.std.HelloV.internal_static_com_incarcloud_std_HelloResponseV1_descriptor;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloResponseV1 getDefaultInstanceForType() {
        return com.incarcloud.std.HelloV.HelloResponseV1.getDefaultInstance();
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloResponseV1 build() {
        com.incarcloud.std.HelloV.HelloResponseV1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.incarcloud.std.HelloV.HelloResponseV1 buildPartial() {
        com.incarcloud.std.HelloV.HelloResponseV1 result = new com.incarcloud.std.HelloV.HelloResponseV1(this);
        result.res_ = res_;
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
        if (other instanceof com.incarcloud.std.HelloV.HelloResponseV1) {
          return mergeFrom((com.incarcloud.std.HelloV.HelloResponseV1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.incarcloud.std.HelloV.HelloResponseV1 other) {
        if (other == com.incarcloud.std.HelloV.HelloResponseV1.getDefaultInstance()) return this;
        if (other.getRes() != 0) {
          setRes(other.getRes());
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
        com.incarcloud.std.HelloV.HelloResponseV1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.incarcloud.std.HelloV.HelloResponseV1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int res_ ;
      /**
       * <pre>
       * 成功返回正值,失败返回负值
       * </pre>
       *
       * <code>int32 res = 1;</code>
       * @return The res.
       */
      public int getRes() {
        return res_;
      }
      /**
       * <pre>
       * 成功返回正值,失败返回负值
       * </pre>
       *
       * <code>int32 res = 1;</code>
       * @param value The res to set.
       * @return This builder for chaining.
       */
      public Builder setRes(int value) {
        
        res_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 成功返回正值,失败返回负值
       * </pre>
       *
       * <code>int32 res = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRes() {
        
        res_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.incarcloud.std.HelloResponseV1)
    }

    // @@protoc_insertion_point(class_scope:com.incarcloud.std.HelloResponseV1)
    private static final com.incarcloud.std.HelloV.HelloResponseV1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.incarcloud.std.HelloV.HelloResponseV1();
    }

    public static com.incarcloud.std.HelloV.HelloResponseV1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloResponseV1>
        PARSER = new com.google.protobuf.AbstractParser<HelloResponseV1>() {
      @java.lang.Override
      public HelloResponseV1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloResponseV1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloResponseV1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloResponseV1> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.incarcloud.std.HelloV.HelloResponseV1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloRequestV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloRequestV1_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_incarcloud_std_HelloResponseV1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_incarcloud_std_HelloResponseV1_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014HelloV.proto\022\022com.incarcloud.std\"\035\n\016He" +
      "lloRequestV1\022\013\n\003vin\030\001 \001(\t\"\036\n\017HelloRespon" +
      "seV1\022\013\n\003res\030\001 \001(\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_incarcloud_std_HelloRequestV1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_incarcloud_std_HelloRequestV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloRequestV1_descriptor,
        new java.lang.String[] { "Vin", });
    internal_static_com_incarcloud_std_HelloResponseV1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_incarcloud_std_HelloResponseV1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_incarcloud_std_HelloResponseV1_descriptor,
        new java.lang.String[] { "Res", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
