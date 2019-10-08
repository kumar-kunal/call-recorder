package com.example.call_recorder_for_android;

public class Model implements Comparable<Model> {
    private String callName;
    private String userNameFromContact;

    public String getUserNameFromContact() {
        return userNameFromContact;
    }

    public void setUserNameFromContact(String userNameFromContact) {
        this.userNameFromContact = userNameFromContact;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }

    public Model(String callName) {
        this.callName = callName;
    }

    public int compareTo(Model another) {
        Long date1 = Long.valueOf(this.getCallName().substring(1, 15));
        Long date2 = Long.valueOf(another.getCallName().substring(1, 15));
        return (date2>date1 ? -1 : (date2==date1 ? 0 : 1));
    }

}