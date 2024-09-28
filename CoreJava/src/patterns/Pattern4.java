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
				
		
	}
}
