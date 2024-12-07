package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Address;
import com.learn.Ecommerce.projection.AddressProjection;

@RepositoryRestResource(excerptProjection = AddressProjection.class)
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
