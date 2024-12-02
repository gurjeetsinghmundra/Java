package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	//Runtime
	//Each and every exception in java is a class

	public static void main(String[] args) {
		
		System.out.println("Code Before Division");
		
		try { //catch block will only execute if there is an exception in try block
			System.out.println(5/0);
			} 
		
		catch (ArithmeticException e) {
			System.out.println("You Cannot Divide Number By Zero:- "+e);
		}
		
		System.out.println("Code After Division");
		
		
		System.out.println("-------------------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		String a=null;
		
		
		try {
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Variable Has Null Value:- "+e);
		}
		
		System.out.println("Code After Exception");
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Enter Number: ");
	
		try {
			int b=sc.nextInt();
			System.out.println(b);
			
		} catch (InputMismatchException e) {
			System.out.println("Only Integer Value:- "+e);
		}
		
		System.out.println("Code After Exception");
		
		System.out.println("-------------------------------------------------");

		//when we need to handle multiple exception we can just write exception in catch block
		//one try can has multiple catch blocks
		//when one statement has multiple exception then we can use multiple catch block
		try {
			int c=sc.nextInt();
			int d=sc.nextInt();
			System.out.println(c/d);		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Code After Exception");

		
	}
}
