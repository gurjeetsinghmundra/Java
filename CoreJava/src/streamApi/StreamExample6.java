package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import learnCollection.Product;

public class StreamExample6 {
	
	public static void main(String[] args) {
		
		List<Product>  products=new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",30000));
		products.add(new Product(103,"Headphones",2000));
		
		
		List<Product> priceGreater = products.stream()
		.filter(n->n.getPrice()>10000)
		.collect(Collectors.toList());
		
		System.out.println(priceGreater);
	
		
	}

}
