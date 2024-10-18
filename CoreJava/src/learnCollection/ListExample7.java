package learnCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample7 {

	public static void main(String[] args) {
		
		List<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",2000));
		
		Collections.sort(products);
		
		System.out.println(products);
	}
}
