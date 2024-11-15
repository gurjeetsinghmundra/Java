package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	

}
