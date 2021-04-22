package com.carnival.models;

public class CruiseInformation {
    private String sail;
    private String duration;
    public CruiseInformation(String sail, String duration) {
        this.sail = sail;
        this.duration = duration;
    }

    public String getSail() {
        return sail;
    }

    public String getDuration() {
        return duration;
    }
}
