import java.util.Scanner;
class fact_loop
{
	public static void main(String args[])
		{
			int fact=1;
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				fact=i*fact;
			}
			System.out.print(fact);
		}
	
	
}
