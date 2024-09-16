import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	//datatype arr_name[]=new datatype[size];
	
	
	 int numbers[]=new int[3];
	 
	 // 12  23   42
	 // 0   1    2
	
	 numbers[0]=12;
	 numbers[1]=23;
	 numbers[2]=42;
	 
	 System.out.println(numbers[0]);
	 System.out.println(numbers[1]);
	 System.out.println(numbers[2]);
	
	String names[]=new String[6];
		
	names[0]="Amit";
	names[1]="Shriya";
	names[2]="Rayyan";
	names[3]=sc.nextLine();
	names[4]=sc.nextLine();
	names[5]=sc.nextLine();
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	System.out.println(names[3]);
	System.out.println(names[4]);
	System.out.println(names[5]);

	}
}