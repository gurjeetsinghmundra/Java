package learnCollection;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample4 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(12);
		list.add(15);
		list.add(20);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		
		System.out.println("------------------------------------");
			   //(index,value)
		list.add(0,100);
		//add shift the values 
		// it will not replace any value will only add new value and will shift the old value
		list.add(1,11);
		
		
		System.out.println(list);
		
		System.out.println("------------------------------------");
		
		Integer i=list.get(1);
		//get index me joh value hai woh dikhayega
		System.out.println(i);
		
		System.out.println("------------------------------------");
		
		//set will replace ,will not shift the values
		list.set(1,200);
		System.out.println(list);
		
		System.out.println("------------------------------------");
		
		Predicate<Integer> even=(num)->num%2==0; //for beginners
		list.removeIf(even);
		System.out.println(list);
		
		//list.removeIf((num)->num%2==0); //for experts
		
		System.out.println("------------------------------------");
		
		
		
	}

}
