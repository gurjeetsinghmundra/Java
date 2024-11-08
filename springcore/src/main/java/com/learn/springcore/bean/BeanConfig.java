package com.learn.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Student s1()
	{
		return new Student(101, "Gurjeet", null);
	}
	
	@Bean
	public School sh1()
	{
		return new School(13, "Holy Cross High School");
	}
}
