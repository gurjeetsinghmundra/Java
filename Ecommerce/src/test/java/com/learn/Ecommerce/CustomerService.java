package com.learn.Ecommerce;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	
	public Customer getCustomer(int id,String name)
	{
		if(id==0)
		{
			return null;
		}
		else
		{
			return new Customer(id,name);
		}
	}

}
