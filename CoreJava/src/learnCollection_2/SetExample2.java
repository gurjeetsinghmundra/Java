package learnCollection_2;

import java.util.HashSet;
import java.util.Scanner;

public class SetExample2 {
	
	public static void main(String[] args) {
		
		HashSet<String> colors=new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=1;i<=5;i++)
		{
			String color=sc.next();
			colors.add(color.toLowerCase());
		}
		
		System.out.println(colors);
		colors.clear();
		System.out.println(colors);
		
	}

}
