package com.vikki.controller;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikki.service.OperationService;

@RestController
@RequestMapping("/op/")
public class OperationController {

	@Autowired
	OperationService object;
	@Value("${filelocation}")
	private String filepath;

	@RequestMapping(value = "Operation", method = RequestMethod.GET)
	public ResponseEntity<?> Operation(@RequestParam Map<String, String> req) {
		int values = 0;
		try {

			String obj = req.get("operation");
			int val1 = Integer.parseInt(req.get("val1"));
			int val2 = Integer.parseInt(req.get("val2"));
			Logger log = LogManager.getLogger("mathoperation");

			log.debug("testAPI started: " +val1 );
			log.info("testAPI started: " + val2);
			log.info("testAPI started: " + obj );
			values = 0;
			switch (obj) {
			case "add":
				values = object.add(val1, val2);
				break;
			case "sub":
				values = object.sub(val1, val2);
				break;
			case "mul":
				values = object.mul(val1, val2);
				break;
			case "div":
				values = object.div(val1, val2);
				break;
			default:
				throw new Exception("Invalid opeat");
			}
			req.put("result", values + "");
			req.put("status", "success");

		} catch (Exception e) {
			req.put("status", "failure");
			req.put("reason", e + "");

		}

		return new ResponseEntity<>(req, HttpStatus.OK);

	}

	@RequestMapping(value = "loadproperties", method = RequestMethod.GET)
	public ResponseEntity<?> properties() {
		System.out.println(filepath);
		Properties pro = new Properties();
		try {
			FileInputStream file = new FileInputStream(filepath);
			pro.load(file);
			Logger log = LogManager.getLogger("gee");

			log.debug("testAPI started: " + pro);
			log.info("testAPI started: " + pro);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return new ResponseEntity<>(pro, HttpStatus.OK);

	}

}