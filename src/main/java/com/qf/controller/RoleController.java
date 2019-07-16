package com.qf.controller;

import com.qf.pojo.Role;
import com.qf.service.RoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes(value = {"roles","role"})
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequiresPermissions(value = "role:update")
    @RequestMapping("/selectRole")
    public String selectRole(Model model){
        List<Role> roles = roleService.selectAllRole();
        model.addAttribute("roles",roles);
        return "addRole";
    }
    //增加

    @RequestMapping("/addRole")
    public String addRole(Role role){
        roleService.insertRole(role);
        return "redirect:/selectRole";
    }
    //修改
    @RequestMapping("/updateShow")
    public String updateShow(int rid,Model model){
        Role roleById = roleService.getRoleById(rid);
        model.addAttribute("role",roleById);
        return "updateRole";
    }
    @RequestMapping("/updateRole")
    public String update(Role role, HttpSession session){
        Role role1 = (Role)session.getAttribute("role");
        role.setRid(role1.getRid());
        roleService.updateRole(role);
        return "redirect:/selectRole";
    }
    @ResponseBody
    @RequestMapping("/deleteRole")
    public String deleteRole(int rid){
        int i = roleService.checkDeleteRole(rid);
        if(i == 0)
            return "该角色关联用户，不能删除";
        else
            return "删除成功";
    }



}
