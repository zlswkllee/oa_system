package com.qf.service.impl;

import com.qf.mapper.AdLeaveMapper;
import com.qf.pojo.AdLeave;
import com.qf.service.AdleaveService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class AdleaveServiceImpl implements AdleaveService {

    @Autowired
    private AdLeaveMapper adLeaveMapper;

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    @Override
    public int addLeave(AdLeave adLeave, String username) {
        int i = adLeaveMapper.addLeave(adLeave);
        int leida = adLeave.getLeida();
        String aname = adLeaveMapper.getAname(username);
        String lname = adLeaveMapper.getLname();
        Map<String, Object> map = new HashMap<>();
        map.put("adviser",aname);
        map.put("leader",lname);
        runtimeService.startProcessInstanceByKey("adleave",leida+"",map);


        Task task = taskService.createTaskQuery().taskAssignee(aname).singleResult();
        taskService.complete(task.getId());

        return i;
    }
}
