import java.util.Scanner;
class vowel_switch
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			char ch=sc.next().charAt(0);
			
			switch(ch)
			{	
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("It is Vowel");
					break;
					
				default:
					System.out.println("It is consonants");
				
			}
		}
}