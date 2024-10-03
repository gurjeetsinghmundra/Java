package abstraction;

// for inheriting class we use extends
// for inheriting interface we use implements

public class A implements I1 {

	public void display()
	{
		System.out.println("Overridden Method of A class");
	}
	
	public void square(int n)
	{
		System.out.println(n*n);
	}
	
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
}
