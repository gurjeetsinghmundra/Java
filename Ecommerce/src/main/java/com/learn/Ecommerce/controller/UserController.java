package com.learn.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
//	Post ["/users"] To add user
	@PostMapping
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto)
	{
		UserDto savedUser = userService.addUser(userDto);
		
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}
	

//GET ["/users/101"] To fetch user by id
	//want to find user_id(unique) so we can use userDto because it return one object
	//want to find list of cities(common) or pincode then use :- list of userDto
	
	@GetMapping("/{id}")//this is path variable
	//parameter kaa naam aur pathvariable kaa naam same hona chahiye
	//pathvariable to fetch data
	public ResponseEntity<UserDto> getUserById(@PathVariable String id)//parameter
	{
		UserDto userDto = userService.getUserById(id);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.FOUND);
	}
	
	
//GET ["/users"] To fetch all users
	
	@GetMapping
	public ResponseEntity<List<UserDto>> fetchAllUsers()
	{
		List<UserDto> allUsers = userService.getAllUsers();
		
		return new ResponseEntity<List<UserDto>>(allUsers,HttpStatus.OK);
		
	}
 	
	
//DELETE ["/users/{id}"]	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable String id)
	{
		String removeUser = userService.deleteUser(id);
		
		return new ResponseEntity<String>(removeUser,HttpStatus.OK);
		
	}
	
	
	
}
