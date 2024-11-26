package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}
