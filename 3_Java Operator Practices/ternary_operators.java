class ternary_operators
{
	public static void main(String arg[])
	{
		
	int a=40;
	int b=30;
	
	System.out.println(a>b?"a is greater":"b is greater");
	//if true then first statement will be executed or else 2nd statement
	
	int biggerValue=a>b?a:b;
	System.out.print(biggerValue);
	}
}