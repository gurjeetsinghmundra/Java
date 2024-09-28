package patterns;

public class Pattern1 {

	//basic pattern 
	
	public static void main(String[] args) {
		
		for(int j=1;j<=7;j++)//Outer For Loop denotes the number of columns
		{
		
			for(int i=1;i<=10;i++)//Inner For Loop denotes the number of rows
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}

}
