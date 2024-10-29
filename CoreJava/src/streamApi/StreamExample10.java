package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample10 {
	
	public static void main(String[] args) {
		
	//	List<Integer> numbers = Arrays.asList();
	// we cant use 	Arrays.asList bcoz it doesnt have add method so we cant use loop with it
		 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++)
		{
			list.add(i);
		}
		
		//Parallel stream means multiple pipelines(stream is a single pipeline)
		//parallel stream will work faster than stream
		//stream findany will always give first value but parallelstream findany method we give random value
		//for ex if there is only one ticket counter everyone will get ticket slow
		//but if multiple ticket counter are there then work will be done faster
		
		System.out.println(list);
		Optional<Integer> any = list.parallelStream().findAny();
		System.out.println(any);
		
		list.parallelStream().forEach(n->System.out.println(n));
		
		System.out.println("---------------------------------------");
		
		//anyMatch (atleast one element of given condition should be there)
		//allMatch(all elements should be there);
		//noneMatch(no elements of given condition should be there)
		
		boolean evenMatch = list.stream().anyMatch(n->n%2==0);
		System.out.println(evenMatch);
		
		System.out.println("---------------------------------------");
		
		boolean bigMatch = list.stream().anyMatch(n->n>1000);
		System.out.println(bigMatch);
		
		System.out.println("---------------------------------------");

		boolean evenMatch2 = list.stream().allMatch(n->n%2==0);
		System.out.println(evenMatch2);
		
		System.out.println("---------------------------------------");
		
		boolean lessMatch = list.stream().allMatch(n->n<=100);
		System.out.println(lessMatch);
		
		System.out.println("---------------------------------------");

		boolean noneMatch = list.stream().noneMatch(n->n>100);
		System.out.println(noneMatch);
		
		
	}

}
