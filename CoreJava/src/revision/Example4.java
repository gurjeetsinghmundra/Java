package revision;

import java.util.function.Predicate;

public class Example4 {
	
	public static void main(String[] args) {
		Predicate<Integer> p1=new Predicate<Integer>()
		{
			public boolean test(Integer n)
			{
				return n%7==0;
			}
			
		};
		
		boolean ans=p1.test(10);
		System.out.println(ans);
		
		Predicate<Integer> p2=(n)->n%7==0;
		
		boolean ans2=p2.test(70);
		
		System.out.println(ans2);
	}

}
