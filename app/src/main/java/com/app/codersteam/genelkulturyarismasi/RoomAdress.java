package com.app.codersteam.genelkulturyarismasi;

public class RoomAdress {
    private String userid;
    private String roomid;
    public RoomAdress(){

    }
    public RoomAdress(String userid,String roomid){
        this.userid=userid;
        this.roomid=roomid;

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
