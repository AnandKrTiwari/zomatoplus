package com.thinkxfactor.zomatoplus.config;

import org.springframework.boot.SpringApplication;//maven downloaded spring framework from where we import*
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//1st day: tells compiler this is the starting point


@ComponentScan("com.thinkxfactor")
@EnableJpaRepositories(basePackages = "com.thinkxfactor")
@EntityScan("com.thinkxfactor")  

public class ZomatoplusApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZomatoplusApplication.class);//* this function
	}
	
	
}
