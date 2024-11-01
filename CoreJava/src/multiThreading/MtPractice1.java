package multiThreading;

class P1 extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
}

class P2 extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}
}



public class MtPractice1 {

	
	public static void main(String[] args) {
		
		P1 p1=new P1();
		p1.start();
		
		P2 p2=new P2();
		p2.start();
		
	}
}
