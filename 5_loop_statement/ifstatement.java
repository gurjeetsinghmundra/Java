import java.util.Scanner;
class ifstatement
{
	public static void main(String args[])
	{
		if(false || true)
		{
			System.out.println("If block");
		}
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//-6
		
		if(n>0)//-6>0
		{
				System.out.println("You have entered positive value");
		}
		
		
	// If statement will execute only if the condition is true ; or else it will not execute	
		
	}
}