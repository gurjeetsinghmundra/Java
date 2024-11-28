package com.learn.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Product;

//Repository is for database									  //id
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	//JPA Query Methods
	
	// products/search in postman to get all links
	// /search/findByProductPriceLessThanEqual?price=50000
	
	//mutiple products matlab list of products
	
	List<Product> findByProductPriceLessThan(int price);
	
	List<Product> findByProductPriceGreaterThan(int price);
	
	List<Product> findByProductPriceGreaterThanEqual(int price);
	
	List<Product> findByProductPriceLessThanEqual(int price);
	
	// search/findByProductPriceBetween?startPrice=40000&endPrice=80000
	
	List<Product> findByProductPriceBetween(int startPrice,int endPrice); //between ke liye 2
	
}

				