package com.learn.Ecommerce.Dto;

import com.learn.Ecommerce.validators.PasswordMatch;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

//postman se data jayega through dto and ayega dto se for data security

//that is why java is famous for security bcoz we need to go through multiple objects

//dto is used just to transfer data so we have a layer in between for security

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO stands for DATA TRANSFER OBJECTS

//size and not blank annotations can be applied on strings (not on integers)
@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch //class level annotation created by us
public class UserDto {

	
	
	//we also have class level annotation(will use for pass and confirm pass)
	//2 variable ke upar kabhi ek sath annotation nhi lagta thats why we use class level
	
	
	//This are field level annotation
	private String id;
	@NotNull
	@NotBlank(message = "firstname cannot be blank") 
	@Size (min =2 , max = 50) //characters range for name
	private String firstName;
	@NotNull
	@NotBlank (message = "lastname cannot be blank") 
	private String lastName;
	@NotNull
	@NotBlank (message = "email id cannot be blank") 
	//the pattern code is copied from regex website (it is for email format : guru@gmail.com)
	@Pattern(regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String emailId;
	@NotNull
	@NotBlank (message = "password cannot be blank")
	//the pattern code is copied from regex website for passwords
	@Pattern (regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	@NotNull   //cant be null
	@NotBlank  //will not allow to keep the value blank(empty)
	private String confirmPassword;
	@NotNull
	@Min(16)
	@Max(120)
	private int age;

	
}
