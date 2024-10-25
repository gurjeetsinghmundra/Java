package streamApi;

import java.util.ArrayList;

import learnCollection.Product;

public class StreamExample3 {

	
	public static void main(String[] args) {
		
		ArrayList<Product>  products=new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",30000));
		products.add(new Product(103,"Headphones",2000));
		
		products.stream().forEach((p)->{
		System.out.println(p.getName()+" Discounted Price: "+(p.getPrice()-p.getPrice()*0.2));
		
		System.out.println("Total Discount On "+p.getName()+" = "+p.getPrice()*0.2);
		System.out.println();
		});
		

	}
}
