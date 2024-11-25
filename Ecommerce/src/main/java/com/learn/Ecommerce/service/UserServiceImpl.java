package com.learn.Ecommerce.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

@Service  //to make class bin and apply business logic
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
		List<User> listOfUsers = userRepository.findAll();
		
		
		List<UserDto> userDtoList = listOfUsers.stream()
				.map(u->entityToDto(u))
				.collect(Collectors.toList());
		
		return userDtoList;
	}

	@Override
	public UserDto getUserById(String id) {
	
		User user= userRepository.findById(id).
		orElseThrow(()->new RuntimeException(id+" not found")); //if id is invalid
		
		return entityToDto(user);
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {

		User user = userRepository.findById(id).
		orElseThrow(()->new RuntimeException
		(id+" not found")); 
		
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmailId(userDto.getEmailId());
		user.setAge(userDto.getAge());
		user.setPassword(userDto.getPassword());
		
 //to make changes in database (if this step is skipped no changes will happen in database)
		User updateUser = userRepository.save(user); 
		
		return entityToDto(updateUser);
	}

	@Override
	public String deleteUser(String id) {
//we write lambda for functional interface only, hence orElseThrow is a functional interface
			
		User user = userRepository.
		findById(id).orElseThrow(()->new RuntimeException(id+" not found"));
			 
		userRepository.delete(user);
			 
		return user.getId()+" Deleted Successfully!";
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
