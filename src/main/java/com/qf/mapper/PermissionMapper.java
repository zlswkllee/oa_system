package com.qf.mapper;

import com.qf.pojo.*;

import java.util.List;

public interface PermissionMapper {
    public int addUserRole(UserRole userRole);
    public int deleteRole(UserRole userRole);
    List<StudentRole> getRolesStudent();
    List<TeacherRole> getRolesTeacher();
    List<AdviserRole> getRolesAdvisor();
    List<LeaderRole> getRolesLeader();


}
