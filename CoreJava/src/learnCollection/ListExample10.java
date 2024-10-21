package learnCollection;

import java.util.Scanner;
import java.util.Stack;

public class ListExample10 {
	
	public static void main(String[] args) {
		
		Stack<Product> products=new Stack<Product>();
		
		products.push(new Product(101,"Laptop",50000));
		products.push(new Product(102,"Mobile",35000));
		products.push(new Product(103,"Headphones",2000));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do You Want To Remove Last Added Product?(Y/N)");
		System.out.println(products.peek());
		
		char decision=sc.next().charAt(0);
		
		if(decision=='Y' || decision=='y')
		{
			
		System.out.println(products.pop().getName()+" Is Removed");
		
		System.out.print("Items In Cart "+products); //solve
		
		}
		else
		{
			System.out.println("Not Removed");
		}
				
		
		
	}

}
