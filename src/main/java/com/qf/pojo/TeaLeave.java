package com.qf.pojo;

import java.util.Date;

public class TeaLeave {

    private int leid;
    private String reason;
    private Date stardate;
    private Date enddate;
    private int state;
    private int tid;


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


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "TeaLeave{" +
                "leid=" + leid +
                ", reason='" + reason + '\'' +
                ", stardate=" + stardate +
                ", enddate=" + enddate +
                ", state=" + state +
                ", tid=" + tid +
                '}';
    }
}
