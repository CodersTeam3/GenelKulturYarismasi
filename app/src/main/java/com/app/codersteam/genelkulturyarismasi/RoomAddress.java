package com.app.codersteam.genelkulturyarismasi;

public class RoomAddress {
    private String userid;
    private String roomid;

    public RoomAddress(String userid, String roomid) {
        this.userid = userid;
        this.roomid = roomid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }
}
