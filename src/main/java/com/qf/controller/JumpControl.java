package com.qf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("jump")
@Controller
public class JumpControl {


    @RequestMapping("addLeave")
    public String addLeave(){


        return "addLeave";
    }

    @RequestMapping("login")
    public String jump(){
        return "login";
    }


}
