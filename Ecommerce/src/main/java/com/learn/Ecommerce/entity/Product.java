package com.learn.Ecommerce.entity;


import java.util.List;

// Product is Singular
// Products is Plural

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name = "product-details") will help to change table name(table name will be same as class name so to change it will use this annotation)
//@Table(name = "table-name")

@Data  //PoJo class (data annotation will generate getters setters,ToString & constructors)
@AllArgsConstructor
@NoArgsConstructor
@Entity //will create table (to make table of this data)

public class Product {
	
	@Id               //will Apply primary key to the column
	private int productId;
	@Column(nullable = false) 		  //used to provide extra info about column
	private String productName;
	@Column(name = "description", nullable = false)
	private String productDescription;
	@Column(nullable = false)
	private int productPrice;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany(mappedBy = "products")
	private List<Order> orders;
}
