package multiThreading;

class Thread1 implements Runnable
{

	//@Override
	public void run() {
		System.out.println("Thread1");
	}
	
}

public class MtExample3 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Thread1());
		t1.start();
		
	/*	Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("Anonymous Inner Class");
			}
		};
		
		Thread t2 = new Thread(r1);
		
	*/
		
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Anonymous Inner Class");
			}
			});
		
		t2.start();
		
	/*
	 Thread t3 = new Thread(()->System.out.println("Multithreading with Lambda"));
	 */	
		
		Runnable r1=()->System.out.println("Multithreading with Lambda");
		Thread t3=new Thread(r1);
		t3.start();
		
	}
}
