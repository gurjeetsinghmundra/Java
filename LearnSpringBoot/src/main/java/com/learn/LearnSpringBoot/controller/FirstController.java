package com.learn.LearnSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.LearnSpringBoot.entity.Student;

// we have 2 annotations
// @controller @RestController
// Their work is to make controllers
//apply on class to make it controller


@RestController
public class FirstController {
	
	//Get (For Reading Data)
	
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
	
	@GetMapping("/all-students")
	public List<Student> allStudents()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101,"Gurjeet",90));
		students.add(new Student(102,"Amit",95));
		
		return students;
	}
	
	//for multiple id
	
	@GetMapping("/students/{id}") //PathVariable (can put any id in link)/students/1 ,/students/2
	public String learnPathVariable(@PathVariable int id) //Java Variable
	{
		System.out.println(id);
		return "Data Fetched Successfully!";
	}
	
	//Post (To Upload Data)
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		return student;
	}
	
	
	
}
