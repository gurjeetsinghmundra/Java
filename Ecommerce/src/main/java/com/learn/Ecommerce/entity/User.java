package com.learn.Ecommerce.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id        //to marks our variable as primary key we use id annotation
	private String id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true)
	private String emailId;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private int age;
	
	//managed matlab kaha pe chahiye
	@JsonManagedReference //user me address aur address me user nhi dikhna chahiye (in postman output)
	//foreign key
	@OneToOne(cascade = CascadeType.ALL) //dono taraf changes
	private Address address;
	
	//user delete huaa toh uske order be delete karo
	//@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	
	
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "user")//jaha pe order id nhi chahiye wahaper mappedby lete hai
	private List<Order> orders;
	
	
}
