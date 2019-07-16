package com.qf.leave;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeployLeave {

    ProcessEngine processEngine=null;
    @Before
    public  void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_dao.xml");

        processEngine= (ProcessEngine) applicationContext.getBean("processEngine");


    }

    @Test
    public  void testDepoly1(){

        System.out.println("processEngine = " + processEngine);

        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("stuleave.bpmn")
                .deploy();
    }

    @Test
    public  void testDepoly2(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("tealeave.bpmn")
                .deploy();
    }

    @Test
    public  void testDepoly3(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment().addClasspathResource("adleave.bpmn")
                .deploy();
    }
}
