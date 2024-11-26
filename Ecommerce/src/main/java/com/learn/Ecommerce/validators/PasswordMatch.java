package com.learn.Ecommerce.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

//to make interface annotation we add @
@Documented   //it is for registration purpose (it is added in jvm library)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //(for runtime)
@Constraint(validatedBy = PasswordValidator.class)    //this means rule
public @interface PasswordMatch {
	
	//this 3 lines below are copied from not null open declaration
	
	String message() default "Password and confirm password is not same";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
