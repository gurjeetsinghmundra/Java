class Calculator
{
	int a;
	int b;
	
	int addition()
	{
		return a+b;
	}
	
	int substraction()
	{
		return a-b;
	}
	
	void setValues(int n1,int n2)
	{
		a=n1;
		b=n2;
	}
	
}

class class_3
{

	public static void main(String args[])
	{
	    Calculator c1=new Calculator();
		c1.a=12;
		c1.b=10;
		int sum=c1.addition();
		int sub=c1.substraction();
		
		System.out.println("Addition is : "+sum);
		System.out.println(sum>100);
		System.out.println(sum+100);
		
		System.out.println("Substraction is: "+sub);                                                                                   Calculator c2=new Calculator();
		c2.setValues(120,2);
		System.out.println(c2.a+"          "+c2.b);

		Calculator c3=new Calculator();
		c3.setValues(10,5);
		System.out.println(c3.a+"          "+c3.b);
		
	}
}