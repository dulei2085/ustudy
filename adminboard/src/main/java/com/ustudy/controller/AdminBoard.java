package com.ustudy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

// @SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class AdminBoard {

	public static void main(String[] args) throws Exception {
         SpringApplication.run(AdminBoard.class, args);
    }
	
}