import java.util.Scanner;
class elseifLadder
{
	public static void main(String args[])
	{
	 System.out.println("1:Marathi 2:Hindi 3:English");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 
	 
	if(n==1)
	{
		System.out.println("Marathi Language Selected");
	}
	else if(n==2)
	{
		System.out.println("Hindi Language Selected");
	}
	else if(n==3)
	{
		System.out.println("English Language Selected");
	}
	else
	{
		System.out.println("Invalid Number");
	}
	
	}
}