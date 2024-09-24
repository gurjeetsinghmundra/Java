package staticKeyword;

//static will take memory only once
//and consider all object one
class Counter
{
	static int count=0;
	
	//non-parameterized constructor
	Counter()
	{
		count++;
		System.out.println(count);
	}
	
}

public class CounterProgram {
	
	public static void main(String[] args) {
		
		for(int n=1;n<=100;n++)
		{
			new Counter();
		}
		
	
//without static the output will be: 1 1 1 1 1
//coz without static it will be diff objects
		
	}

}
