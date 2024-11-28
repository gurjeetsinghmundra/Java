package com.learn.Ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.User;

//Repository is for database								//id
public interface UserRepository extends JpaRepository<User, String> {
	
	
	Optional<User> findByEmailId(String email);
	
	List<User> findByFirstName(String firstName);
	
	List<User> findByLastName(String lastName);
	
	List<User> findByFirstNameStartingWith(String Name);
	
}