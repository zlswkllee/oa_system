package com.qf.pojo;

import java.util.List;

public class StudentRole {
    private int urid;
    private Student student;
    private List<Role> roleList;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> role) {
        this.roleList = role;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "StudentRole{" +
                "urid=" + urid +
                ", student=" + student +
                ", role=" + roleList +
                ", flag=" + flag +
                '}';
    }
}
