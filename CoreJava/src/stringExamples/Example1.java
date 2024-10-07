package stringExamples;

public class Example1 {
	
	public static void main(String[] args) {

//		Ways to Create String
//		1)By using String Literal
		
		String a="Hello"; // Memory stored  in STRING CONSTANT POOL
		String c="Hello"; // Memory stored  in STRING CONSTANT POOL
		
//		2)By using new keyword
		
		String b = new String("Hello"); //Memory stored  in HEAP.
		String d = new String("Hello"); //both takes diff space in heap
	
		System.out.println("===================================================");
		
		
		System.out.println(a==b);
		//it is not checking for value it is checking for reference

		System.out.println(a==c); //same
		
		
		System.out.println(b==d);//diff (coz heap provide diff space)
		

		
		
	}

}
