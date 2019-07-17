package com.qf.service.impl;

import com.qf.mapper.AuthoMapper;
import com.qf.mapper.PermissionMapper;
import com.qf.pojo.*;
import com.qf.service.AuthoService;
import com.qf.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private AuthoMapper authoMapper;
    @Override
    public int addUserRole(UserRole userRole) {
        return permissionMapper.addUserRole(userRole);
    }

    @Override
    public int deleteRole(UserRole userRole) {
        return permissionMapper.deleteRole(userRole);
    }

    @Override
    public List<StudentRole> getRolesStudent() {
        List<StudentRole> rolesStudent = permissionMapper.getRolesStudent();
        for(StudentRole studentRole: rolesStudent){
            List<Role> rolesByUid = authoMapper.getRolesStudent(studentRole.getStudent().getUsername());
            studentRole.setRoleList(rolesByUid);
        }

        return rolesStudent;
    }

    @Override
    public List<TeacherRole> getRolesTeacher() {
        List<TeacherRole> rolesTeacher = permissionMapper.getRolesTeacher();
        for(TeacherRole teacherRole:rolesTeacher){
            List<Role> rolesTeacher1 = authoMapper.getRolesTeacher(teacherRole.getTeacher().getUsername());
            teacherRole.setRole(rolesTeacher1);
        }
        return rolesTeacher;
    }

    @Override
    public List<AdviserRole> getRolesAdvisor() {
        List<AdviserRole> rolesAdvisor = permissionMapper.getRolesAdvisor();
        for(AdviserRole adviserRole: rolesAdvisor){
            List<Role> rolesAdvisor1 = authoMapper.getRolesAdvisor(adviserRole.getAdviser().getUsername());
            adviserRole.setRole(rolesAdvisor1);
        }
        return rolesAdvisor;
    }

    @Override
    public List<LeaderRole> getRolesLeader() {
        List<LeaderRole> rolesLeader = permissionMapper.getRolesLeader();
        for(LeaderRole leaderRole:rolesLeader){
            List<Role> rolesLeader1 = authoMapper.getRolesLeader(leaderRole.getLeader().getUsername());
            leaderRole.setRole(rolesLeader1);
        }
        return rolesLeader;
    }
}
