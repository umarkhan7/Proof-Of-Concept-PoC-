package com.example.workflow.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.model.UserDetails;
import com.example.workflow.service.CamundaServiceInvoker;
import com.example.workflow.service.UserAuthorization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Camundacontroller {
	@Autowired
	CamundaServiceInvoker camundaServiceInvoker;
	@PostMapping("/user_json")
//	@RequestMapping(value = "/user_json",method = RequestMethod.POST )
	private void  userDetails(@RequestBody String json){
		ObjectMapper mapper = new ObjectMapper();
		UserDetails user;
		try {
			user = mapper.readValue(json, UserDetails.class);
			camundaServiceInvoker.startProcessByMessage(user);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		//		UserAuthorization userAuth = new UserAuthorization();
//		System.out.println("Inside userDetails");
//		try{
//			userAuth.mapper(json);
//			
//		}catch (Exception e) {
//		e.printStackTrace();
//		}
		
	}

}
