package com.qf.mapper;

import com.qf.pojo.Role;

import java.util.List;

public interface RoleMapper {
    public int insertRole(Role role);

    public List<Role> selectAllRole();

    public Role getRoleById(int rid);

    public int updateRole(Role role);
    //删除之前判断是否有关联该角色的用户
    public List<Role> selectUserRole(int rid);

    public int deleteRole(int rid);

}
