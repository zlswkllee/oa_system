package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes(names = {"user"})
public class LoginControl {

    @RequestMapping("jump")
    public String jump(){
        return "login";
    }

    @RequestMapping("login")
    public String login(String username, String password, int statu, HttpSession session){


        return "";
    }
}
