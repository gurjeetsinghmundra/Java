package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				System.out.print(j);
			}
			System.out.println();
		}
			
System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				if(i%2==0)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
			
System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				if(i%2==0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}	

System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
		
	System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//main logic j<=i (i ki value jitni utne * print honge)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}		
				
			}
			System.out.println();
		}		
		
System.out.println("====================================================");	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||j==1||i==5||j==5||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}			
		
	}
}
