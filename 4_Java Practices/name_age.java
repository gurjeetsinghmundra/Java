import java.util.Scanner;
class name_age
{
	public static void main(String args[])
	{
	 Scanner n=new Scanner(System.in);
	 System.out.print("Enter Name: ");
	 String name=n.next();
	 
	 Scanner a=new Scanner(System.in);
	 System.out.print("Enter Age: ");
	 int age=a.nextInt();
	 
	 System.out.print("My Name is "+name+" and My Age is "+age);
	
	}

}