package learnCollection_2;

import java.util.HashMap;
import java.util.Set;

//hashmap is unordered

public class MapExample1 {
	
	public static void main(String[] args) {
												 //Key , Value
	HashMap<Integer, String> students=new HashMap<Integer,String>();
	
	students.put(101,"Pooja");
	students.put(102,"Amit");
	students.put(103,"Joel");
	students.put(null, null); //only one null key value is allowed
	students.put(101,"Netrali");
	students.put(null, null);//override
	
	//keys are unique, values can be repeated(duplicate)
	
	System.out.println(students);
	
	System.out.println(students.get(101));
									//invalid key 	//default value						
	System.out.println(students.getOrDefault(1011 ,  "Hello"));
	
	System.out.println("--------------------------------------------------");
	
	
	System.out.println(students.remove(101));
	System.out.println(students);
		
	System.out.println("--------------------------------------------------");
	
	System.out.println(students.keySet()); //shows key
	System.out.println(students.values()); //shows values
	
	System.out.println("--------------------------------------------------");
	
	Set<Integer> keys=students.keySet();
	
	for(Integer k:keys)
	{
		System.out.println(k+" "+students.get(k));
	}
	
	System.out.println("--------------------------------------------------");
	
	System.out.println(students.containsKey(102));
	System.out.println(students.containsValue(103));

	}

}
