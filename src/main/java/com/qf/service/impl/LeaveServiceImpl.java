package com.qf.service.impl;


import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import com.qf.mapper.LeaveMapper;
import com.qf.pojo.Leave;
import com.qf.service.LeaveService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveMapper leaveMapper;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;


    @Override
    public int addStudentLeave(Leave leave) {
        String sname = leaveMapper.getSname(leave.getUsername());
        leave.setName(sname);

        int i = leaveMapper.addLeave(leave);
        int leid = leave.getLeid();
        String tusername = leaveMapper.getTusername(leave.getUsername());
        String ausername = leaveMapper.getAusername(leave.getUsername());
        String lusername = leaveMapper.getLusername();
        Date stardate = leave.getStarDate();
        Date enddate = leave.getEndDate();
        long stime = stardate.getTime();
        long etime = enddate.getTime();
        Long day = etime-stime;
        int days = (int) (day/(24*60*60*1000));
        System.out.println("——————————————————");
        System.out.println(days);
        System.out.println("+++++++++++++++++++++++++++++++");
        Map<String, Object> map = new HashMap<>();
        map.put("student",leave.getUsername());
        map.put("teacher",tusername);
        map.put("adviser",ausername);
        map.put("leader",lusername);
        map.put("days",days);
        runtimeService.startProcessInstanceByKey("stuleave",leid+"",map);

        Task task = taskService.createTaskQuery().taskAssignee(leave.getUsername()).singleResult();
        taskService.complete(task.getId());
        return i;
    }

    @Override
    public int addTeacherLeave(Leave leave){

        String tname = leaveMapper.getTname(leave.getUsername());
        leave.setName(tname);

        int i=leaveMapper.addLeave(leave);
        int leid = leave.getLeid();
        String lusername = leaveMapper.getLusername();
        Map<String, Object> map = new HashMap<>();
        map.put("teacher",leave.getUsername());
        map.put("leader",lusername);
        runtimeService.startProcessInstanceByKey("tealeave",leid+"",map);
        Task task = taskService.createTaskQuery().taskAssignee(leave.getUsername()).singleResult();
        taskService.complete(task.getId());
        return i;

    }

    @Override
    public int addAdviserLeave(Leave leave){
        String aname = leaveMapper.getAname(leave.getUsername());
        leave.setName(aname);

        int i=leaveMapper.addLeave(leave);
        int leid = leave.getLeid();
        String lusername = leaveMapper.getLusername();

        Map<String, Object> map = new HashMap<>();
        map.put("adviser",leave.getUsername());
        map.put("leader",lusername);
        runtimeService.startProcessInstanceByKey("adleave",leid+"",map);
        Task task = taskService.createTaskQuery().taskAssignee(leave.getUsername()).singleResult();
        taskService.complete(task.getId());

        return i;
    }

    @Override
    public List<Leave> leaveList(String username) {
        //查对应的待审批请假信息
        List<Task> taskList = taskService.createTaskQuery().taskAssignee(username).list();

        List<String> ids= new ArrayList<String>();
        for (Task ta:taskList
        ) {
            String key = runtimeService.createProcessInstanceQuery()
                    .processInstanceId(ta.getProcessInstanceId())
                    .singleResult().getBusinessKey();
            ids.add(key);

        }
        System.out.println("ids = " + ids);

        try{
            List<Leave> leaveList = leaveMapper.getLeave(ids);
            return leaveList;

        }catch (Exception e){
            return null;
        }



    }

    @Override
    public int updateLeave(int leid) {

        taskService.complete(taskService.createTaskQuery().processInstanceBusinessKey(leid+"").singleResult()
                .getId());



        int i = leaveMapper.updateLeave(leid);
        return i;
    }

}
