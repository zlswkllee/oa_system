package com.qf.mapper;

import com.qf.pojo.Leave;

import java.util.List;

public interface LeaveMapper  {

    public int addLeave(Leave leave);

    public String getTusername(String username);

    public String getSname(String username);

   public String getAname(String username);



    public String getLusername();

    public String getAusername(String username);

    public int updateLeave(int leid);

    public List<Leave> getLeave(List<String> idList);

    public String getTname(String username);



}
