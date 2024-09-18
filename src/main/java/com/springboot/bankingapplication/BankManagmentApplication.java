package com.springboot.bankingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/swagger-ui/

@SpringBootApplication
@EnableSwagger2
public class BankManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagmentApplication.class, args);
	}
	
}
	//postman > controller > service > DAO or data base
//https://codebun.com/java-web-project-configuration/ to download swagger config