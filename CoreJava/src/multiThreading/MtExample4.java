package multiThreading;

public class MtExample4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		Thread t1 = new Thread(()->
		{
			for(int i=1;i<=5000;i++)
			{
				counter.increment();
			}
		});
		
		
		
		
		Thread t2 = new Thread(()->
		{
			for(int i=1;i<=5000;i++)
			{
				counter.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join(); // main method will execute afterwards
		t2.join();
		
		//we should add synchronized in counter class to get accurate ans
		//otherwise we will get incorrec ans
		
		System.out.println(counter.count);
	}

}
