package com.qf.service;

import com.qf.pojo.Adviser;
import com.qf.pojo.Leader;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;

import java.util.List;

public interface UserManageService {
    public int updatePassword(Object object,String flag);

    public int deleteUser(Object object,String flag);

    public List<Student> getStu(String username);
    public List<Teacher> getTea(String username);
    public List<Adviser> getAdv(String username);
    public List<Leader> getLea(String username);

    public List<Student> getStuList();
    public List<Teacher> getTeaList();
    public List<Adviser> getAdvList();
    public List<Leader> getLeaList();
}
