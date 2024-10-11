package exceptionHandling;


public class NegativeNumberException extends Exception{ //Exception for CompileTimeException

	public NegativeNumberException()
	{
		super();
	}
	
	public NegativeNumberException(String message)
	{
		super(message);	
	}
	
}
