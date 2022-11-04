package com.vikki.controller;


import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikki.service.Testservice;

@RestController
@RequestMapping("/gg/")
public class LoginController {
	@Autowired Testservice obj;
	
	String Result="";
	@RequestMapping(value="login",method=RequestMethod.GET,produces="application/json")
	public String userLogin(@RequestParam String name ,@RequestParam String password) {
		Result =obj.userLogin(name,password);
		return Result;
		
	}
	

}
