package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int k=1;k<=n;k++)
		{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||j==2||i==2||i==n||j==n||i==n-1||j==n-1)//logic for printing * in border
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
			System.out.println();
		}
	}
}
