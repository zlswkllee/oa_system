package com.qf.pojo;

import java.util.Date;

public class Student {
    private int sid;
    private String sname;
    private String username;
    private String password;
    private int age;
    private Date sdate;
    private String sex;
    private Course course;
    private Clbum clbum;
    private String rolename;


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sdate=" + sdate +
                ", sex='" + sex + '\'' +
                ", course=" + course +
                ", clbum=" + clbum +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
