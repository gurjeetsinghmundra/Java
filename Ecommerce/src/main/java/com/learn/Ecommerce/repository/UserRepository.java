package com.learn.Ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.User;

//repo gives json data
//Repository is for database								//id
public interface UserRepository extends JpaRepository<User, String> {
	
	
	Optional<User> findByEmailId(String email);  //Optional:-emailId is unique(it will return only one unique value)
	
	List<User> findByFirstName(String firstName);//List:-list will return multiple values
	
	List<User> findByLastName(String lastName);
	
	List<User> findByFirstNameStartingWith(String Name);
	
}