package com.example.workflow.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.workflow.model.UserDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserAuthorization implements JavaDelegate {
	
	Logger logger = LoggerFactory.getLogger(UserAuthorization.class);
	
//	public void mapper(String json) throws JsonMappingException, JsonProcessingException {
//		ObjectMapper mapper = new ObjectMapper();
//		user = mapper.readValue(json, UserDetails.class);	
//		
//		
//	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Inside UserAuthorization");
		execution.setVariable("sample", "sample");
//		execution.setVariable("user", user.getUsername());
//		if(user.getUsername().equalsIgnoreCase("admin") && user.getRights().equalsIgnoreCase("YES")) {
//			execution.setVariable("isUserAuthorized", true);
//		}
//		else
//		execution.setVariable("isUserAuthorized", false);

	}

}
	