package com.mohit.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DemoConfiguration {


	@Bean
	public List<String> cats()
	{
		return Arrays.asList("bengal","Tiger","Lion");
	}
	
	
}
