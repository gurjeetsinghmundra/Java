package abstraction;

public class R implements P,Q{

	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	
	public int square(int n)
	{
		return n*n;
	}
	
}
