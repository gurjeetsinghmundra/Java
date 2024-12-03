package com.learn.Ecommerce.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //This has came from hibrenate
	//will create address_seq table 
	private int addressId;
	@Column(nullable = false)
	private String addressLine1;
	@Column(nullable = false)
	private String addressLine2;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private int pincode;
	
	@JsonBackReference  //to avoid circular path in postman
	//user me address aur address me user nhi dikhna chahiye (in postman output)
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	//mappedBy se address table me user id nhi banega 
	private User user;
	

}
