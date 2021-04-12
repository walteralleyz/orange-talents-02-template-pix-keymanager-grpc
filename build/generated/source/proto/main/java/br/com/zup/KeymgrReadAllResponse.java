// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keymgr.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.KeymgrReadAllResponse}
 */
public final class KeymgrReadAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.KeymgrReadAllResponse)
    KeymgrReadAllResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeymgrReadAllResponse.newBuilder() to construct.
  private KeymgrReadAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeymgrReadAllResponse() {
    response_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeymgrReadAllResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeymgrReadAllResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              response_ = new java.util.ArrayList<br.com.zup.ReadAllResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            response_.add(
                input.readMessage(br.com.zup.ReadAllResponse.parser(), extensionRegistry));
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
        response_ = java.util.Collections.unmodifiableList(response_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrReadAllResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrReadAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.KeymgrReadAllResponse.class, br.com.zup.KeymgrReadAllResponse.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private java.util.List<br.com.zup.ReadAllResponse> response_;
  /**
   * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.zup.ReadAllResponse> getResponseList() {
    return response_;
  }
  /**
   * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.zup.ReadAllResponseOrBuilder> 
      getResponseOrBuilderList() {
    return response_;
  }
  /**
   * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
   */
  @java.lang.Override
  public int getResponseCount() {
    return response_.size();
  }
  /**
   * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
   */
  @java.lang.Override
  public br.com.zup.ReadAllResponse getResponse(int index) {
    return response_.get(index);
  }
  /**
   * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
   */
  @java.lang.Override
  public br.com.zup.ReadAllResponseOrBuilder getResponseOrBuilder(
      int index) {
    return response_.get(index);
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
    for (int i = 0; i < response_.size(); i++) {
      output.writeMessage(1, response_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < response_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, response_.get(i));
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
    if (!(obj instanceof br.com.zup.KeymgrReadAllResponse)) {
      return super.equals(obj);
    }
    br.com.zup.KeymgrReadAllResponse other = (br.com.zup.KeymgrReadAllResponse) obj;

    if (!getResponseList()
        .equals(other.getResponseList())) return false;
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
    if (getResponseCount() > 0) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.KeymgrReadAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrReadAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.KeymgrReadAllResponse parseFrom(
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
  public static Builder newBuilder(br.com.zup.KeymgrReadAllResponse prototype) {
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
   * Protobuf type {@code br.com.zup.KeymgrReadAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.KeymgrReadAllResponse)
      br.com.zup.KeymgrReadAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrReadAllResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrReadAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.KeymgrReadAllResponse.class, br.com.zup.KeymgrReadAllResponse.Builder.class);
    }

    // Construct using br.com.zup.KeymgrReadAllResponse.newBuilder()
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
        getResponseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (responseBuilder_ == null) {
        response_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        responseBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.Keymgr.internal_static_br_com_zup_KeymgrReadAllResponse_descriptor;
    }

    @java.lang.Override
    public br.com.zup.KeymgrReadAllResponse getDefaultInstanceForType() {
      return br.com.zup.KeymgrReadAllResponse.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.KeymgrReadAllResponse build() {
      br.com.zup.KeymgrReadAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.KeymgrReadAllResponse buildPartial() {
      br.com.zup.KeymgrReadAllResponse result = new br.com.zup.KeymgrReadAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          response_ = java.util.Collections.unmodifiableList(response_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.response_ = response_;
      } else {
        result.response_ = responseBuilder_.build();
      }
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
      if (other instanceof br.com.zup.KeymgrReadAllResponse) {
        return mergeFrom((br.com.zup.KeymgrReadAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.KeymgrReadAllResponse other) {
      if (other == br.com.zup.KeymgrReadAllResponse.getDefaultInstance()) return this;
      if (responseBuilder_ == null) {
        if (!other.response_.isEmpty()) {
          if (response_.isEmpty()) {
            response_ = other.response_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResponseIsMutable();
            response_.addAll(other.response_);
          }
          onChanged();
        }
      } else {
        if (!other.response_.isEmpty()) {
          if (responseBuilder_.isEmpty()) {
            responseBuilder_.dispose();
            responseBuilder_ = null;
            response_ = other.response_;
            bitField0_ = (bitField0_ & ~0x00000001);
            responseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponseFieldBuilder() : null;
          } else {
            responseBuilder_.addAllMessages(other.response_);
          }
        }
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
      br.com.zup.KeymgrReadAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.KeymgrReadAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.zup.ReadAllResponse> response_ =
      java.util.Collections.emptyList();
    private void ensureResponseIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        response_ = new java.util.ArrayList<br.com.zup.ReadAllResponse>(response_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zup.ReadAllResponse, br.com.zup.ReadAllResponse.Builder, br.com.zup.ReadAllResponseOrBuilder> responseBuilder_;

    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public java.util.List<br.com.zup.ReadAllResponse> getResponseList() {
      if (responseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(response_);
      } else {
        return responseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public int getResponseCount() {
      if (responseBuilder_ == null) {
        return response_.size();
      } else {
        return responseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public br.com.zup.ReadAllResponse getResponse(int index) {
      if (responseBuilder_ == null) {
        return response_.get(index);
      } else {
        return responseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder setResponse(
        int index, br.com.zup.ReadAllResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponseIsMutable();
        response_.set(index, value);
        onChanged();
      } else {
        responseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder setResponse(
        int index, br.com.zup.ReadAllResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        ensureResponseIsMutable();
        response_.set(index, builderForValue.build());
        onChanged();
      } else {
        responseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder addResponse(br.com.zup.ReadAllResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponseIsMutable();
        response_.add(value);
        onChanged();
      } else {
        responseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder addResponse(
        int index, br.com.zup.ReadAllResponse value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponseIsMutable();
        response_.add(index, value);
        onChanged();
      } else {
        responseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder addResponse(
        br.com.zup.ReadAllResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        ensureResponseIsMutable();
        response_.add(builderForValue.build());
        onChanged();
      } else {
        responseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder addResponse(
        int index, br.com.zup.ReadAllResponse.Builder builderForValue) {
      if (responseBuilder_ == null) {
        ensureResponseIsMutable();
        response_.add(index, builderForValue.build());
        onChanged();
      } else {
        responseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder addAllResponse(
        java.lang.Iterable<? extends br.com.zup.ReadAllResponse> values) {
      if (responseBuilder_ == null) {
        ensureResponseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, response_);
        onChanged();
      } else {
        responseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder clearResponse() {
      if (responseBuilder_ == null) {
        response_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        responseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public Builder removeResponse(int index) {
      if (responseBuilder_ == null) {
        ensureResponseIsMutable();
        response_.remove(index);
        onChanged();
      } else {
        responseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public br.com.zup.ReadAllResponse.Builder getResponseBuilder(
        int index) {
      return getResponseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public br.com.zup.ReadAllResponseOrBuilder getResponseOrBuilder(
        int index) {
      if (responseBuilder_ == null) {
        return response_.get(index);  } else {
        return responseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public java.util.List<? extends br.com.zup.ReadAllResponseOrBuilder> 
         getResponseOrBuilderList() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(response_);
      }
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public br.com.zup.ReadAllResponse.Builder addResponseBuilder() {
      return getResponseFieldBuilder().addBuilder(
          br.com.zup.ReadAllResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public br.com.zup.ReadAllResponse.Builder addResponseBuilder(
        int index) {
      return getResponseFieldBuilder().addBuilder(
          index, br.com.zup.ReadAllResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .br.com.zup.ReadAllResponse response = 1;</code>
     */
    public java.util.List<br.com.zup.ReadAllResponse.Builder> 
         getResponseBuilderList() {
      return getResponseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zup.ReadAllResponse, br.com.zup.ReadAllResponse.Builder, br.com.zup.ReadAllResponseOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.zup.ReadAllResponse, br.com.zup.ReadAllResponse.Builder, br.com.zup.ReadAllResponseOrBuilder>(
                response_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.KeymgrReadAllResponse)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.KeymgrReadAllResponse)
  private static final br.com.zup.KeymgrReadAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.KeymgrReadAllResponse();
  }

  public static br.com.zup.KeymgrReadAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeymgrReadAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<KeymgrReadAllResponse>() {
    @java.lang.Override
    public KeymgrReadAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeymgrReadAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeymgrReadAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeymgrReadAllResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.KeymgrReadAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

