package com.qf.pojo;

public class Adviser {
    private int aid;
    private String aname;
    private String username;
    private String password;
    private String rolename;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Adviser{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
