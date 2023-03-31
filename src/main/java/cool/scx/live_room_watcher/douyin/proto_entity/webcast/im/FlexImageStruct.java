// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/FlexImageStruct.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

/**
 * <pre>
 *更新时间 2023-01-11
 * </pre>
 *
 * Protobuf type {@code FlexImageStruct}
 */
public final class FlexImageStruct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FlexImageStruct)
    FlexImageStructOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlexImageStruct.newBuilder() to construct.
  private FlexImageStruct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlexImageStruct() {
    urlListList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    uri_ = "";
    flexSettingList_ = emptyLongList();
    textSettingList_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlexImageStruct();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.internal_static_FlexImageStruct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.internal_static_FlexImageStruct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.Builder.class);
  }

  public static final int URLLISTLIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList urlListList_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string urlListList = 1;</code>
   * @return A list containing the urlListList.
   */
  public com.google.protobuf.ProtocolStringList
      getUrlListListList() {
    return urlListList_;
  }
  /**
   * <code>repeated string urlListList = 1;</code>
   * @return The count of urlListList.
   */
  public int getUrlListListCount() {
    return urlListList_.size();
  }
  /**
   * <code>repeated string urlListList = 1;</code>
   * @param index The index of the element to return.
   * @return The urlListList at the given index.
   */
  public java.lang.String getUrlListList(int index) {
    return urlListList_.get(index);
  }
  /**
   * <code>repeated string urlListList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the urlListList at the given index.
   */
  public com.google.protobuf.ByteString
      getUrlListListBytes(int index) {
    return urlListList_.getByteString(index);
  }

  public static final int URI_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLEXSETTINGLIST_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList flexSettingList_;
  /**
   * <code>repeated int64 flexSettingList = 3;</code>
   * @return A list containing the flexSettingList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getFlexSettingListList() {
    return flexSettingList_;
  }
  /**
   * <code>repeated int64 flexSettingList = 3;</code>
   * @return The count of flexSettingList.
   */
  public int getFlexSettingListCount() {
    return flexSettingList_.size();
  }
  /**
   * <code>repeated int64 flexSettingList = 3;</code>
   * @param index The index of the element to return.
   * @return The flexSettingList at the given index.
   */
  public long getFlexSettingList(int index) {
    return flexSettingList_.getLong(index);
  }
  private int flexSettingListMemoizedSerializedSize = -1;

  public static final int TEXTSETTINGLIST_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList textSettingList_;
  /**
   * <code>repeated int64 textSettingList = 4;</code>
   * @return A list containing the textSettingList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTextSettingListList() {
    return textSettingList_;
  }
  /**
   * <code>repeated int64 textSettingList = 4;</code>
   * @return The count of textSettingList.
   */
  public int getTextSettingListCount() {
    return textSettingList_.size();
  }
  /**
   * <code>repeated int64 textSettingList = 4;</code>
   * @param index The index of the element to return.
   * @return The textSettingList at the given index.
   */
  public long getTextSettingList(int index) {
    return textSettingList_.getLong(index);
  }
  private int textSettingListMemoizedSerializedSize = -1;

  public static final int TOPBORDERHEIGHT_FIELD_NUMBER = 5;
  private long topBorderHeight_ = 0L;
  /**
   * <code>int64 topBorderHeight = 5;</code>
   * @return The topBorderHeight.
   */
  @java.lang.Override
  public long getTopBorderHeight() {
    return topBorderHeight_;
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
    getSerializedSize();
    for (int i = 0; i < urlListList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, urlListList_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    if (getFlexSettingListList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(flexSettingListMemoizedSerializedSize);
    }
    for (int i = 0; i < flexSettingList_.size(); i++) {
      output.writeInt64NoTag(flexSettingList_.getLong(i));
    }
    if (getTextSettingListList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(textSettingListMemoizedSerializedSize);
    }
    for (int i = 0; i < textSettingList_.size(); i++) {
      output.writeInt64NoTag(textSettingList_.getLong(i));
    }
    if (topBorderHeight_ != 0L) {
      output.writeInt64(5, topBorderHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < urlListList_.size(); i++) {
        dataSize += computeStringSizeNoTag(urlListList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrlListListList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < flexSettingList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(flexSettingList_.getLong(i));
      }
      size += dataSize;
      if (!getFlexSettingListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      flexSettingListMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < textSettingList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(textSettingList_.getLong(i));
      }
      size += dataSize;
      if (!getTextSettingListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      textSettingListMemoizedSerializedSize = dataSize;
    }
    if (topBorderHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, topBorderHeight_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct other = (cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct) obj;

    if (!getUrlListListList()
        .equals(other.getUrlListListList())) return false;
    if (!getUri()
        .equals(other.getUri())) return false;
    if (!getFlexSettingListList()
        .equals(other.getFlexSettingListList())) return false;
    if (!getTextSettingListList()
        .equals(other.getTextSettingListList())) return false;
    if (getTopBorderHeight()
        != other.getTopBorderHeight()) return false;
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
    if (getUrlListListCount() > 0) {
      hash = (37 * hash) + URLLISTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getUrlListListList().hashCode();
    }
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (getFlexSettingListCount() > 0) {
      hash = (37 * hash) + FLEXSETTINGLIST_FIELD_NUMBER;
      hash = (53 * hash) + getFlexSettingListList().hashCode();
    }
    if (getTextSettingListCount() > 0) {
      hash = (37 * hash) + TEXTSETTINGLIST_FIELD_NUMBER;
      hash = (53 * hash) + getTextSettingListList().hashCode();
    }
    hash = (37 * hash) + TOPBORDERHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTopBorderHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct prototype) {
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
   *更新时间 2023-01-11
   * </pre>
   *
   * Protobuf type {@code FlexImageStruct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FlexImageStruct)
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.internal_static_FlexImageStruct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.internal_static_FlexImageStruct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.class, cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      urlListList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      uri_ = "";
      flexSettingList_ = emptyLongList();
      textSettingList_ = emptyLongList();
      topBorderHeight_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.internal_static_FlexImageStruct_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct build() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct buildPartial() {
      cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct result = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        flexSettingList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.flexSettingList_ = flexSettingList_;
      if (((bitField0_ & 0x00000008) != 0)) {
        textSettingList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.textSettingList_ = textSettingList_;
    }

    private void buildPartial0(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        urlListList_.makeImmutable();
        result.urlListList_ = urlListList_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.topBorderHeight_ = topBorderHeight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct) {
        return mergeFrom((cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct other) {
      if (other == cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct.getDefaultInstance()) return this;
      if (!other.urlListList_.isEmpty()) {
        if (urlListList_.isEmpty()) {
          urlListList_ = other.urlListList_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUrlListListIsMutable();
          urlListList_.addAll(other.urlListList_);
        }
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.flexSettingList_.isEmpty()) {
        if (flexSettingList_.isEmpty()) {
          flexSettingList_ = other.flexSettingList_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureFlexSettingListIsMutable();
          flexSettingList_.addAll(other.flexSettingList_);
        }
        onChanged();
      }
      if (!other.textSettingList_.isEmpty()) {
        if (textSettingList_.isEmpty()) {
          textSettingList_ = other.textSettingList_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureTextSettingListIsMutable();
          textSettingList_.addAll(other.textSettingList_);
        }
        onChanged();
      }
      if (other.getTopBorderHeight() != 0L) {
        setTopBorderHeight(other.getTopBorderHeight());
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUrlListListIsMutable();
              urlListList_.add(s);
              break;
            } // case 10
            case 18: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              long v = input.readInt64();
              ensureFlexSettingListIsMutable();
              flexSettingList_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureFlexSettingListIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                flexSettingList_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 26
            case 32: {
              long v = input.readInt64();
              ensureTextSettingListIsMutable();
              textSettingList_.addLong(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureTextSettingListIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                textSettingList_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 34
            case 40: {
              topBorderHeight_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList urlListList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUrlListListIsMutable() {
      if (!urlListList_.isModifiable()) {
        urlListList_ = new com.google.protobuf.LazyStringArrayList(urlListList_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @return A list containing the urlListList.
     */
    public com.google.protobuf.ProtocolStringList
        getUrlListListList() {
      urlListList_.makeImmutable();
      return urlListList_;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @return The count of urlListList.
     */
    public int getUrlListListCount() {
      return urlListList_.size();
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param index The index of the element to return.
     * @return The urlListList at the given index.
     */
    public java.lang.String getUrlListList(int index) {
      return urlListList_.get(index);
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the urlListList at the given index.
     */
    public com.google.protobuf.ByteString
        getUrlListListBytes(int index) {
      return urlListList_.getByteString(index);
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param index The index to set the value at.
     * @param value The urlListList to set.
     * @return This builder for chaining.
     */
    public Builder setUrlListList(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlListListIsMutable();
      urlListList_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param value The urlListList to add.
     * @return This builder for chaining.
     */
    public Builder addUrlListList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUrlListListIsMutable();
      urlListList_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param values The urlListList to add.
     * @return This builder for chaining.
     */
    public Builder addAllUrlListList(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrlListListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, urlListList_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrlListList() {
      urlListList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string urlListList = 1;</code>
     * @param value The bytes of the urlListList to add.
     * @return This builder for chaining.
     */
    public Builder addUrlListListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUrlListListIsMutable();
      urlListList_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <code>string uri = 2;</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uri = 2;</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uri = 2;</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string uri = 2;</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList flexSettingList_ = emptyLongList();
    private void ensureFlexSettingListIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        flexSettingList_ = mutableCopy(flexSettingList_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @return A list containing the flexSettingList.
     */
    public java.util.List<java.lang.Long>
        getFlexSettingListList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(flexSettingList_) : flexSettingList_;
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @return The count of flexSettingList.
     */
    public int getFlexSettingListCount() {
      return flexSettingList_.size();
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @param index The index of the element to return.
     * @return The flexSettingList at the given index.
     */
    public long getFlexSettingList(int index) {
      return flexSettingList_.getLong(index);
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @param index The index to set the value at.
     * @param value The flexSettingList to set.
     * @return This builder for chaining.
     */
    public Builder setFlexSettingList(
        int index, long value) {

      ensureFlexSettingListIsMutable();
      flexSettingList_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @param value The flexSettingList to add.
     * @return This builder for chaining.
     */
    public Builder addFlexSettingList(long value) {

      ensureFlexSettingListIsMutable();
      flexSettingList_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @param values The flexSettingList to add.
     * @return This builder for chaining.
     */
    public Builder addAllFlexSettingList(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureFlexSettingListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, flexSettingList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 flexSettingList = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlexSettingList() {
      flexSettingList_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList textSettingList_ = emptyLongList();
    private void ensureTextSettingListIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        textSettingList_ = mutableCopy(textSettingList_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @return A list containing the textSettingList.
     */
    public java.util.List<java.lang.Long>
        getTextSettingListList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(textSettingList_) : textSettingList_;
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @return The count of textSettingList.
     */
    public int getTextSettingListCount() {
      return textSettingList_.size();
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @param index The index of the element to return.
     * @return The textSettingList at the given index.
     */
    public long getTextSettingList(int index) {
      return textSettingList_.getLong(index);
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @param index The index to set the value at.
     * @param value The textSettingList to set.
     * @return This builder for chaining.
     */
    public Builder setTextSettingList(
        int index, long value) {

      ensureTextSettingListIsMutable();
      textSettingList_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @param value The textSettingList to add.
     * @return This builder for chaining.
     */
    public Builder addTextSettingList(long value) {

      ensureTextSettingListIsMutable();
      textSettingList_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @param values The textSettingList to add.
     * @return This builder for chaining.
     */
    public Builder addAllTextSettingList(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTextSettingListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, textSettingList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 textSettingList = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextSettingList() {
      textSettingList_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    private long topBorderHeight_ ;
    /**
     * <code>int64 topBorderHeight = 5;</code>
     * @return The topBorderHeight.
     */
    @java.lang.Override
    public long getTopBorderHeight() {
      return topBorderHeight_;
    }
    /**
     * <code>int64 topBorderHeight = 5;</code>
     * @param value The topBorderHeight to set.
     * @return This builder for chaining.
     */
    public Builder setTopBorderHeight(long value) {

      topBorderHeight_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 topBorderHeight = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopBorderHeight() {
      bitField0_ = (bitField0_ & ~0x00000010);
      topBorderHeight_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:FlexImageStruct)
  }

  // @@protoc_insertion_point(class_scope:FlexImageStruct)
  private static final cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct();
  }

  public static cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlexImageStruct>
      PARSER = new com.google.protobuf.AbstractParser<FlexImageStruct>() {
    @java.lang.Override
    public FlexImageStruct parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlexImageStruct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlexImageStruct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStruct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

