package exceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		
		System.out.println("Code After Exception");
	}

}
