package com.qf.service.impl;

import com.qf.mapper.RoleMapper;
import com.qf.pojo.Role;
import com.qf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    @Override
    public List<Role> selectAllRole() {
        return roleMapper.selectAllRole();
    }

    @Override
    public Role getRoleById(int rid) {
        return roleMapper.getRoleById(rid);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public int checkDeleteRole(int rid) {
        List<Role> roles = roleMapper.selectUserRole(rid);
        if (roles.isEmpty()){
            roleMapper.deleteRole(rid);
            return 1;
        }else
            return 0;
    }
}
