package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
