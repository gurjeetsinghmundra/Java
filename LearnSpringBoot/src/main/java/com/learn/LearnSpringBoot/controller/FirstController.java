package com.learn.LearnSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.LearnSpringBoot.entity.Student;

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
	
	
	@GetMapping("/studentDetails") //output will be in Json form
	public Student getStudent()
	{
		Student s=new Student();
		s.setId(101);
		s.setName("Gurjeet");
		s.setMarks(75);
		
		return s;
	}
	

	@GetMapping("/result")
	public Student getMarks()
	{
		Student s=new Student();
		s.setMarks(92);
		
		return s;
	}
}
