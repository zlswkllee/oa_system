package com.qf.service.impl;

import com.qf.mapper.UserManageMapper;
import com.qf.pojo.Adviser;
import com.qf.pojo.Leader;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;
import com.qf.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManageServiceImpl implements UserManageService {
    @Autowired
    private UserManageMapper userManageMapper;
    @Override
    public int updatePassword(Object object, String flag) {
        switch (flag){
            case "1":
                Student student = (Student)object;
                userManageMapper.updateStuPassword(student);
                break;
            case "2":
                Teacher teacher = (Teacher)object;
                userManageMapper.updateTeaPassword(teacher);
                break;
            case "3":
                Adviser adviser = (Adviser)object;
                userManageMapper.updateAdvPassword(adviser);
                break;
            case "4":
                Leader leader = (Leader) object;
                userManageMapper.updateLeaPassword(leader);
                break;

        }
        return 0;
    }

    @Override
    public int deleteUser(Object object, String flag) {
        switch (flag){
            case "1":
                Student student = (Student)object;
                userManageMapper.deleteStu(student);
                break;
            case "2":
                Teacher teacher = (Teacher)object;
                userManageMapper.deleteTea(teacher);
                break;
            case "3":
                Adviser adviser = (Adviser)object;
                userManageMapper.deleteAdv(adviser);
                break;
            case "4":
                Leader leader = (Leader) object;
                userManageMapper.deleteLea(leader);
                break;

        }
        return 0;
    }

    @Override
    public List<Student> getStu(String username) {
        return userManageMapper.getStu(username);
    }

    @Override
    public List<Teacher> getTea(String username) {
        return userManageMapper.getTea(username);
    }

    @Override
    public List<Adviser> getAdv(String username) {
        return userManageMapper.getAdv(username);

    }

    @Override
    public List<Leader> getLea(String username) {
        return userManageMapper.getLea(username);
    }

    @Override
    public List<Student> getStuList() {
        return userManageMapper.getStuList();
    }

    @Override
    public List<Teacher> getTeaList() {
        return userManageMapper.getTeaList();
    }

    @Override
    public List<Adviser> getAdvList() {
        return userManageMapper.getAdvList();
    }

    @Override
    public List<Leader> getLeaList() {
        return userManageMapper.getLeaList();
    }
}
