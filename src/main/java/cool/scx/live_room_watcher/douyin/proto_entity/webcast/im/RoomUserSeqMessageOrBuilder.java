// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/RoomUserSeqMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public interface RoomUserSeqMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomUserSeqMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>repeated .RoomUserSeqMessage.Contributor ranks = 2;</code>
   */
  java.util.List<cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.Contributor> 
      getRanksList();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor ranks = 2;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.Contributor getRanks(int index);
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor ranks = 2;</code>
   */
  int getRanksCount();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor ranks = 2;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.ContributorOrBuilder> 
      getRanksOrBuilderList();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor ranks = 2;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.ContributorOrBuilder getRanksOrBuilder(
      int index);

  /**
   * <code>int64 total = 3;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>string popStr = 4;</code>
   * @return The popStr.
   */
  java.lang.String getPopStr();
  /**
   * <code>string popStr = 4;</code>
   * @return The bytes for popStr.
   */
  com.google.protobuf.ByteString
      getPopStrBytes();

  /**
   * <code>repeated .RoomUserSeqMessage.Contributor seats = 5;</code>
   */
  java.util.List<cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.Contributor> 
      getSeatsList();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor seats = 5;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.Contributor getSeats(int index);
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor seats = 5;</code>
   */
  int getSeatsCount();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor seats = 5;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.ContributorOrBuilder> 
      getSeatsOrBuilderList();
  /**
   * <code>repeated .RoomUserSeqMessage.Contributor seats = 5;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomUserSeqMessage.ContributorOrBuilder getSeatsOrBuilder(
      int index);

  /**
   * <code>int64 popularity = 6;</code>
   * @return The popularity.
   */
  long getPopularity();

  /**
   * <code>int64 totalUser = 7;</code>
   * @return The totalUser.
   */
  long getTotalUser();

  /**
   * <code>string totalUserStr = 8;</code>
   * @return The totalUserStr.
   */
  java.lang.String getTotalUserStr();
  /**
   * <code>string totalUserStr = 8;</code>
   * @return The bytes for totalUserStr.
   */
  com.google.protobuf.ByteString
      getTotalUserStrBytes();

  /**
   * <code>string totalStr = 9;</code>
   * @return The totalStr.
   */
  java.lang.String getTotalStr();
  /**
   * <code>string totalStr = 9;</code>
   * @return The bytes for totalStr.
   */
  com.google.protobuf.ByteString
      getTotalStrBytes();

  /**
   * <code>string onlineUserForAnchor = 10;</code>
   * @return The onlineUserForAnchor.
   */
  java.lang.String getOnlineUserForAnchor();
  /**
   * <code>string onlineUserForAnchor = 10;</code>
   * @return The bytes for onlineUserForAnchor.
   */
  com.google.protobuf.ByteString
      getOnlineUserForAnchorBytes();

  /**
   * <code>string totalPvForAnchor = 11;</code>
   * @return The totalPvForAnchor.
   */
  java.lang.String getTotalPvForAnchor();
  /**
   * <code>string totalPvForAnchor = 11;</code>
   * @return The bytes for totalPvForAnchor.
   */
  com.google.protobuf.ByteString
      getTotalPvForAnchorBytes();
}