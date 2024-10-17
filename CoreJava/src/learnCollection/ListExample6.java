package learnCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample6 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,54,46,79,45,0,1);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);//will sort in asc order
		System.out.println(numbers);
		
		
		System.out.println("Smallest Element: "+numbers.get(0));//smallest value after sorting
		
		System.out.println("Largest Element: "+
		numbers.get(numbers.size()-1));//largest value after sorting
	}
}
