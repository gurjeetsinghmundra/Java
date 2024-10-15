package learnCollection;

import java.util.ArrayList;

public class ListExample3 {

	public static void main(String[] args) {
		
		
		ArrayList<Product> products=new ArrayList<Product>();
		
		Product p1=new Product(101,"Laptop",50000);
		
		products.add(p1);
		products.add(new Product(102,"Mobile",35000));//shortcut
		products.add(new Product(103,"Headphones",2000));
		
		
		System.out.println(products);
		
		for(Product i:products)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for(Product i:products)
		{
			if(i.getPrice()>20000)//bcoz price is a private variable we need getter to access it
			{
			System.out.println(i);
			}
		}
		
		
	System.out.println("--------------------------");
		
		for(Product i:products)
		{
			if(i.getName().startsWith("M"))
			{
			System.out.println(i);
			}
		}
	}
}
