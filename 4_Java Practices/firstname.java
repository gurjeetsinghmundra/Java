import java.util.Scanner;
class firstname
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//next(for 1 word) nextLine()(for multiple lines)
	
		System.out.println("Enter First Name");
		String firstName=sc.next();
		
		
		System.out.println("My Name is: "+firstName);
	}
}