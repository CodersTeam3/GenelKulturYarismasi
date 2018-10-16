package com.app.codersteam.genelkulturyarismasi;

public class RoomStatus {
    private String listindex;
    private String whoisnext;
    private String status;
    public RoomStatus(){

    }
    public RoomStatus(String listindex,String whoisnext,String status){
        this.listindex=listindex;
        this.whoisnext=whoisnext;
        this.status=status;
    }

    public String getListindex() {
        return listindex;
    }

    public void setListindex(String listindex) {
        this.listindex = listindex;
    }

    public String getWhoisnext() {
        return whoisnext;
    }

    public void setWhoisnext(String whoisnext) {
        this.whoisnext = whoisnext;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
