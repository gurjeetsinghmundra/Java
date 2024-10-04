package abstraction;

@FunctionalInterface

interface I6
{
	void printName(String name);
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
		
	}

}
