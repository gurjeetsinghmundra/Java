package abstraction;

@FunctionalInterface

interface I6
{
	void printName(String name);
}

@FunctionalInterface

interface I7
{
	int add(int a,int b);
}

@FunctionalInterface

interface I8
{
	int square(int n);
}


public class ExampleInterface_4 {
	
	public static void main(String[] args) {
		
		
		I6 obj=(name)-> System.out.println("My Name is "+name);
		obj.printName("Guru");
		
		
		I6 obj1=(name)-> {for(int i=0;i<=100;i++)
		{
			System.out.println("My Name is "+name);
		};
		};
		
		obj1.printName("Gurjeet");
		
		I7 obj2=(a,b)-> a+b; //it is not required to write RETURN in lambda
		//normally we write return a+b 
		
		//1 way
		int ans=obj2.add(5, 10);
		System.out.println(ans);
		
		//2 way
		System.out.println(obj2.add(12,10));
		//void type cant be written in sysout coz it doesnt written anything
		
		
System.out.println("======================================================================");

		I8 s=(n)-> n*n;
		System.out.println(s.square(10));
		
		
	}

}
