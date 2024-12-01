package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	//address_seq
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
	

}
