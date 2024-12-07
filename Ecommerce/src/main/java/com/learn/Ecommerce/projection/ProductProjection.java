package com.learn.Ecommerce.projection;

import org.springframework.beans.factory.annotation.Value;
//@RepositoryRestResource(excerptProjection = ProductProjection.class )  this need to be done productrespo

public interface ProductProjection {
	
	String getProductName();
	
	@Value("#{target.category?.categoryName}")
	String getCategory();

	
	//postman pe iski wajah se joh dikhana hai wohi dikhega
	
	//bus productname dikhega and price and all nhi
	

}
