import java.util.Scanner;
class subscribe_project
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean subscribed=false;
		
		System.out.print("Do You Want To Subscribe?? (y/n)");
		char decision=sc.next().charAt(0);
		
		if(decision=='y' || decision=='Y')
		{
				subscribed=true;
		}
		
		System.out.println("Subscribed:"+subscribed);
		
		if(subscribed)
		{
			System.out.println("You Are Subscribed");
		}
		else
		{
			System.out.println("You Are Not Subscribed");
		}
	}
}