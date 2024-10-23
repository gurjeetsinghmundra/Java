package learnCollection_2;

import java.util.PriorityQueue;
//insertion order is not maintained
//the first value is always the smallest in PriorityQueue

public class QueueExample1 {

	public static void main(String[] args) {
		
		System.err.println("Hello");
		
		///Queue (PriorityQueue)
		
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>((i1,i2)->i2-i1);//to keep first value largest
		
		for(int i=1;i<=20;i++)
		{
			numbers.add(i);	
		}
		
		System.out.println(numbers);
		System.out.println("------------------------------------------");
		
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
	}
}
