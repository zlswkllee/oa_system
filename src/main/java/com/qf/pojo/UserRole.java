package com.qf.pojo;

public class UserRole {
    private int urid;
    private int uid;
    private int rid;
    private int flag;

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "urid=" + urid +
                ", uid=" + uid +
                ", rid=" + rid +
                ", flag=" + flag +
                '}';
    }
}
