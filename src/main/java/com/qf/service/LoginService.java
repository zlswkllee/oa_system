package com.qf.service;

import com.qf.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface LoginService {


    public String getPassword(String username);

    public int getSid(String username);

    public int getTid(String username);

    public int getAid(String username);

    public int getLid(String username);

    public int getYid(String username);
}
