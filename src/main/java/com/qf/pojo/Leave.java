package com.qf.pojo;

import java.util.Date;

public class Leave {
    private int leid;
    private String reason;
    private Date stardate;
    private Date enddate;
    private int state;
    private int uid;


    public int getLeid() {
        return leid;
    }

    public void setLeid(int leid) {
        this.leid = leid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getStardate() {
        return stardate;
    }

    public void setStardate(Date stardate) {
        this.stardate = stardate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leid=" + leid +
                ", reason='" + reason + '\'' +
                ", stardate=" + stardate +
                ", enddate=" + enddate +
                ", state=" + state +
                ", uid=" + uid +
                '}';
    }
}
