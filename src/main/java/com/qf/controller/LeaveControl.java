package com.qf.controller;


import com.qf.pojo.*;
import com.qf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@Controller
public class LeaveControl {

    @Autowired
    private LeaveService leaveService;

    @RequestMapping("addLeave")
    public String addLeave(Leave leave, HttpSession session){
        String username = (String) session.getAttribute("username");
        String flag = (String) session.getAttribute("flag");
        leave.setUsername(username);

        switch(flag){
            case "0":
                leaveService.addStudentLeave(leave);

                break;
            case "1":
                leaveService.addTeacherLeave(leave);
                break;
            case "2" :
                leaveService.addAdviserLeave(leave);
                break;


        }


        return "oaHome";
    }


    @RequestMapping("leaveList")
    public String leaveList(Model model,HttpSession session) {
         String username = (String) session.getAttribute("username");
         List<Leave> leaves = leaveService.leaveList(username);
         model.addAttribute("leaves",leaves);

         return "leaveList";

    }


    @RequestMapping("agreeLeave")
    @ResponseBody
    public String agreeLeave(int leid){
        leaveService.updateLeave(leid);
        return "success";
    }






}
