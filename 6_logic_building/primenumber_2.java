import java.util.Scanner;
class primenumber_2
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			int total=0;
			
			for(int n=1;n<=100;n++)
			{	
				
				int count=0;
				for(int i=1;i<=n;i++)
				{	
					if(n%i==0)
					{
					
					count++;
					}
				}
		
				if(count==2)
				{
					System.out.println(n+ " is Prime");
					total++;
				}
				
			}	
					System.out.println("Total Count: "+total);
		}
} 