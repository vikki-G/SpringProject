package com.vikki.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log/")
public class Logcontroller {
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ResponseEntity<?> test(@RequestParam Map<String, String> value){
		try {
			Logger log = LogManager.getLogger("name");
			value.put("vikki", "EmpID-08");
			value.put("prav", "EmpID-09");
			log.debug("testAPI started: " + value);
			log.info("testAPI started: " + value);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		return new ResponseEntity<>(value, HttpStatus.OK);
	}

}
