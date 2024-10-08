package stringExamples;

//StringBuilder and StringBuffer
//Both are mutable(normal strings are inmutable)
//Mutable means they can change


public class Example6 {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");
		
		sb.reverse();//will make changes in same variable
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		sb.replace(0,2,"*********");
		//2 is exclusive(not included)
		
		System.out.println(sb);
		
		System.out.println("----------------------------------------");
		
		sb.append("World"); //append will combine words at the end (jodega)
		
		System.out.println(sb);
		
		System.out.println("----------------------------------------");
		
		sb.delete(0, 13); //13 is exclusive(not included)
		
		System.out.println(sb);
		
		
		
	}

}
