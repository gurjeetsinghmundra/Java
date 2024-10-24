package learnCollection_2;

import java.util.TreeMap;

import learnCollection.Product;

//treemap sort values in ascending order

public class MapExample3 {

	public static void main(String[] args) {
		
		TreeMap<Integer, Product>  products=new TreeMap<Integer, Product>((i1,i2)->i2-i1);
		
		products.put(101,new Product(101,"Laptop",50000));
		products.put(102,new Product(102,"Mobile",35000));
		products.put(103,new Product(103,"Headphones",2000));
		
		System.out.println(products);
		
		Product laptop=products.get(101);
		System.out.println(laptop.getPrice());
		
		
	}
}
