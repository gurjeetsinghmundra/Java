package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		

		List<String> names = Arrays.asList("Pooja","Amit","Joel","Sanika","Gurjeet","Hamza");
		
		names.stream().forEach((name)->{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name);
			}
			System.out.println("--------------------------------------");
		});
	}
}
