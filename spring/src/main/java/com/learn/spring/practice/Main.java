package com.learn.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Config.class);
		
		Sports s1 = context.getBean("s1",Sports.class);
		System.out.println(s1);
		
		Location l1= context.getBean("l1",Location.class);
		System.out.println(l1);
	}

}
