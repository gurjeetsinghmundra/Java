package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  list=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println("------------------------------------------");
		
		//Object of Stream
		Stream<Integer> stream = list.stream(); //ctrl+1 to assign variable directly
		
		//ForEach Map Filter Reduce
		//Methods of Stream
		
		
		Consumer<Integer> c=(i)->System.out.println(i);
		stream.forEach(c);
		
		System.out.println("------------------------------------------");
		
		List<String> names = Arrays.asList("Pooja","Amit","Joel","Sanika","Gurjeet","Hamza");
		
		Stream<String> namesStream = names.stream();
		
		//Consumer<String> c1=(i)->System.out.println(i.charAt(1));
		
		Consumer<String> c1=(i)->System.out.println(i+" = "+i.length());
		namesStream.forEach(c1);
		
	}

}
