package com.learn.Ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;

//Category is Singular
//Categories is Plural (in postman use this)


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//added rest repos(dependency) ie spring data rest

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//category_seq provides generated values
	private int categoryId;
	@Column(nullable = false) 	
	private String categoryName;
	@Column(nullable = false)
	private String categoryDesc;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	private List<Product> products;


}
