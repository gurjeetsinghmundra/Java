package com.learn.Ecommerce.entity;

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
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	//mappedBy se address table me user id nhi banega 
	private User user;
	

}
