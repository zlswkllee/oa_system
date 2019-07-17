package com.qf.pojo;

import java.util.List;

public class SysadminRole {
    private int urid;
    private SysAdmin sysAdmin;
    private List<Role> role;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public SysAdmin getSysAdmin() {
        return sysAdmin;
    }

    public void setSysAdmin(SysAdmin sysAdmin) {
        this.sysAdmin = sysAdmin;
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
        return "SysadminRole{" +
                "urid=" + urid +
                ", sysAdmin=" + sysAdmin +
                ", role=" + role +
                ", flag=" + flag +
                '}';
    }
}
