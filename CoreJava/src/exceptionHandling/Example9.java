package exceptionHandling;

import java.io.FileNotFoundException;

public class Example9 {
	
	public static void checkAge(int age) {
		
		if(age<18)
		{
			throw new InvalidAgeException("Age Invalid");
		}
		else
		{
			System.out.println("Registration Successfull !!");
		}
		
	}
	

	public static void main(String[] args) {
		
		checkAge(11);
	}
}
