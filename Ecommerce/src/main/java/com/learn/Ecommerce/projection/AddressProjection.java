package com.learn.Ecommerce.projection;

public interface AddressProjection {
	
	String getCity();
	String getState();
	
	default String getAddress() 
	{
		return getCity()+" , "+getState();
	}

}
