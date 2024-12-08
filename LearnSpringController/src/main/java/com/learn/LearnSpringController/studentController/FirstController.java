package com.learn.LearnSpringController.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.LearnSpringController.entity.Student;

@Controller
public class FirstController {
	 
	
	@GetMapping("/home")
	public @ResponseBody Student home()
	{
		return new Student(101,"Gurjeet",21,"Mumbai");
	}
	
}
