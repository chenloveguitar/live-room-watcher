// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/Response.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Message messagesList = 1;</code>
   */
  java.util.List<cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.Message> 
      getMessagesListList();
  /**
   * <code>repeated .Message messagesList = 1;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.Message getMessagesList(int index);
  /**
   * <code>repeated .Message messagesList = 1;</code>
   */
  int getMessagesListCount();
  /**
   * <code>repeated .Message messagesList = 1;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.MessageOrBuilder> 
      getMessagesListOrBuilderList();
  /**
   * <code>repeated .Message messagesList = 1;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.MessageOrBuilder getMessagesListOrBuilder(
      int index);

  /**
   * <code>string cursor = 2;</code>
   * @return The cursor.
   */
  java.lang.String getCursor();
  /**
   * <code>string cursor = 2;</code>
   * @return The bytes for cursor.
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <code>int64 fetchInterval = 3;</code>
   * @return The fetchInterval.
   */
  long getFetchInterval();

  /**
   * <code>int64 now = 4;</code>
   * @return The now.
   */
  long getNow();

  /**
   * <code>string internalExt = 5;</code>
   * @return The internalExt.
   */
  java.lang.String getInternalExt();
  /**
   * <code>string internalExt = 5;</code>
   * @return The bytes for internalExt.
   */
  com.google.protobuf.ByteString
      getInternalExtBytes();

  /**
   * <code>int32 fetchType = 6;</code>
   * @return The fetchType.
   */
  int getFetchType();

  /**
   * <code>map&lt;string, string&gt; routeParamsMap = 7;</code>
   */
  int getRouteParamsMapCount();
  /**
   * <code>map&lt;string, string&gt; routeParamsMap = 7;</code>
   */
  boolean containsRouteParamsMap(
      java.lang.String key);
  /**
   * Use {@link #getRouteParamsMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRouteParamsMap();
  /**
   * <code>map&lt;string, string&gt; routeParamsMap = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRouteParamsMapMap();
  /**
   * <code>map&lt;string, string&gt; routeParamsMap = 7;</code>
   */
  /* nullable */
java.lang.String getRouteParamsMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; routeParamsMap = 7;</code>
   */
  java.lang.String getRouteParamsMapOrThrow(
      java.lang.String key);

  /**
   * <code>int64 heartbeatDuration = 8;</code>
   * @return The heartbeatDuration.
   */
  long getHeartbeatDuration();

  /**
   * <code>bool needAck = 9;</code>
   * @return The needAck.
   */
  boolean getNeedAck();

  /**
   * <code>string pushServer = 10;</code>
   * @return The pushServer.
   */
  java.lang.String getPushServer();
  /**
   * <code>string pushServer = 10;</code>
   * @return The bytes for pushServer.
   */
  com.google.protobuf.ByteString
      getPushServerBytes();

  /**
   * <code>string liveCursor = 11;</code>
   * @return The liveCursor.
   */
  java.lang.String getLiveCursor();
  /**
   * <code>string liveCursor = 11;</code>
   * @return The bytes for liveCursor.
   */
  com.google.protobuf.ByteString
      getLiveCursorBytes();

  /**
   * <code>bool historyNoMore = 12;</code>
   * @return The historyNoMore.
   */
  boolean getHistoryNoMore();
}
