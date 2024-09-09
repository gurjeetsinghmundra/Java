import java.util.Scanner;
class positive_no
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		int n=0;
		int i=0;
		
		while(n>=0)
		{
		 n=sc.nextInt();
		 i++;	
		}
		System.out.println("Total Inputs: "+i);
	}
}