package com.app.codersteam.genelkulturyarismasi;

public class Questions {
    private String questions;
    private String answer;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String qtype;
    public Questions(){

    }
    public Questions(String questions,String answer,String op1,String op2,String op3,String op4,String qtype){
        this.questions=questions;
        this.answer=answer;
        this.op1=op1;
        this.op2=op2;
        this.op3=op3;
        this.op4=op4;
        this.qtype=qtype;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }
}
