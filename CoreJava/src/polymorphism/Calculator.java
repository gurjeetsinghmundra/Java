package polymorphism;

public class Calculator {

	//add	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b ,int c)
	{
		System.out.println(a+b+c);
	}
	
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
	
	void add(float a,float b, float c)
	{
		System.out.println(a+b+c);
	}
	
	void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	void add(float a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,float b,float c)
	{
		System.out.println(a+b+c);
	}
	
	void add(int a,int b,float c)
	{
		System.out.println(a+b+c);
	}
	

	void add(float a,int b,float c)
	{
		System.out.println(a+b+c);
	}
	

	void add(float a,float b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	//sub
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void sub(int a, int b ,int c)
	{
		System.out.println(a-b-c);
	}
	
	void sub(float a, float b)
	{
		System.out.println(a-b);
	}
	
	void sub(float a,float b, float c)
	{
		System.out.println(a-b-c);
	}
	
	//mul
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	void mul(int a, int b ,int c)
	{
		System.out.println(a*b*c);
	}
	
	void mul(float a, float b)
	{
		System.out.println(a*b);
	}
	
	void mul(float a,float b, float c)
	{
		System.out.println(a*b*c);
	}
	
	//div
	void div(int a, int b)
	{
		System.out.println(a/b);
	}
	
	void div(int a, int b ,int c)
	{
		System.out.println(a/b/c);
	}
}
