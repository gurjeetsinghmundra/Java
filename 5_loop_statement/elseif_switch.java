class elseif_switch
{
	public static void main(String args[])
	{
		switch(4)
		{
			case 1:
				System.out.println("Case 1");
				break;
				//without break if we run case 1 then output will show case1,case2,case3
					
			case 2:
				System.out.println("Case 2");
				break;
			
			case 3:
				System.out.println("Case 3");
				break;
			
			default:
				System.out.println("No matching case");
		
		}
	}
}