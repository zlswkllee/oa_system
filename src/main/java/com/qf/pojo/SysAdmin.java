package com.qf.pojo;

public class SysAdmin {
    private int yid;
    private String yname;
    private String username;
    private String password;
    private String rolename;
    private String password_salt;

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public int getYid() {
        return yid;
    }

    public void setYid(int yid) {
        this.yid = yid;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
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
        return "SysAdmin{" +
                "yid=" + yid +
                ", yname='" + yname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolename='" + rolename + '\'' +
                ", password_salt='" + password_salt + '\'' +
                '}';
    }
}
