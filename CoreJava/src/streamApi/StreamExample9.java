package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample9 {

	public static void main(String[] args) {
		
		//List<Integer> numbers = Arrays.asList(12,45,3,4,9);
		List<Integer> numbers = new ArrayList<Integer>();
		
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first);
		//Optional is use to avoid exception
		//our list can be empty if we apply filter and condition doesnt match
		//so to avoid exception we get Optional.empty
		
		
		Integer i = first.orElseThrow(()->new ArithmeticException("List is Empty"));
		System.out.println(i);
	}
}
