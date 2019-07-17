package com.qf.controller;


import com.qf.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ScoreControl {

    @Autowired
    private ScoreService scoreService;


    @RequestMapping("studentList")
    public String studentList(HttpSession session, Model model){



        return "studentList";
    }
}
