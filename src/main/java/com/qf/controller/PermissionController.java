package com.qf.controller;

import com.qf.pojo.*;
import com.qf.service.PermissionService;
import com.qf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RoleService roleService;
    @RequestMapping("/showList")
    public String showList(Model model){
        List<StudentRole> rolesStudent = permissionService.getRolesStudent();
        List<TeacherRole> rolesTeacher = permissionService.getRolesTeacher();
        List<AdviserRole> rolesAdvisor = permissionService.getRolesAdvisor();
        List<LeaderRole> rolesLeader = permissionService.getRolesLeader();

        List<Role> allroles = roleService.selectAllRole();
        model.addAttribute("allroles",allroles);
        model.addAttribute("rolesTeacher",rolesTeacher);
        model.addAttribute("rolesStudent",rolesStudent);
        model.addAttribute("rolesAdvisor",rolesAdvisor);
        model.addAttribute("rolesLeader",rolesLeader);
        return "showList";
    }
    @RequestMapping("deletePermRole")
    public String deletePermRole(UserRole userRole){
        if(userRole.getRid()!=0){
            permissionService.deleteRole(userRole);
        }

        return "redirect:/showList";
    }
    @RequestMapping("addPermRole")
    public String addPermRole(UserRole userRole){
        if(userRole.getRid()!=0){
            permissionService.addUserRole(userRole);
        }

        return "redirect:/showList";
    }
}
