package multiThreading;

//create a class
//Inherit thread class

//start method belongs to Thread class

//T1 is taking 10seconds and T2 is taking 5 but the work will be done in 10 seconds(not 15)
//bcoz multithreading does all work together


class T1 extends Thread
{	
	public void run() //run method belongs to runnable class
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class T2 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Bye");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class MtExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		T1 t1=new T1();
		t1.start();
		

		T2 t2=new T2();
		t2.start();
		
		t2.join(); // main method will execute afterwards
		t1.join();
		
		
		//if any method is static we can call them by class name
		
		System.out.println("Main Method"); //Main method is also a Thread

	}
}
