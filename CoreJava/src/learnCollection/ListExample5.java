package learnCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;


public class ListExample5 {
	
	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		
		names.add("Gurjeet");
		names.add("Amit");
		names.add("Shriya");
		names.add("Netrali");
		names.add("Rayyan");
		
		System.out.println(names);
		
		System.out.println("====================================");
		
		Predicate<String> removing=(n)->n.startsWith("A");
		
		names.removeIf(removing);
		
		System.out.println(names);
		
		System.out.println("====================================");
		System.out.println("====================================");
		
		
		
		LinkedList<Product> products=new LinkedList<Product>();
		
		Product p1=new Product(101,"Laptop",50000);
		
		products.add(p1);
		products.add(new Product(102,"Mobile",35000));//shortcut
		products.add(new Product(103,"Headphones",2000));
		
		System.out.println(products);
		
		products.removeIf((p)->p.getPrice()<10000);// practice it
		
		System.out.println(products);
		
		System.out.println("====================================");
		
		
	}

}
