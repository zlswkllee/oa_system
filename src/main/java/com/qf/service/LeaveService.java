package com.qf.service;

import com.qf.mapper.LeaveMapper;
import com.qf.pojo.Leave;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface LeaveService {

  public int addStudentLeave(Leave leave);
    public int addTeacherLeave(Leave leave);
    public int addAdviserLeave(Leave leave);
    public List<Leave> leaveList(String username);

    public int updateLeave(int leid);

}
