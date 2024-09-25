package Inheritance;

class A
{
	
	int add(int a,int b) 
	{
		return a+b;
	}
}

class B extends A
{
	int sub(int a,int b)
	{
		return a-b;
	}	
}


public class SingleInheritance {
	
	public static void main(String[] args) {
		
	B obj=new B();
	int sum=obj.add(10,4);
	
	System.out.println(sum);
	
	System.out.println(obj.sub(10, 1));
	
	}

}
