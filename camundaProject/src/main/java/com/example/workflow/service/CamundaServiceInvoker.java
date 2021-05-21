package com.example.workflow.service;


import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.model.UserDetails;

@Service
public class CamundaServiceInvoker {

	@Autowired 
	
	RuntimeService runtimeService;
	
	public void startProcessByMessage(UserDetails person) {

//		ProcessInstance processInstance = runtimeService.startProcessInstanceById("userAuthorization");
//		processInstance.getProcessDefinitionId();
		
		runtimeService.createMessageCorrelation("msg-1")
		.setVariable("username", person.getUsername())
		.setVariable("rights",person.getRights())
		.correlate();
		
		
		

	}
	
}
