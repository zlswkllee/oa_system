package com.qf.mapper;

public interface LoginMapper {

    public String getPasswordFromStudent(String username);

    public String getPasswordFromTeacher(String username);

    public String getPasswordFromAdviser(String username);
    public String getPasswordFromLeader(String username);
    public String getPasswordFromSysAdmin(String username);
}
