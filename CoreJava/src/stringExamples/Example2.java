package stringExamples;

public class Example2 {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		
		System.out.println("=========================================================");
		
		
		System.out.println(a.equalsIgnoreCase(b)); //Ignores Upper and Lower Case
		
		System.out.println("=========================================================");
		
		String c="A";
		String d="a";
		//Check ASCII values

		System.out.println(c.compareTo(d));
		
		System.out.println("=========================================================");
		
		String s="INDIA";
		
		System.out.println(s.toLowerCase());
		//s=s.toLowerCase();
		
		System.out.println(s);
		
	}
}
