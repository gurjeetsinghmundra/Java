package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Category;

//we need a interface to extend jpa


// plural for category is categories
@RepositoryRestResource(path = "category") //this is used to change the path
//before this annotation :- localhost:8080/categories
//after :- localhost:8080/category
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
