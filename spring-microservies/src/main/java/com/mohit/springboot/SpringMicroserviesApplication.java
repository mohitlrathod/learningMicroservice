package com.mohit.springboot;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Import(DemoConfiguration.class)
@ImportResource("/sample-config.xml")
public class SpringMicroserviesApplication {

	
	@Autowired
	@Resource(name="circus")
	List<String> cats;
	
	
	
	@RequestMapping("/")
	public String sayHello()
	{
		return String.join(",", cats);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviesApplication.class, args);
	}
}
