package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Product;

//Repository is for database									  //id
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
