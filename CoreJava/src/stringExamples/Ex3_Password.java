package stringExamples;

import java.util.Scanner;

public class Ex3_Password {
	
	public static void main(String[] args) {
		
		
		String password="X#123";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Password");
		String userpass=sc.nextLine();
		
		sc.close();//to remove warning
		
		
		//if(userpass.equals(password)==0)
		if(userpass.equals(password))
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Wrong Password");
		}
	}

}
