package exceptionHandling;

public class Example8 {
	
	//throw is used when we want to show exception
	//for example when you dont want age to be entered as negative
	
	
	public static void throwException() {
		
		throw new NullPointerException("Invalid");
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			throwException();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("Bye");  //this line will not be executed coz of exception
		
		
	}
}
