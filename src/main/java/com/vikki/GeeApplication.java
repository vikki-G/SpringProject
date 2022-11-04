package com.vikki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.vikki"))
public class GeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeeApplication.class, args);
	}

}
