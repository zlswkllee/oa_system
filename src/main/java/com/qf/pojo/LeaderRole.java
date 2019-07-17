package com.qf.pojo;

import java.util.List;

public class LeaderRole {
    private int urid;
    private Leader leader;
    private List<Role> role;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public List<Role> getRole() {
        return role;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "LeaderRole{" +
                "urid=" + urid +
                ", leader=" + leader +
                ", role=" + role +
                ", flag=" + flag +
                '}';
    }
}
