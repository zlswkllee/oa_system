package com.qf.controller;

import com.qf.mapper.UserManageMapper;
import com.qf.pojo.Adviser;
import com.qf.pojo.Leader;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;
import com.qf.service.UserManageService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserManageController {
    @Autowired
    private UserManageService userManageService;
    @RequestMapping("/allUserList")
    public String allUserList(Model model){
        List<Student> stuList = userManageService.getStuList();
        List<Teacher> teaList = userManageService.getTeaList();
        List<Adviser> advList = userManageService.getAdvList();
        List<Leader> leaList = userManageService.getLeaList();
        model.addAttribute("stuList",stuList);
        model.addAttribute("teaList",teaList);
        model.addAttribute("advList",advList);
        model.addAttribute("leaList",leaList);
        return "userManage";
    }
    @RequestMapping("/updatePass")
    public String updatePass(String sid, String flag, HttpSession session){
        List<String> updatePass = new ArrayList<>();
        updatePass.add(sid);
        updatePass.add(flag);
        session.setAttribute("updatePass",updatePass);
        return "resetPassword";
    }
    @RequestMapping("/updatePassdeal")
    public String updatePassDeal(HttpSession session,String password){
        Md5Hash md5Hash = new Md5Hash(password,"qf",2);
        String password0 = md5Hash.toString();
        List<String> updatePass=(List<String>)session.getAttribute("updatePass");
        String uid = updatePass.get(0);
        String flag = updatePass.get(1);
        Object object = new Object();
        switch (flag){
            case "1":
                Student student = new Student();
                student.setPassword(password0);
                student.setSid(Integer.parseInt(uid));
                object = student;
                break;
            case "2":
                Teacher teacher = new Teacher();
                teacher.setPassword(password0);
                teacher.setTid(Integer.parseInt(uid));
                object = teacher;
                break;
            case "3":
                Adviser adviser = new Adviser();
                adviser.setPassword(password0);
                adviser.setAid(Integer.parseInt(uid));
                object = adviser;
                break;
            case "4":
                Leader leader = new Leader();
                leader.setPassword(password0);
                leader.setLid(Integer.parseInt(uid));
                object = leader;
                break;
        }
        userManageService.updatePassword(object,flag);
        return "redirect:/allUserList";
    }
    @RequestMapping("findUser")
    public String findUser(String username,String flag,Model model){

            switch (flag){
                case "1":
                    List<Student> stuList = userManageService.getStu(username);
                    model.addAttribute("stuList",stuList);
                    break;
                case "2":
                    List<Teacher> teaList = userManageService.getTea(username);
                    model.addAttribute("teaList",teaList);
                    break;
                case "3":
                    List<Adviser> advList = userManageService.getAdv(username);
                    model.addAttribute("advList",advList);
                    break;
                case "4":
                    List<Leader> leaList = userManageService.getLea(username);
                    model.addAttribute("leaList",leaList);
                    break;
                case "0":
                    List<Student> stuList1 = userManageService.getStu(username);
                    if(stuList1.size()!= 0)
                        model.addAttribute("stuList",stuList1);
                    List<Teacher> teaList1 = userManageService.getTea(username);
                    if (teaList1.size()!= 0)
                        model.addAttribute("teaList",teaList1);
                    List<Adviser> advList1 = userManageService.getAdv(username);
                    if(advList1.size()!= 0)
                        model.addAttribute("advList",advList1);
                    List<Leader> leaList1= userManageService.getLea(username);
                    if(leaList1.size()!= 0)
                        model.addAttribute("leaList",leaList1);
            }
            return "userManage";

    }
    @ResponseBody
    @RequestMapping("/deleteUserManage")
    public String deleteUserManage(String sid, String flag){
        return "";
    }


    @RequestMapping("/employeeList")
    public String employList(Model model){
        List<Teacher> teaList = userManageService.getTeaList();
        List<Adviser> advList = userManageService.getAdvList();
        List<Leader> leaList = userManageService.getLeaList();
        model.addAttribute("teaList",teaList);
        model.addAttribute("advList",advList);
        model.addAttribute("leaList",leaList);
        return "employManage";
    }
    @RequestMapping("/findEmployee")
    public String findEmploy(String username,String flag,Model model){
        switch (flag){
            case "2":
                List<Teacher> teaList = userManageService.getTea(username);
                model.addAttribute("teaList",teaList);
                break;
            case "3":
                List<Adviser> advList = userManageService.getAdv(username);
                model.addAttribute("advList",advList);
                break;
            case "4":
                List<Leader> leaList = userManageService.getLea(username);
                model.addAttribute("leaList",leaList);
                break;
            case "0":
                List<Teacher> teaList1 = userManageService.getTea(username);
                if (teaList1.size()!= 0)
                    model.addAttribute("teaList",teaList1);
                List<Adviser> advList1 = userManageService.getAdv(username);
                if(advList1.size()!= 0)
                    model.addAttribute("advList",advList1);
                List<Leader> leaList1= userManageService.getLea(username);
                if(leaList1.size()!= 0)
                    model.addAttribute("leaList",leaList1);
        }
        return "employManage";
    }

}
