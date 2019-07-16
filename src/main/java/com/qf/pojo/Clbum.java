package com.qf.pojo;

public class Clbum {
    private int clid;
    private String clname;
    private Adviser adviser;
    private Teacher teacher;


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


    public Adviser getAdviser() {
        return adviser;
    }

    public void setAdviser(Adviser adviser) {
        this.adviser = adviser;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Clbum{" +
                "clid=" + clid +
                ", clname='" + clname + '\'' +
                ", adviser=" + adviser +
                ", teacher=" + teacher +
                '}';
    }
}
