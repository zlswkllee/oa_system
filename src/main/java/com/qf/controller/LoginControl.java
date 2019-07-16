package com.qf.controller;

import com.qf.pojo.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes(names = {"user"})
public class LoginControl {

    @Autowired
    private SecurityManager securityManager;

    @RequestMapping("jump")
    public String jump(){
        return "login";
    }

    @RequestMapping("login")
    public String login(String username, String password, String statu, HttpSession session){

        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        String username0 = username+":"+statu;
        Md5Hash md5Hash = new Md5Hash(password,"qf",2);
        String password0 = md5Hash.toString();
        System.out.println("password0 = " + password0);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username0, password0);
        try{
            subject.login(usernamePasswordToken);
            if(subject.isAuthenticated()){
                //登陆成功
                session.setAttribute("flag",statu);
                int i = Integer.parseInt(statu);

                switch (i){
                    case 0:
                        Student student = new Student();
                        student.setUsername(username);
                        session.setAttribute("user",student);
                        break;
                    case 1:
                        Teacher teacher = new Teacher();
                        teacher.setUsername(username);
                        session.setAttribute("user",teacher);
                        break;

                    case 2:
                        Adviser adviser = new Adviser();
                        adviser.setUsername(username);
                        session.setAttribute("user",adviser);
                        break;
                    case 3:
                        Leader leader = new Leader();
                        leader.setUsername(username);

                        session.setAttribute("user",leader);
                        break;
                    case 4:
                        SysAdmin sysAdmin = new SysAdmin();
                        sysAdmin.setUsername(username);
                        session.setAttribute("user",sysAdmin);
                        break;
                }






                return "oaHome";
            }

        }catch (AuthenticationException e){
            //登陆失败
            System.out.println("登陆失败");

        }


        return "login";
    }



}
