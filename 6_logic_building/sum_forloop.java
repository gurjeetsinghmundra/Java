import java.util.Scanner;
class sum_forloop
{
		public static void main(String args[])
		{
			int sum=0;
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				sum=i+sum;
			}
			System.out.print(sum);
		}
}