// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/CommerceMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

/**
 * Protobuf type {@code CommerceMessage}
 */
public final class CommerceMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CommerceMessage)
    CommerceMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommerceMessage.newBuilder() to construct.
  private CommerceMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommerceMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommerceMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOuterClass.internal_static_CommerceMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOuterClass.internal_static_CommerceMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage other = (cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage prototype) {
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
   * Protobuf type {@code CommerceMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CommerceMessage)
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOuterClass.internal_static_CommerceMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOuterClass.internal_static_CommerceMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessageOuterClass.internal_static_CommerceMessage_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage build() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage buildPartial() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage result = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage) {
        return mergeFrom((cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage other) {
      if (other == cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
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


    // @@protoc_insertion_point(builder_scope:CommerceMessage)
  }

  // @@protoc_insertion_point(class_scope:CommerceMessage)
  private static final cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage();
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommerceMessage>
      PARSER = new com.google.protobuf.AbstractParser<CommerceMessage>() {
    @java.lang.Override
    public CommerceMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CommerceMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommerceMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommerceMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

