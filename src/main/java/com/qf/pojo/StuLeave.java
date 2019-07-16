package com.qf.pojo;

import java.util.Date;

public class StuLeave {

    private int leids;
    private String reason;
    private Date stardate;
    private Date enddate;
    private int state;
    private int sid;


    public int getLeids() {
        return leids;
    }

    public void setLeids(int leids) {
        this.leids = leids;
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


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "StuLeave{" +
                "leids=" + leids +
                ", reason='" + reason + '\'' +
                ", stardate=" + stardate +
                ", enddate=" + enddate +
                ", state=" + state +
                ", sid=" + sid +
                '}';
    }
}
