class type_casting_loop
{
	public static void main(String args[])
	{
		for(int i=65;i<=90;i++)  //i<=65+25
		{
			System.out.println((char)i);
		}
		
		for(int i=97;i<=97+25;i++)  //i<=97+25
		{
			System.out.println((char)i);
		}
	}
}