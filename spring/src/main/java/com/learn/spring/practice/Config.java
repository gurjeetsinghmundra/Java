package com.learn.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Sports s1()
	{
		return new Sports(101,"Football",null);
	}
	
	@Bean
	public Location l1()
	{
		return new Location(4,"Mumbai");
	}
	

}
