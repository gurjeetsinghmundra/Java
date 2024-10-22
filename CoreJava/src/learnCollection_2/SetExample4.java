package learnCollection_2;

import java.util.Comparator;
import java.util.TreeSet;

//hashset linkedhashset treeset Teeno kaa kaam uniqueness provide karna
//null values are not allowed(bcoz null values cant be compared)
//if  we want to set values in ascending order  then we use treeset
public class SetExample4 {
	
	public static void main(String[] args) {
		
		//SortedSet     NavigableSet
		
		Comparator<Integer> c=(o1,o2)->o2-o1;
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>(c);
		//TreeSet<Integer> treeSet=new TreeSet<Integer>((o1,o2)->o2-o1);
		
		//we open declaration for comparator
		//it takes 2 parameters(argument) o1,o2 
		//so to set descending we write o2-o1;
		
		treeSet.add(20);
		treeSet.add(90);
		treeSet.add(20);
		treeSet.add(1);
		treeSet.add(5);
	  //treeSet.add(null);       Null Values are not allowed
		
		System.out.println(treeSet);
		
	}

}
