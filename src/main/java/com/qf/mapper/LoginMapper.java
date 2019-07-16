package com.qf.mapper;

public interface LoginMapper {

    public String getPasswordFromStudent(String username);

    public String getPasswordFromTeacher(String username);

    public String getPasswordFromAdviser(String username);
    public String getPasswordFromLeader(String username);
    public String getPasswordFromSysAdmin(String username);

    public int getSid(String username);

    public int getTid(String username);

    public int getAid(String username);

    public int getLid(String username);

    public int getYid(String username);
}
