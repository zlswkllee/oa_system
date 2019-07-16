package com.qf.service.impl;

import com.qf.mapper.AuthoMapper;
import com.qf.pojo.Role;
import com.qf.service.AuthoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AuthorServiceImpl implements AuthoService {
    @Autowired
    private AuthoMapper authoMapper;
    @Override
    public List<Role> getRolesByUid(String username) {
        System.out.println("########"+username);
        List<Role> roles = new ArrayList<Role>();
        String s = username.split(":")[0];
        //由于前台标志位存储的是01234 数据库中为 12345
        String flag = (Integer.parseInt(username.split(":")[1])+1)+"";
        switch (flag){
            case "1" :
                roles = authoMapper.getRolesStudent(s);
                break;
            case "2":
                roles = authoMapper.getRolesTeacher(s);
                break;
            case "3":
                roles = authoMapper.getRolesAdvisor(s);
                break;
            case "4":
                roles = authoMapper.getRolesLeader(s);
                break;
            case "5":
                roles = authoMapper.getRolesSysadmin(s);
                break;
        }
        return roles;


    }

    @Override
    public List<String> getPermission(List<Role> roles) {
        List<String> rids = new ArrayList<String>();
        for(Role role:roles){
            rids.add(role.getRid()+"");
        }
        return authoMapper.getPermission(rids);
    }
}
