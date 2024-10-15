package learnCollection;

import java.util.ArrayList;

public class ListExample2 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list=new ArrayList<Integer>();
		
		list.add(40);
		list.add(10);
		list.add(16);
		list.add(9);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}

}
