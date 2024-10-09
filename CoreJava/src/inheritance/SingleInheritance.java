package inheritance;

class A
{
	
	int add(int a,int b) 
	{
		return a+b;
	}
	
	A()
	{
		System.out.println("Constructor A");
	}
	
	A(String value)
	{
		System.out.println("Constructor A "+value);
	}
}

class B extends A
{
	int sub(int a,int b)
	{
		return a-b;
	}	
	
	B()
	{
		System.out.println("Constructor B");
	}
	
	B(String value)
	{
		//super("mno");
		super(value);
		System.out.println("Constructor B "+value);
	}
}


public class SingleInheritance {
	
	public static void main(String[] args) {
		
//B obj=new B("xyz"); coz of this A class non parameterized const will be called thats why we use super
//writing super() will also give same output to avoid this we need to mention the value ie super(value);
	B obj=new B("xyz");	
	System.out.println("===============================================");
	int sum=obj.add(10,4);
	
	System.out.println(sum);
	
	System.out.println(obj.sub(10, 1));
	
	}

}
