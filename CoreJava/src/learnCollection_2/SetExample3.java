package learnCollection_2;

import java.util.Iterator;
import java.util.LinkedHashSet;

//if insertion order is imp to maintain then use linkedhashset
//duplicate values will be removed
//it will add order wise(hashset stores randomly)
//it will not arrange in ascending order but will add one by one

public class SetExample3 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(90);
		set.add(11);
		set.add(11);//duplicate value will not be taken
		set.add(15);
		
		System.out.println(set.size());
		
		System.out.println("--------------------------------------");
		
		Iterator<Integer> iterator=set.iterator();
		
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
			
		}
		
		System.out.println("--------------------------------------");
		System.out.println(set.isEmpty());
		
		
	}

}
