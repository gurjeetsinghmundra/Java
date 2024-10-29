package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamExample8 {

	// reduce will convert into one thing
	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(12,5,6,7);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
		Optional<Integer> reduce2 = numbers.stream().reduce((a,b)->a*b);
		System.out.println(reduce2);
		
	//	Integer integer=reduce.get();
	//	System.out.println(integer);
		
		Integer i=reduce.orElseThrow(()->new RuntimeException("List is Empty"));
		System.out.println(i);
}
}