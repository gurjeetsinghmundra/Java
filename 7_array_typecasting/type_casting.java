class type_casting
{
	public static void main(String args[])
	{
	
	// Widening Type Casting (Implicitly )
		
		int a=12;
		long b=a;
	
		System.out.println(b);
		
	// Narrowing Type Casting (Explicitly)
	 // Lossy Conversion
		
		int c=100;
		byte d=(byte) c; // int to byte conversion
		
		System.out.println(d);	
	}
}