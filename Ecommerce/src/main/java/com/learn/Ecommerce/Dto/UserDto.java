package com.learn.Ecommerce.Dto;

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
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String confirmPassword;
	private int age;

	
}
