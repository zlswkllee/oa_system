package com.qf.controller;


import com.qf.pojo.*;
import com.qf.service.AdleaveService;
import com.qf.service.StuLeaveService;
import com.qf.service.TeaLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RequestMapping
@Controller
public class LeaveControl {

    @Autowired
    private StuLeaveService stuLeaveService;
    @Autowired
    private TeaLeaveService teaLeaveService;
    @Autowired
    private AdleaveService adleaveService;

    @RequestMapping("addLeave")
    public String addLeave(String reason, Date stardate, Date enddate, HttpSession session){

        String flag = (String) session.getAttribute("flag");

        switch(flag){
            case "0":
                Student student = (Student) session.getAttribute("user");
                StuLeave stuLeave=new StuLeave();
                stuLeave.setReason(reason);
                stuLeave.setStardate(stardate);
                stuLeave.setEnddate(enddate);
                stuLeaveService.addLeave(stuLeave,student.getUsername());
                break;
            case "1":
                Teacher teacher = (Teacher) session.getAttribute("user");
                TeaLeave teaLeave = new TeaLeave();
                teaLeave.setReason(reason);
                teaLeave.setStardate(stardate);
                teaLeave.setEnddate(enddate);
                teaLeaveService.addLeave(teaLeave,teacher.getUsername());
                break;
            case "2" :
                Adviser adviser = (Adviser) session.getAttribute("user");
                AdLeave adLeave = new AdLeave();
                adLeave.setReason(reason);
                adLeave.setStardate(stardate);
                adLeave.setEnddate(enddate);
                adleaveService.addLeave(adLeave,adviser.getUsername());
                break;


        }


        return "oaHome";
    }


     @RequestMapping("leaveList")
    public String leaveList(Model model,HttpSession session){
        String flag = (String)session.getAttribute("flag");
        switch(flag){
            case "1":


        }


        return "";
     }


}
