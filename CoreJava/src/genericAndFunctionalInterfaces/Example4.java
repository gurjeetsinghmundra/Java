package genericAndFunctionalInterfaces;

import java.util.function.Consumer;

public class Example4 {
	
	public static void main(String[] args) {
		
		Consumer<Integer> square=new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println(i*i);
			}
		};
		
		square.accept(10);
		
	}

}
