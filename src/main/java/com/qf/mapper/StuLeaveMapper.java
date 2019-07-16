package com.qf.mapper;

import com.qf.pojo.StuLeave;

import java.util.List;

public interface StuLeaveMapper {

    public int updateLeave(int leids);

    public List<StuLeave> getLeave();

    public int addLeave(StuLeave stuLeave);


    public String getTeaname(String username);

    public String getSname(String username);
}
