import java.util.Scanner;
class nested_ifelse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%3==0)
		{
			System.out.println(n+" is multiple of 3");
			if(n%2==0)
			{
					System.out.println(n+" is even");
					
			}
			else
			{
					System.out.println(n+" is odd");
			}
		}
		else
		{
			System.out.println(n+" is not multiple of 3");
		}
	
	}
}