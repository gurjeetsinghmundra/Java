package com.learn.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Ecommerce.entity.Product;
//import com.learn.Ecommerce.projection.ProductProjection;


//@RepositoryRestResource(excerptProjection = ProductProjection.class ) //projection banaya hai woh batane ke liye


//Repository is for database									  //id
@CrossOrigin  //for using Api(CrossOrigin Enable it)
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	//JPA Query Methods
	
	// products/search in postman to get all links
	// /search/findByProductPriceLessThanEqual?price=50000
	
	//multiple products matlab list of products
	
	List<Product> findByProductPriceLessThan(int price);
	
	List<Product> findByProductPriceGreaterThan(int price);
	
	List<Product> findByProductPriceGreaterThanEqual(int price);
	
	List<Product> findByProductPriceLessThanEqual(int price);
	
	// search/findByProductPriceBetween?startPrice=40000&endPrice=80000
	
	List<Product> findByProductPriceBetween(int startPrice,int endPrice); //between ke liye 2
	
	
	//Visual Studio Part
	//Low to High	
	List<Product> findByOrderByProductPriceAsc();
	
	//High to low
	List<Product> findByOrderByProductPriceDesc();
	
	//	A-z
	List<Product> findByOrderByProductNameAsc();
	
	//
	List<Product> findByOrderByProductNameDesc();

	
}

				