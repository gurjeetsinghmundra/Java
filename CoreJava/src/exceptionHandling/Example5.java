package exceptionHandling;

import java.util.InputMismatchException;
public class Example5 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(5/0);
		}
		
		catch(InputMismatchException e)//wrong exception written purposely                        
		{
			System.out.println("Exception Handled");
		}
		
		finally //finally will get executed always(Whether exception is handled or not)
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Code After Exception");
		
		
	}
	
}
