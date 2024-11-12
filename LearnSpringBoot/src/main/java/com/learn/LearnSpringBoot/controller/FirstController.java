package com.learn.LearnSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// we have 2 annotations
// @controller @RestController
// Their work is to make controllers
//apply on class to make it controller


@RestController
public class FirstController {
	
	@GetMapping("/hello") // put this /hello link in postman to get output
	public String hello()
	{
		return "Hello";
	}
	
	
	@GetMapping("/name")
	public String Name()
	{
		return "Gurjeet";
	}
	

}
