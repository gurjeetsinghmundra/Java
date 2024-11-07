package com.learn.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Config.class);
		
		
		Product p1=context.getBean("product",Product.class);
		System.out.println(p1);
		
		Category c1 = context.getBean("category",Category.class);
		System.out.println(c1);
		
	}
}
