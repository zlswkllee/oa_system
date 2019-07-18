package com.qf.mapper;

import com.qf.pojo.*;

import java.util.List;

public interface UserManageMapper {
    public int updateStuPassword(Student student);
    public int updateTeaPassword(Teacher teacher);
    public int updateAdvPassword(Adviser adviser);
    public int updateLeaPassword(Leader leader);
    public int deleteStu(Student student);
    public int deleteTea(Teacher teacher);
    public int deleteAdv(Adviser adviser);
    public int deleteLea(Leader leader);
    public List<Student> getStu(String username);
    public List<Teacher> getTea(String username);
    public List<Adviser> getAdv(String username);
    public List<Leader> getLea(String username);
    public List<Student> getStuList();
    public List<Teacher> getTeaList();
    public List<Adviser> getAdvList();
    public List<Leader> getLeaList();
}
