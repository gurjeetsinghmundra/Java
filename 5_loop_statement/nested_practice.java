class nested_practice
{
	public static void main(String args[])
	{
		if(!(true && true && false))
		{
	     System.out.println("A");
			if(true || false)
				{
				System.out.println("B");
				}
			else
				{
				System.out.println("C");
				}
		}
		else
		{	
			if(true)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("E");	
			}
		}
	
	}
}