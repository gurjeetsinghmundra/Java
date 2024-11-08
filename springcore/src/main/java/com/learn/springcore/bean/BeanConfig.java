package com.learn.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // has all the settings(components kaha milege and all)
public class BeanConfig {

	@Bean //MethodLevelAnnotation
	public Student s1()
	{
		return new Student(101, "Gurjeet", null);
	}
	
	@Bean
	public School sh1()
	{
		return new School(13, "Holy Cross High School");
	}
	
	@Bean
	public School sh2()
	{
		return new School(14, "National School");
	}
}
