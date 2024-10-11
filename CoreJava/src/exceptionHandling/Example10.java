package exceptionHandling;

public class Example10 {
	
	public static void checkNumber(int n) throws NegativeNumberException{
		
		if(n>=0)
		{
			System.out.println(n);
		}
		else
		{
			throw new NegativeNumberException("Number is negative");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//click on left to auto generate
		try {
			checkNumber(14);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
