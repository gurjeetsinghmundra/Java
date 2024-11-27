package task2;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class StudentGradeCalculator {

		public static void main(String[] args) {
			
			
			System.out.println("                          Result 2024");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			
			ArrayList <Integer> list=new ArrayList<Integer>();
			
			for(int i=1;i<=6;i++)
			{
				System.out.print("Enter Subject "+i+" Marks :");
				list.add(sc.nextInt());
			}
			
			int numSubjects=list.size();
		
		int totalMarks=0;
		for(int sum:list)
		{
		
			totalMarks=totalMarks+sum;
		}
		
		System.out.println();
		System.out.println("Total Marks: "+totalMarks);
		
		float averagePercentage = (totalMarks / (float)  (numSubjects * 100)) * 100;
		
		System.out.println("Average Percentage: "+averagePercentage+"%");
		
	    String grade = "";
	    if (averagePercentage >= 90) {
	        grade = "A+";
	    } else if (averagePercentage >= 80) {
	        grade = "A";
	    } else if (averagePercentage >= 70) {
	        grade = "B";
	    } else if (averagePercentage >= 60) {
	        grade = "C";
	    } else if (averagePercentage >= 50) {
	        grade = "D";
	    } else if (averagePercentage >= 50) {
	        grade = "E";
	    } else {
	        grade = "F";
	    }
	    
	    System.out.println("Grade: " + grade);
	}
		
}

