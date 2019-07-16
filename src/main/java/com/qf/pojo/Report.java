package com.qf.pojo;

import java.util.Date;

public class Report {
    private int rid;
    private String title;
    private String content;
    private Date redate;
    private int grade;
    private int state;
    private Student student;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRedate() {
        return redate;
    }

    public void setRedate(Date redate) {
        this.redate = redate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Report{" +
                "rid=" + rid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", redate=" + redate +
                ", grade=" + grade +
                ", state=" + state +
                ", student=" + student +
                '}';
    }
}
