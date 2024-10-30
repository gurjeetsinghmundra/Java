package multiThreading;

class T3 extends Thread
{
	public void run()
	{
		
		while(true)
		{
			System.out.println("Infinite Loop");
		}
		
	}
}



public class MtExample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T3 t3=new T3();
		
		t3.setDaemon(true); //death
		
		t3.start();
		
		t3.sleep(5000); // make  alive 
		
		
	}

}
