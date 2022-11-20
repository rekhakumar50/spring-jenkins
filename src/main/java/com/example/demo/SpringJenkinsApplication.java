package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
    public static final Logger LOG = LoggerFactory.getLogger(SpringJenkinsApplication.class);
    
	public static void main(String[] args) {
		LOG.info("Application starting....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		LOG.info("Application started!!");
	}

}
