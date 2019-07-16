package com.qf.service;

import com.qf.pojo.Role;

import java.util.List;

public interface RoleService {
    public int insertRole(Role role);

    public List<Role> selectAllRole();

    public Role getRoleById(int rid);

    public int updateRole(Role role);
    //包含对能否删除角色进行判断
    public int checkDeleteRole(int rid);
}
