package com.learn.Ecommerce.validators;

import com.learn.Ecommerce.Dto.UserDto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordMatch, UserDto> {

	
	//click on error to add this 
	@Override
	public boolean isValid(UserDto value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
