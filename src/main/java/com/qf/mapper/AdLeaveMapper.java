package com.qf.mapper;



import com.qf.pojo.AdLeave;

import java.util.List;

public interface AdLeaveMapper {

    public int updateLeave(int leida);

    public List<AdLeave> getLeave();

    public int addLeave(AdLeave stuLeave);

    public String getAname(String username);

    public String getLname();
}
