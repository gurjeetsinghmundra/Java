package com.learn.Ecommerce.entity;

//Category is Singular
//Categories is Plural (in postman use this)


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	private int categoryId;
	@Column(nullable = false) 	
	private String categoryName;
	@Column(nullable = false)
	private String categoryDesc;

}
