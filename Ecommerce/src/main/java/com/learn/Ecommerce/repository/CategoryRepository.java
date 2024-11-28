package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Category;

//we need a interface to extend jpa

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
