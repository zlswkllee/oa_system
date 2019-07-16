package com.qf.service.impl;

import com.qf.mapper.TeaLeaveMapper;
import com.qf.pojo.TeaLeave;
import com.qf.service.TeaLeaveService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TeaLeaveServiceImpl implements TeaLeaveService {

    @Autowired
    private TeaLeaveMapper teaLeaveMapper;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;


    @Override
    public int addLeave(TeaLeave teaLeave, String username) {

        int i = teaLeaveMapper.addLeave(teaLeave);
        int leidt = teaLeave.getLeidt();
        String tname = teaLeaveMapper.getTname(username);
        String lname = teaLeaveMapper.getLname();
        Map<String, Object> map = new HashMap<>();
        map.put("teacher",tname);
        map.put("leader",lname);
        runtimeService.startProcessInstanceByKey("tealeave",leidt+"",map);


        Task task = taskService.createTaskQuery().taskAssignee(tname).singleResult();
        taskService.complete(task.getId());
        return i;
    }
}
