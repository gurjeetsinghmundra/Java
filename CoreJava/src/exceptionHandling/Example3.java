package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Example3 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		System.out.println("Divison is :"+a/b);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You Cannot Divide Number By 0");
		}
		
		System.out.println("Code After Exception");
	}

}
