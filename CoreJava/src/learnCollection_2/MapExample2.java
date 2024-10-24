package learnCollection_2;

import java.util.LinkedHashMap;
import java.util.Scanner;

//In linkedHashmap Insertion order is maintained(but not in asc or desc order)
//first value will be stored first

public class MapExample2 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,String> phoneNumbers=new LinkedHashMap<String,String>();
		
		
		phoneNumbers.put("Guru", "8938399823");
		phoneNumbers.put("Amit", "7685791865");
		phoneNumbers.put("Shriya","8692050891");
		
		System.out.println(phoneNumbers);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		
		String name=sc.next();
		
		if(phoneNumbers.containsKey(name))
		{
			System.out.println("Your Phone Number Is Already Registered: "+phoneNumbers.get(name));
			System.out.println("Do You Want To Change It??(Y/N)");
			
			char decision=sc.next().charAt(0);
			
			if(decision=='y' || decision=='Y' )
			{
				System.out.println("Enter Phone Number: ");
				String newPhoneNo=sc.next();
				phoneNumbers.put(name, newPhoneNo);
				System.out.println("New Number Registered!!");
			}
			
		}
		
		else
		{
			System.out.println("Enter Phone Number: ");
			String phoneNo=sc.next();
			phoneNumbers.put(name, phoneNo);
			System.out.println("Successfully Registered!!");
		}
		
		
		System.out.println(phoneNumbers);
	
		
	}

}
