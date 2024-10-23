package learnCollection_2;

import java.util.LinkedList;

public class QueueExample3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.addLast(50); //same as add method (not of use)
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		list.addFirst(20);
		list.addLast(99);
		list.add(11);
		list.add(12);
		
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println("-------------------------------------------");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}
}
