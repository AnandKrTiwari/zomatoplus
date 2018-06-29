package com.thinkxfactor.zomatoplus.config;

import org.springframework.boot.SpringApplication;//maven downloaded spring framework from where we import*
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//1st day: tells compiler this is the starting point
@ComponentScan("com.thinkxfactor")//scan for all the beans in the particular package
@EnableJpaRepositories(basePackages = "com.thinkxfactor")//to enable the use of jparepository
@EntityScan("com.thinkxfactor")  //scans all the objects with @entity notation in it
public class ZomatoplusApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZomatoplusApplication.class);//* this function
	}
	
	
}
