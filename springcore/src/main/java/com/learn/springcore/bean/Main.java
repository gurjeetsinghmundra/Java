package com.learn.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= //Ioc container ke class
		new AnnotationConfigApplicationContext(BeanConfig.class);
		
		School sh1=context.getBean("sh1",School.class);
		System.out.println(sh1);
		
		Student s1=context.getBean("s1",Student.class);
		System.out.println(s1);
		
		
	}
}
