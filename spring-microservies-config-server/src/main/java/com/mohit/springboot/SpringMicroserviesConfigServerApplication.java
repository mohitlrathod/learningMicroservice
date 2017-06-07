package com.mohit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMicroserviesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviesConfigServerApplication.class, args);
	}
}
