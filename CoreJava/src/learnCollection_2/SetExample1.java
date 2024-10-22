package learnCollection_2;

//hashset will shuffle the data and will add them randomly
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExample1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(12);
		set.add(67);
		set.add(45);
		set.add(67);
		set.add(null);
		
	//will not take duplicates value and will insert element randomly
	//
	//hashset will not maintain insertion order,and will take unique values and also null values is allowed
		
		
	System.out.println(set);
	
	System.out.println("===============================================");
	
	List<Integer> list= Arrays.asList(12,67,67,89,90,90);
	System.out.println(list);
	
	HashSet<Integer> hashSet=new HashSet<Integer>(list);
	
	System.out.println(hashSet);
		
	}

}
