import java.util.Scanner;
class primenumber
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count=0;
			
			for(int i=1;i<=n;i++)
			{	
				if(n%i==0)
				{
					System.out.println(i+" ");
					count++;
				}
			}
			
			System.out.println("Count: "+count);
			
			if(count==2)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is Not Prime");
			}
		}
}