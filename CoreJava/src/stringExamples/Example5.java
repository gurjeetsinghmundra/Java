package stringExamples;

public class Example5 {
	
	public static void main(String[] args) {
		
		String s1="Mobileooooo";
		int count=0;
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			if(s1.charAt(i)=='o')
			{
				count++;
			}
			
			System.out.print(s1.charAt(i));
		}
		
		System.out.println();
		System.out.println("==============================");
		System.out.println(count);
		
		System.out.println("==============================");
		
		String s2="OfjOoaOoooo";
		int total=0;
		
		for(char ch:s2.toCharArray())
		{
			if(ch=='o'||ch=='O')
				total++;
		}
		
		System.out.println(total);
	}

}
