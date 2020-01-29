package com.accusys.logTransacciones;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class LogTransaccionesApplication{
	//extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LogTransaccionesApplication.class, args);
	}
	
	
	/*
	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(LogTransaccionesApplication.class);
	   }
	   */	
	
	
	

}
