package inheritance;

class C
{
	void methodC()
	{
		System.out.println("Method of C class");
	}
}

class D extends C
{
	void methodD()
	{
		System.out.println("Method of D class");
	}
}

class E extends D
{
	void methodE()
	{
		System.out.println("Method of E class");
	}
}

class F extends E
{
	void methodF()
	{
		System.out.println("Method of F class");
	}
}



public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		F oj=new F();
		
		oj.methodF();
		oj.methodE();
		oj.methodD();
		oj.methodC();
	}
	
	

}
