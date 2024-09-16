class type_casting
{
	public static void main(String args[])
	{
	
	// Widening Type Casting (Implicitly)
	// converting a smaller type to a larger type size
		
		int a=12;
		long b=a;
	
		System.out.println(b);
		
	// Narrowing Type Casting (Explicitly)
	 // Lossy Conversion
	 // converting a larger type to smaller size type
		
		int c=100;
		byte d=(byte) c; // int to byte conversion
		
		System.out.println(d);
		System.out.println("================================");
		
		
	//ASCII code for char		
	
		int m=65;
		char ch=(char) m; //int to char
		
		System.out.println(ch);
		
		int n=66;
		System.out.println((char)n);
		
	}
}