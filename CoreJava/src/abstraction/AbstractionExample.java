 package abstraction;
 
 abstract class Electronics
 {
	 abstract void start(); //method without implementation
	 
	 abstract void stop();
	 
 }
 
 class TV extends Electronics
 {
	 void start()
	 {
		 System.out.println("TV Started");
	 }
	 
	 void stop()
	 {
		 System.out.println("TV Stopped");
	 }
 }
 
 
 class AC extends Electronics
 {
	 void start()
	 {
		 System.out.println("AC Started");
	 }
	 
	 void stop()
	 {
		 System.out.println("AC Stopped");
	 }
 }
 
 

public class AbstractionExample {

	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
		
		new TV().stop();
		new AC().stop();
		
	}
	
}
