import java.util.Scanner;
class options
{
		public static void main(String args[])
		{
		System.out.print("Enter A Value: ");
		Scanner sa=new Scanner(System.in);
		int a=sa.nextInt();
		
		System.out.print("Enter B Value: ");
		int b=sa.nextInt();
		
		System.out.println("1:Add 2:Sub 3:Mul 4:Div");
		System.out.print("What Do You Want? ");
		int n=sa.nextInt();
		 
		if(n==1)
		{
		 System.out.println("Addition: "+(a+b));
		}
		else if(n==2)
		{
		System.out.println("Substraction: "+(a-b));
		}
		else if(n==3)
		{
		System.out.println("Multiplication: "+(a*b));
		}
		else if(n==4)
		{
		System.out.println("Division: "+(a/b));
		}
		else
		{
		System.out.println("Invalid Number");	
		}

	
		}
}