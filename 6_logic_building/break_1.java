import java.util.Scanner;
class break_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
				break;
		}
	}
}