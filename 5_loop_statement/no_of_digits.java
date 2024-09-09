import java.util.Scanner;
class no_of_digits
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in); 	
			int n=sc.nextInt();
			int i=0;
			int m=n;
		
			while(n!=0)
			{
				n=n/10;
				i++;
			}
			if(i>=4){
			System.out.println(i+ " is large");
			}
			else{
			System.out.println(i+ " is small");
			}
			
			System.out.println("OG number: "+m);
		}
}