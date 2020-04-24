package com.springboot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.springboot.crud.controller.EmployeeController;

@SpringBootApplication
//@ComponentScan(basePackageClasses = EmployeeController.class)
@ComponentScan("com.springboot.crud.controller")
@ComponentScan("com.springboot.crud.Repository")
@ComponentScan("com.springboot.crud.Exception")
@ComponentScan("com.springboot.crud.Model")
@ComponentScan("com.springboot.crud.Service")
//@EnableFeignClients
public class SpringBootMongoCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoCrudAppApplication.class, args);
	}

}
