package learnCollection_2;

import java.util.HashMap;

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
	
	//keys are unique, values can be repeated
	
	System.out.println(students);
	
	System.out.println(students.get(101));
		
	}

}
