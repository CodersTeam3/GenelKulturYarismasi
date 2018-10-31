package com.app.codersteam.genelkulturyarismasi;

public class UserProperties {
    private String personName;
    private String personEmail;
    private String personId ;
    private String personPhoto;

    public UserProperties() {

    }


    public UserProperties(String personName, String personEmail, String personId, String personPhoto) {
        this.personName = personName;
        this.personEmail = personEmail;
        this.personId = personId;
        this.personPhoto = personPhoto;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(String personPhoto) {
        this.personPhoto = personPhoto;
    }
}
