package com.qf.pojo;

public class Score {
    private int scid;
    private int grade;
    private int stage;
    private Course course;
    private Clbum clbum;
    private Student student;

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


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Clbum getClbum() {
        return clbum;
    }

    public void setClbum(Clbum clbum) {
        this.clbum = clbum;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scid=" + scid +
                ", grade=" + grade +
                ", stage=" + stage +
                ", course=" + course +
                ", clbum=" + clbum +
                ", student=" + student +
                '}';
    }

}

