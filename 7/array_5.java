import java.util.Scanner;
class array_5
{
	
	public static void main(String args[])
	{
		int numbers[]={101,5,7,12,90,56,1001};
		
		
		int smallest=numbers[0];
		int biggest=numbers[0];
		
		for(int n:numbers)
		{
				if(smallest>n)
					smallest=n;
			
				if(biggest<n)
					biggest=n;
			
			
		}
		
		
		System.out.println(smallest);
		System.out.println(Biggest);
		
		
		
	}

}