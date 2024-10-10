package exceptionHandling;

//When your syntax is wrong it is called error
//When your syntax is correct but logic is wrong it will show exception

public class Example1 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {	//line no. which is giving exception should be written here
			System.out.println(5/0);
		}
		
		//ArithmeticException is exception shown at console
		catch(ArithmeticException e) //e is a variable that store object so it can be called object name
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		
		System.out.println("Code After Exception");
	}

}
