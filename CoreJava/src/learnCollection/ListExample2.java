package learnCollection;

import java.util.ArrayList;

public class ListExample2 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list=new ArrayList<Integer>();
		
		list.add(40);//0
		list.add(10);//1
		list.add(16);//2
		list.add(9);//3
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		System.out.println(list.size());
		
		System.out.println("------------------------------------");
		list.remove(1);
		System.out.println(list);
		
		System.out.println("------------------------------------");
		list.remove(list.size()-1);
		System.out.println(list);
		
		
		System.out.println("------------------------------------");
		ArrayList <Integer> list2=new ArrayList<Integer>();
		list2.add(21);//0
		list2.add(44);//1
		list2.add(14);//2
		
		list.addAll(list2);// transfer all elements into another arraylist
		
		System.out.println(list);
		
		System.out.println("------------------------------------");
		
		list.removeAll(list2);
		System.out.println(list);
		
		System.out.println("------------------------------------");
		list.clear();
		System.out.println(list);
		
	}

}
