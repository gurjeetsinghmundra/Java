package Inheritance;

class Student
{
	int rollNo;
	String name;
	int marks;
	
	Student()
	{
		System.out.println("Non para");
	}
	
	Student(int rollNo,String name,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
}

class SportStudent extends Student
{
	int graceMarks;
	String sportName;
	
	SportStudent(int rollNo,String name,int marks,int graceMarks,String sportName)
	{
		super(rollNo,name,marks);
		
		this.graceMarks=graceMarks;
		this.sportName=sportName;
		
	}
	
}


public class Inheritance_2 {
	
	public static void main(String[] args) {
		SportStudent sd=new SportStudent(101,"Gurjeet",100,5,"Running");
		
		
	  sd.rollNo;
	}

		

}
