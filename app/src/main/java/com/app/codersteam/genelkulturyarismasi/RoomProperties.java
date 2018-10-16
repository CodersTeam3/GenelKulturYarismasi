package com.app.codersteam.genelkulturyarismasi;

public class RoomProperties {
    private String room_date;
    private String room_renter;
    private String room_owner;
    public RoomProperties(){
    }
    public RoomProperties(String room_date,String room_renter,String room_owner){
    this.room_date=room_date;
    this.room_renter=room_renter;
    this.room_owner=room_owner;
    }

    public String getRoom_date() {
        return room_date;
    }

    public void setRoom_date(String room_date) {
        this.room_date = room_date;
    }

    public String getRoom_renter() {
        return room_renter;
    }

    public void setRoom_renter(String room_renter) {
        this.room_renter = room_renter;
    }

    public String getRoom_owner() {
        return room_owner;
    }

    public void setRoom_owner(String room_owner) {
        this.room_owner = room_owner;
    }
}



