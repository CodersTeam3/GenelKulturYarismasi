package com.app.codersteam.genelkulturyarismasi;

public class AnswerTime {
    private String q1time;
    private String q2time;
    private String q3time;
    private String q4time;
    private String q5time;
    public AnswerTime(){

    }
    public AnswerTime(String q1time,String q2time,String q3time,String q4time,String q5time){
        this.q1time=q1time;
        this.q2time=q2time;
        this.q3time=q3time;
        this.q4time=q4time;
        this.q5time=q5time;
    }

    public String getQ1time() {
        return q1time;
    }

    public void setQ1time(String q1time) {
        this.q1time = q1time;
    }

    public String getQ2time() {
        return q2time;
    }

    public void setQ2time(String q2time) {
        this.q2time = q2time;
    }

    public String getQ3time() {
        return q3time;
    }

    public void setQ3time(String q3time) {
        this.q3time = q3time;
    }

    public String getQ4time() {
        return q4time;
    }

    public void setQ4time(String q4time) {
        this.q4time = q4time;
    }

    public String getQ5time() {
        return q5time;
    }

    public void setQ5time(String q5time) {
        this.q5time = q5time;
    }
}
