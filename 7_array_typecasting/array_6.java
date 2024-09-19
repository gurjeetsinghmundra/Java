class array_6
{
	public static void main(String args[])
	{
		int arr1[][]={{22,53,34},{56,43,13}};
	
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
		
System.out.println("=============================================================");	

		//Enhanced For loop (it is only used in array) 
		
		for(int n[]:arr1)
		{
			for(int i:n)
			{
				System.out.println(i);
			}		
		}
		
System.out.println("=============================================================");		
		int arr2[][]={{22,54},{23,46,52},{67,34,76,86}};

		for(int m[]:arr2)
		{
			System.out.println(m.length);
		}
	}
}
