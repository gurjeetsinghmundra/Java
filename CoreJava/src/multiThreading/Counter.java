package multiThreading;

public class Counter {

	int count=0;
	
	 synchronized public void increment()
	{
		this.count++; //this is used for scalability in projects(this refers to object)
	}
	//we should add synchronized in counter class to get accurate ans
}
