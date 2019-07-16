package com.qf.service.impl;

import com.qf.mapper.LoginMapper;
import com.qf.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public String getPassword(String username) {
        String[] split = username.split(":");
        String password=null;
        switch (split[1]){
            case "0":
                password = loginMapper.getPasswordFromStudent(split[0]);
                break;
            case "1":
                password = loginMapper.getPasswordFromTeacher(split[0]);
                break;
            case "2":
                password =  loginMapper.getPasswordFromAdviser(split[0]);
                break;
            case "3":
                password = loginMapper.getPasswordFromLeader(split[0]);
                break;
            case "4":
                password =  loginMapper.getPasswordFromSysAdmin(split[0]);
                break;
        }

        return password;
    }

    @Override
    public int getSid(String username) {

        return loginMapper.getSid(username);
    }

    @Override
    public int getTid(String username) {
        return loginMapper.getTid(username);
    }

    @Override
    public int getAid(String username) {
        return loginMapper.getAid(username);
    }

    @Override
    public int getLid(String username) {
        return loginMapper.getLid(username);
    }

    @Override
    public int getYid(String username) {
        return loginMapper.getYid(username);
    }
}
