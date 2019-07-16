package com.qf.service;

import com.qf.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface LoginService {


    public String getPassword(String username);
}
