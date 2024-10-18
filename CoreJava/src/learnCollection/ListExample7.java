package learnCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample7 {

	public static void main(String[] args) {
		
		List<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",2000));
		
		Comparator<Product> idComparator=(p1,p2)->p1.getId()-p2.getId();	//Asc
		//Comparator<Product> idComparator=(p1,p2)->p1.getId()-p2.getId();	//Desc
		
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());	
		
		Comparator<Product> priceComparator=(p1,p2)->p1.getPrice()-p2.getPrice();
		
		Collections.sort(products,idComparator);
		System.out.println(products);
		
		
		Collections.sort(products,nameComparator);
		System.out.println(products);
		
		Collections.sort(products,priceComparator);
		System.out.println(products);
		
		
	}
}
