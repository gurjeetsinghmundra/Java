package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamExample5 {

	public static void main(String[] args) {
		
		
			List<Integer> numbers=Arrays.asList(12,54,86,43,75,24,65,13);
			
			numbers.stream().filter(n->n>20)
			.forEach(n->System.out.println(n));
			
			System.out.println("---------------------------");
			
			//Collector<Object, ?, List<Object>> list = Collectors.toList();
			List<Integer> greaterThan20 = numbers.stream().filter(n->n>20).collect(Collectors.toList());
			
			System.out.println(greaterThan20);
			
			System.out.println("---------------------------");
			
			
			List<String> names = Arrays.asList("Nisha","Manisha","Nikita","Ankita");
			
		//	names.stream().filter(n->n.startsWith("N")).forEach(n->System.out.println(n));
			
			
			List<String> namesStartsWithN = names.stream().filter(n->n.startsWith("N")).collect(Collectors.toList());
			
			System.out.println(namesStartsWithN);
	}
}
