package learnCollection_2;

import java.util.TreeSet;

import learnCollection.Product;

public class SetExample6 {
	
	public static void main(String[] args) {
		
		TreeSet<Product> products=new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",30000));
		products.add(new Product(103,"Headphones",2000));
		
		System.out.println(products);
		
	}

}
