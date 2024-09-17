import java.util.Scanner;
class array_4
{
	
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		String weekdays[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
					  //    0      1	 2     3     4     5     6  
		int primeNumbers[]={11,13,17,5};
		
		System.out.println("Weekdays:"+weekdays.length);
		System.out.println("PrimeNumbers:"+primeNumbers.length);

		//Enhanced For Loop
		
			for(int number:primeNumbers)
			{
					System.out.println(number);
		
			}
			
		int numbers[]={1,4,6,2,45};
		int sum=0;

			for(int num:numbers)
			{
				sum=num+sum;
				
			}
			System.out.println(sum);
			
			
System.out.println("=====================================================");
			
//-------------------------------------------------------------------

			char ch[]={'a','e','i','a','c','a'};
			int count=0;
			
			for(char c:ch)
			{
				if(c=='a')
					count++;	
			}
			
			System.out.println(count);
			
System.out.println("=====================================================");


			char chr[]={'a','e','t','i'};
			int vowels=0;
			int consonants=0;
			
			for(char cc:chr)
			{
				if(cc=='a' || cc=='e' || cc=='i')
				{
					System.out.println("Vowels");
					vowels++;
				}
				else
				{
					System.out.println("Consonants");
					consonants++;
				}
			}
			
			System.out.println("Vowels count: "+vowels+" , Consonants Count: "+consonants);
		
	}
}