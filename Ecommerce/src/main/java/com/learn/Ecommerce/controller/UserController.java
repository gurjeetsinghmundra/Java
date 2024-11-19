package com.learn.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
//	Post ["/users"]
	@PostMapping
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto)
	{
		UserDto savedUser = userService.addUser(userDto);
		
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}
	
}
