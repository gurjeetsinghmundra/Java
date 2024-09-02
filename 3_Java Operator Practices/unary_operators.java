class unary_operators
{
	public static void main(String args[])
	{
		int i=10;
		i++;
		
		//Unary Operators
		// ++ increment   -- decrement
		
		System.out.println(i);
		
		int j=10;
		j--;
		j--;
		
		System.out.println(j);
	
	    int k=20;
		k++;
		++k;
		--k;
		System.out.println(k--); //21
		System.out.println(k++); //20
		System.out.println(k);//21
		
		int a=40;
		int b=20;
		
		b+=a;//60
		a-=b;
		
		System.out.println(b);
		System.out.println(a);
		
	
	}
}