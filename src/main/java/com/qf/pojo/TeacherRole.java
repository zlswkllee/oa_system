package com.qf.pojo;

import java.util.List;

public class TeacherRole {
    private int urid;
    private Teacher teacher;
    private List<Role> role;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TeacherRole{" +
                "urid=" + urid +
                ", teacher=" + teacher +
                ", role=" + role +
                ", flag=" + flag +
                '}';
    }
}
