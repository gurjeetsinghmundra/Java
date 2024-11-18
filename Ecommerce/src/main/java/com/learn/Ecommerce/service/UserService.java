package com.learn.Ecommerce.service;

import java.util.List;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;

public interface UserService {
	
	//To add User
	UserDto addUser(UserDto userDto);
	
	//To Fetch all users
	List<UserDto> getAllUsers();
	
	//To Fetch user by Id
	UserDto	getUserById(String id);
	
	//Update User By Id
	UserDto updateUser(String id,UserDto userDto);
	
	//Delete User By Id
	String deleteUser(String id);
	//String returntype is used because the method will return  void
	//and instead of void we can display mssg "id deleted successfully"
	
//===================================================================
	
	//Entity to Dto Conversion
	UserDto entityToDto(User user);
	
	//Dto to Entity Conversion
	User dtoToEntity(UserDto userDto);
	
	
	
}
