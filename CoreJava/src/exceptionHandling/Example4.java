package exceptionHandling;

public class Example4 {
	
	public static void main(String[] args) {
		
		String s="Laptop";
		try {
			s.charAt(80); //line no. which is giving exception should be written here
		}
		
		//catch(StringIndexOutOfBoundsException e)
		catch(Exception e) //Exception name should be written when multiple catch is used
		{
			System.out.println(e);
		}
	
		System.out.println("Code After Exception");
		
	}
	

}
