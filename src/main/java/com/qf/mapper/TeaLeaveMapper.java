package com.qf.mapper;

import com.qf.pojo.TeaLeave;

import java.util.List;

public interface TeaLeaveMapper {


    public int updateLeave(int leidt);

    public List<TeaLeave> getLeave();

    public int addLeave(TeaLeave stuLeave);

    public String getTname(String username);

    public String getLname();
}
