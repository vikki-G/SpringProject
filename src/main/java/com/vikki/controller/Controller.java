package com.vikki.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikki.service.Testservice;

@RestController
@RequestMapping("/api/")
public class Controller {
	@Autowired
	Testservice objTestService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public ResponseEntity<?> test(@RequestParam Map<String, String> requestParam) throws Exception {
		requestParam.put("vikki", 25+"");
		return new ResponseEntity<>(requestParam, HttpStatus.OK);
	}
}
	