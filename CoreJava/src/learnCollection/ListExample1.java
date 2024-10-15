package learnCollection;

import java.util.ArrayList;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList<>();
		
		list.add(48);
		list.add("G");
		list.add(25.68);
		list.add(null);
		
		System.out.println(list);
		
		for(Object i:list) //object ke andhar sab hai (by default object class)
		{
			System.out.println(i);
		}
		
	}
}
