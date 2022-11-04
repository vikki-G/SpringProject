package com.vikki.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Testservice {
 String popup="";
 @Value("${spring.name}")
 private String users;
 @Value("${spring.password}")
 private String passwords;
 
 public String userLogin(String name, String password) {
	 if (name!=null&&password!=null) {
		 if (name.equals(users)) {
			 if (password.equals(passwords)) {
				popup ="succesfull login";
			} else {
                 popup ="enter correct password";
                 
			}
			
		} else {
              popup = "Enter valid Username";
		}
		
	}
	 else
	 {
		 popup="Values cannot be null";
	 }
	 
	return popup;
	

}
}
