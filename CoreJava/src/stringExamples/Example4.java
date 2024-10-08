package stringExamples;

public class Example4 {

	public static void main(String[] args) {
		
		String s1="Hello ";
		s1=s1.concat("World");
		
		System.out.println(s1);
		
		System.out.println("-----------------------------------------------------");
		
		
		System.out.println("   He         ll          oo     ".trim()+"World");
		//.trim() will remove space from start and end
		
		
		System.out.println("Gurjeet".length());
		System.out.println("Guru".charAt(2)); //index starts at zero
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Apple".indexOf('p'));
		//Will give index of first p
		
		System.out.println("Laptop".indexOf('p',3));//after comma represents index
		//will give index of p after 3rd index
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Laptop".startsWith("La")); //Case Sensitive
		
		System.out.println("-----------------------------------------------------");
		
		String s2="Bottle";
		char arr[]=s2.toCharArray();
		
		for(char ch:arr)
		{
			System.out.println(ch);
		}
		
		
		
	}
}
