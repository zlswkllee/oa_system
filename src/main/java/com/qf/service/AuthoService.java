package com.qf.service;

import com.qf.pojo.Role;

import java.util.List;

public interface AuthoService {
    List<Role> getRolesByUid(String username);

    List<String> getPermission(List<Role> roles);


}
