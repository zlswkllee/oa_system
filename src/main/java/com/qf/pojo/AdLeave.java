package com.qf.pojo;

import java.util.Date;

public class AdLeave {

    private int leida;
    private String reason;
    private Date stardate;
    private Date enddate;
    private int state;
    private int aid;

    public int getLeida() {
        return leida;
    }

    public void setLeida(int leida) {
        this.leida = leida;
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

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "AdLeave{" +
                "leida=" + leida +
                ", reason='" + reason + '\'' +
                ", stardate=" + stardate +
                ", enddate=" + enddate +
                ", state=" + state +
                ", aid=" + aid +
                '}';
    }
}
