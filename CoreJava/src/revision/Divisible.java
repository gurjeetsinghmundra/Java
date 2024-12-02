package revision;

import java.util.ArrayList;

public class Divisible {
	
	//jiske last me 5 hai woh count hone chahiye
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(101);
		arr.add(105);
		arr.add(103);
		arr.add(225);
		arr.add(1100);
		arr.add(5);
		
		int sum=0;
		int count=0;
		
		for(int i:arr)
		{
			int d=i;
			
			while(d<10)
			{
				int rem=d%10;
			}
			
			if(d==5)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
