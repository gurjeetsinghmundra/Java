package com.learn.Ecommerce.controller;

//learn streams,optional(find first) homework
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
//	Post ["/users"] To add user
	@PostMapping
	//ResponseEntity is used to set status code	
	public ResponseEntity<UserDto> addUser(@RequestBody @Valid UserDto userDto)
	{												   //without valid validation will not work
		UserDto savedUser = userService.addUser(userDto);
		
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}
	

//GET ["/users/101"] To fetch user by id
	//want to find user_id(unique) so we can use userDto because it return one object
	//want to find list of cities(common) or pincode then use :- list of userDto
	
	@GetMapping("/{id}")//this is path variable
	//parameter kaa naam aur pathvariable kaa naam same hona chahiye
	//pathvariable to fetch data (which is in search in postman)
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
	
//PUT	
	
//@requestbody is used to read data from postman(through dto) and store it in a variable
//same is done by path variable 
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUserById(@PathVariable String id,
			@RequestBody UserDto  userDto )
		//reads↑ , from userdto↑ , variable↑
	{
		UserDto updateUser = userService.updateUser(id, userDto);
		
		return new ResponseEntity<UserDto>(updateUser,HttpStatus.OK);
				  //datatype ↑	
	}
	
	
// -----------------------------------------------------------------------------------------	
	
	// /users/find-by-email/singhgurjeet101003@gmail.com
	
	// usually links are like this : find-by-email
	
	// to avoid conflict or confusion between id and emailid we use find-by-email/{emailId}
	//agar normal emailid likhege toh postman confuse hoyega id hai yaa email id
	//isliye find-by-email use karo
	
	@GetMapping("find-by-email/{emailId}")
	public ResponseEntity<UserDto>  getUserByEmailId(@PathVariable String emailId)
	{
		//UserDto userDto = userService.getUserByEmailId(emailId);
		return new ResponseEntity<UserDto>(userService.
			getUserByEmailId(emailId),HttpStatus.FOUND);

	}
	
	
	//Request Parameter
	@GetMapping("find-by-first-name")
	public ResponseEntity<List<UserDto>> findByFirstName(@RequestParam String fname)
	{
		List<UserDto> allUsers = userService.getUserByFirstName(fname);
		
		return new ResponseEntity<List<UserDto>>(allUsers,HttpStatus.OK);
		
	}

}
