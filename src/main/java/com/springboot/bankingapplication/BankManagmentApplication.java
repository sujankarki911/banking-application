package com.springboot.bankingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class BankManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagmentApplication.class, args);
		//This is my commit here
	}
	
}
	//postman > controller > service > DAO or data base
//https://codebun.com/java-web-project-configuration/ to download swagger config