package genericAndFunctionalInterfaces;

import java.util.function.Predicate;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> isEven=new Predicate<Integer>()
		{

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
			
		};
		
		boolean ans=isEven.test(5);
		//ctrl +1 
		
		System.out.println(ans);
	}

}
