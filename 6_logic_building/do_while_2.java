import java.util.Scanner;
class do_while_2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		char decision;
	
		do
		{
			System.out.println("Enter Numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Addition :"+(a+b));
			System.out.println("Do You Want To Continue?Y/N");
			decision=sc.next().charAt(0);
			
		}while(decision=='y' || decision=='Y');
	
	}
}