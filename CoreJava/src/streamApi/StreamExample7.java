package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import learnCollection.Product;

public class StreamExample7 {

	public static void main(String[] args) {
		
		//map :- action should be performed on each and every object. eg:-length,20% discount
		//filter :- 
		
		
		List<Integer> numbers = Arrays.asList(12,5,6,7);
		Function<Integer, Integer> squareFunction=(n)->n*n;
		
	
		// numbers.stream().map(n->n*n).forEach(n->System.out.println(n));
		
		List<Integer> squares = numbers.stream().map(squareFunction).collect(Collectors.toList());
		
		System.out.println(squares);
		
		
		System.out.println("-----------------------------------");
		Function<Integer, Integer> multiBy10Function=(n)->n*10;
		
		List<Integer> multiBy10 = numbers.stream()
				.map(multiBy10Function)
				.collect(Collectors.toList());
		
		System.out.println(multiBy10);
		
		System.out.println("-----------------------------------");
		
		List<String> names = Arrays.asList("Nisha","Manisha","Nikita","Ankita");
		Function<String, Integer> returnLength=(n)->n.length();
		
		List<Integer> collect = names.stream()
		.map(returnLength)
		.collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("-----------------------------------");
		
		List<Product>  products=new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",30000));
		products.add(new Product(103,"Headphones",2000));
		
		Function<Product , String> returnNames=(n)->n.getName();
		
		List<String> collect2 = products.stream().map(returnNames)
		.collect(Collectors.toList());
		
		System.out.println(collect2);
		
	}
	
}
