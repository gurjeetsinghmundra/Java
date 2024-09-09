import java.util.Scanner;
class positive_no
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		int n=0;
		int count=0;
		
		while(n>=0)
		{
		 n=sc.nextInt();
		 count++;	
		}
		count--;
		System.out.println("Total Inputs: "+count); //+(count-1) can also be written
	}
}