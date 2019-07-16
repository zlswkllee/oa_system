package com.qf.mapper;

import com.qf.pojo.Role;

import java.util.List;

public interface AuthoMapper {
    List<Role> getRolesStudent(String username);
    List<Role> getRolesTeacher(String username);
    List<Role> getRolesAdvisor(String username);
    List<Role> getRolesLeader(String username);
    List<Role> getRolesSysadmin(String username);
    List<String> getPermission(List<String> rids);
}
