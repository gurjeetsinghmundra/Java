package learnCollection_2;

import java.util.TreeSet;

public class SetExample5 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		
		treeSet.add(20);
		treeSet.add(90);
		treeSet.add(20);
		treeSet.add(1);
		treeSet.add(60);
		treeSet.add(101);
		treeSet.add(4);
		
		System.out.println(treeSet);
		
		System.out.println(treeSet.higher(20));// will search value bigger than 20
		System.out.println(treeSet.lower(5));
		System.out.println(treeSet.higher(110));
		
		System.out.println("-------------------------------------------------");
		System.out.println(treeSet.ceiling(20));// will search for 20 and if it is not avail it will give higher value
		System.out.println(treeSet.ceiling(21));
		System.out.println(treeSet.floor(96));
		
		System.out.println("-------------------------------------------------");
		System.out.println(treeSet.headSet(90));//90 ke aage ke saare elements(90 excluded)
		System.out.println(treeSet.headSet(90, true));//90 will be included
		
		System.out.println("-------------------------------------------------");
		//ulta
		System.out.println(treeSet.tailSet(60));//60 ke peeche ke saare elements(60 included)
		System.out.println(treeSet.tailSet(60, false));//60 will be excluded
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(treeSet.subSet(20, 90));
		System.out.println(treeSet.subSet(20,false, 90,true));
		
		
	}

}
