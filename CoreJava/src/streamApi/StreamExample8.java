package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample8 {

	// reduce will convert into one thing
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,5,6,7);
		
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		
		System.out.println(reduce);
}
}