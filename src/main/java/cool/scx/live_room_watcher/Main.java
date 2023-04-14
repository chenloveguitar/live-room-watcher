package cool.scx.live_room_watcher;

import cool.scx.live_room_watcher.douyin.DouYinLiveRoomWatcher;

public class Main {

    public static void main(String[] args) {
        var liveRoomWatcher = new DouYinLiveRoomWatcher("https://live.douyin.com/21393392318");

        liveRoomWatcher.onChat(chat -> {
            System.out.println("[消息] " + chat.user().nickName() + "("+chat.user().displayId()+")" + " : " + chat.content());
        }).onUser(user -> {
            System.out.println("[来了] " + user.nickName() + "("+user.displayId()+")");
        }).onLike(like -> {
            System.out.println("[点赞] " + like.user().nickName() + "("+like.user().displayId()+")" + " x " + like.count());
        }).onFollow(follow -> {
            System.out.println("[关注] " + follow.user().nickName() + "("+follow.user().displayId()+")");
        }).onGift(gift -> {
            System.out.println("[礼物] " + gift.user().nickName() + "("+gift.user().displayId()+")" + " : " + gift.name() + "("+gift.diamondCount()+")" + " x " + gift.count());
        }).onLinkMic(linkMic -> {
//            System.out.println("[连麦] " + linkMic.user().nickName() + " : " + linkMic.content());
            System.out.println("[连麦] ");
        });

        liveRoomWatcher.startWatch();

        System.out.println("[直播流地址] " + liveRoomWatcher.liveRoomWebStreamURLs());
    }



}
