package com.qf.pojo;

public class Clbum {
    private int clid;
    private String clname;
    private int aid;
    private int tid;

    public int getClid() {
        return clid;
    }

    public void setClid(int clid) {
        this.clid = clid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Clbum{" +
                "clid=" + clid +
                ", clname='" + clname + '\'' +
                ", aid=" + aid +
                ", tid=" + tid +
                '}';
    }
}
