package com.learn.Ecommerce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDto addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		//UUID generates random and unique id(third party application)
		UUID randomUUID = UUID.randomUUID();
		String id = randomUUID.toString();
		
		userDto.setId(id);
		// String id = UUID.randomUUID().toString(); (shortcut)
		
		User user = dtoToEntity(userDto); //ctrl+1
		User savedUser = userRepository.save(user); //jpaRespo

		//data is return in entity form but we cant show out entity that's why we return dto
		
		UserDto savedDto = entityToDto(savedUser);
		
		return savedDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto entityToDto(User user) {
		UserDto userDto= new UserDto();
		
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setEmailId(user.getEmailId());
		userDto.setPassword(user.getPassword());
		userDto.setAge(user.getAge());
		// TODO Auto-generated method stub
		return userDto;
	}

	@Override
	public User dtoToEntity(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User user=new User();
		
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmailId(userDto.getEmailId());
		user.setPassword(userDto.getPassword());
		user.setAge(userDto.getAge());
		
		return user;
	}
	
	

}
