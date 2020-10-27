// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package web.service.user.grpc;

/**
 * Protobuf type {@code GetUserAvatarResponse}
 */
public  final class GetUserAvatarResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetUserAvatarResponse)
    GetUserAvatarResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserAvatarResponse.newBuilder() to construct.
  private GetUserAvatarResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserAvatarResponse() {
    avatar_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserAvatarResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            avatar_ = s;
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
    return web.service.user.grpc.User.internal_static_GetUserAvatarResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return web.service.user.grpc.User.internal_static_GetUserAvatarResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            web.service.user.grpc.GetUserAvatarResponse.class, web.service.user.grpc.GetUserAvatarResponse.Builder.class);
  }

  public static final int AVATAR_FIELD_NUMBER = 1;
  private volatile java.lang.Object avatar_;
  /**
   * <code>string avatar = 1;</code>
   */
  public java.lang.String getAvatar() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      avatar_ = s;
      return s;
    }
  }
  /**
   * <code>string avatar = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAvatarBytes() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      avatar_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAvatarBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, avatar_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAvatarBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, avatar_);
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
    if (!(obj instanceof web.service.user.grpc.GetUserAvatarResponse)) {
      return super.equals(obj);
    }
    web.service.user.grpc.GetUserAvatarResponse other = (web.service.user.grpc.GetUserAvatarResponse) obj;

    boolean result = true;
    result = result && getAvatar()
        .equals(other.getAvatar());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AVATAR_FIELD_NUMBER;
    hash = (53 * hash) + getAvatar().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static web.service.user.grpc.GetUserAvatarResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(web.service.user.grpc.GetUserAvatarResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code GetUserAvatarResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetUserAvatarResponse)
      web.service.user.grpc.GetUserAvatarResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return web.service.user.grpc.User.internal_static_GetUserAvatarResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return web.service.user.grpc.User.internal_static_GetUserAvatarResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              web.service.user.grpc.GetUserAvatarResponse.class, web.service.user.grpc.GetUserAvatarResponse.Builder.class);
    }

    // Construct using web.service.user.grpc.GetUserAvatarResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      avatar_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return web.service.user.grpc.User.internal_static_GetUserAvatarResponse_descriptor;
    }

    public web.service.user.grpc.GetUserAvatarResponse getDefaultInstanceForType() {
      return web.service.user.grpc.GetUserAvatarResponse.getDefaultInstance();
    }

    public web.service.user.grpc.GetUserAvatarResponse build() {
      web.service.user.grpc.GetUserAvatarResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public web.service.user.grpc.GetUserAvatarResponse buildPartial() {
      web.service.user.grpc.GetUserAvatarResponse result = new web.service.user.grpc.GetUserAvatarResponse(this);
      result.avatar_ = avatar_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof web.service.user.grpc.GetUserAvatarResponse) {
        return mergeFrom((web.service.user.grpc.GetUserAvatarResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(web.service.user.grpc.GetUserAvatarResponse other) {
      if (other == web.service.user.grpc.GetUserAvatarResponse.getDefaultInstance()) return this;
      if (!other.getAvatar().isEmpty()) {
        avatar_ = other.avatar_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      web.service.user.grpc.GetUserAvatarResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (web.service.user.grpc.GetUserAvatarResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object avatar_ = "";
    /**
     * <code>string avatar = 1;</code>
     */
    public java.lang.String getAvatar() {
      java.lang.Object ref = avatar_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatar_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string avatar = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAvatarBytes() {
      java.lang.Object ref = avatar_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string avatar = 1;</code>
     */
    public Builder setAvatar(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      avatar_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string avatar = 1;</code>
     */
    public Builder clearAvatar() {
      
      avatar_ = getDefaultInstance().getAvatar();
      onChanged();
      return this;
    }
    /**
     * <code>string avatar = 1;</code>
     */
    public Builder setAvatarBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      avatar_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetUserAvatarResponse)
  }

  // @@protoc_insertion_point(class_scope:GetUserAvatarResponse)
  private static final web.service.user.grpc.GetUserAvatarResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new web.service.user.grpc.GetUserAvatarResponse();
  }

  public static web.service.user.grpc.GetUserAvatarResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserAvatarResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUserAvatarResponse>() {
    public GetUserAvatarResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserAvatarResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserAvatarResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserAvatarResponse> getParserForType() {
    return PARSER;
  }

  public web.service.user.grpc.GetUserAvatarResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
