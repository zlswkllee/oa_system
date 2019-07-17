package com.qf.pojo;

import java.util.List;

public class AdviserRole {
    private int urid;
    private Adviser adviser;
    private List<Role> role;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public Adviser getAdviser() {
        return adviser;
    }

    public void setAdviser(Adviser adviser) {
        this.adviser = adviser;
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
        return "AdviserRole{" +
                "urid=" + urid +
                ", adviser=" + adviser +
                ", role=" + role +
                ", flag=" + flag +
                '}';
    }
}
