package com.learn.Ecommerce.Dto;

import jakarta.validation.constraints.NotNull;

//postman se data jayega through dto and ayega dto se for data security

//that is why java is famous for security bcoz we need to go through multiple objects

//dto is used just to transfer data so we have a layer in between for security

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO stands for DATA TRANSFER OBJECTS


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String emailId;
	@NotNull
	private String password;
	@NotNull
	private String confirmPassword;
	@NotNull
	private int age;

	
}
