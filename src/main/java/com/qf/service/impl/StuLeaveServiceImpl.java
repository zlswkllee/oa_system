package com.qf.service.impl;

import com.qf.mapper.StuLeaveMapper;
import com.qf.pojo.StuLeave;
import com.qf.service.StuLeaveService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class StuLeaveServiceImpl implements StuLeaveService {
    @Autowired
    private StuLeaveMapper stuLeaveMapper;

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;

    @Override
    public int addLeave(StuLeave stuLeave,String username) {
        int i = stuLeaveMapper.addLeave(stuLeave);
        int leids = stuLeave.getLeids();
        String teaname = stuLeaveMapper.getTeaname(username);
        String sname = stuLeaveMapper.getSname(username);
        Map<String, Object> map = new HashMap<>();
        map.put("student",sname);
        map.put("teacher",teaname);
        runtimeService.startProcessInstanceByKey("stuleave",leids+"",map);

        Task task = taskService.createTaskQuery().taskAssignee(sname).singleResult();
        taskService.complete(task.getId());
        return i;
    }



}
