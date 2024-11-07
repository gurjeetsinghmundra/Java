package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("101")
	private int id;
	@Value("Laptop")
	private String name;
	@Value("40000")
	private int price;
	
 //	@Autowired
	private Category category;
	
	public Product(int id, String name, int price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Category getCategory() {
		return category;
	}
	
	// @Autowired
	public void setCategory(Category category) {
		System.out.println("Setter method");
		this.category = category;
	}
	
	@Autowired
	public Product(Category category) {
		super();
		System.out.println("Constructor");
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
