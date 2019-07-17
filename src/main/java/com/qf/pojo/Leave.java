package com.qf.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class Leave {

    private int leid;
    private String reason;


    private Date starDate;


    private Date endDate;
    private int state;
    private String username;
    private String name;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeid() {
        return leid;
    }

    public void setLeid(int leid) {
        this.leid = leid;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leid=" + leid +
                ", reason='" + reason + '\'' +
                ", starDate=" + starDate +
                ", endDate=" + endDate +
                ", state=" + state +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
