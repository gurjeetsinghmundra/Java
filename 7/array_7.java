class array_7
{
	public static void main(String args[])
	{
		String courses[][]=
		{{"Html","Css","JavaScript"},
		 {"MySql","MongoDB"},
		 {"Core Java","Spring Boot"}			
		};

		for(String c_name[]:courses)
		{
			for(String n:c_name)
			{
				System.out.println(n);
			}
		}
		
System.out.println("==========================================================");		
		int total=0;
		
		for(String total_c[]:courses)
		{         
			total=total+total_c.length;
			for(String n:total_c)
			{
			}
		}
		
		System.out.println(total);
	}
}