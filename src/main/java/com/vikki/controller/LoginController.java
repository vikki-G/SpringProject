package com.vikki.controller;


import java.util.Map;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	@RequestMapping(value="login",method=RequestMethod.GET)
	public ResponseEntity<?> test(@RequestParam Map<String, String> requestParams)
 {
		String aa = requestParams.get("name");
		String bb = requestParams.get("password");
	    Result =obj.userLogin(aa,bb);
		return new ResponseEntity<>(Result,HttpStatus.OK);
		 
	}
	

}
