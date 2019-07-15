package com.qf.pojo;

public class Score {
    private int scid;
    private int grade;
    private int stage;
    private int cid;
    private int clid;
    private int sid;

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getClid() {
        return clid;
    }

    public void setClid(int clid) {
        this.clid = clid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scid=" + scid +
                ", grade=" + grade +
                ", stage=" + stage +
                ", cid=" + cid +
                ", clid=" + clid +
                ", sid=" + sid +
                '}';
    }
}
