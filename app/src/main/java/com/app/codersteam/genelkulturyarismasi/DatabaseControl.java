package com.app.codersteam.genelkulturyarismasi;

import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatabaseControl {
    public DatabaseControl() {

    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public RoomStatus getRoomStatus(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(RoomStatus.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public RoomAddress getRoomAdress(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(RoomAddress.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public RoomProperties getRoomProperties(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(RoomProperties.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public Questions getQuestions(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(Questions.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public QListId getQlistId(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(QListId.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public UserProperties getUserProperties(DataSnapshot dataSnapshot){
        return dataSnapshot.getValue(UserProperties.class);
    }
    /**
     * This method return the Value of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public AnswerTime getAnswerTime(DataSnapshot dataSnapshot) {
        return dataSnapshot.getValue(AnswerTime.class);
    }

    /**
     * This method return the List in that type Questions.class of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public List<Questions> getQuestionsList(DataSnapshot dataSnapshot){
        List<Questions> questionsList = new ArrayList<>();
        for (DataSnapshot ds:dataSnapshot.getChildren()) questionsList.add(ds.getValue(Questions.class));
        return questionsList;
    }

    /**
     *  This method return the List in that type QlistId.class of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public List<QListId> getQlistIdList(DataSnapshot dataSnapshot) {
        List<QListId> qListIdList = new ArrayList<>();
        for (DataSnapshot ds:dataSnapshot.getChildren()) qListIdList.add(ds.getValue(QListId.class));
        return qListIdList;
    }

    /**
     * This method return the List in that type RoomAddress.class of dataSnapshot
     * @param dataSnapshot
     * @return
     */
    public List<RoomAddress> getRequestsList(DataSnapshot dataSnapshot){
        List<RoomAddress> requestList = new ArrayList<>();
        for (DataSnapshot ds: dataSnapshot.getChildren()) requestList.add(ds.getValue(RoomAddress.class));
        return requestList;
    }
}
