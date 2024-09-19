class Student
{
	int rollNo;        //Instance Variable
	String name;
}


class class_object
{
	public static void main(String args[])
	{
	 Student s1=new Student();
	 s1.rollNo=101;
	 s1.name="Gurjeet";
	 
	 Student s2=new Student();
	 s2.rollNo=102;
	 s2.name="Guru";

	 System.out.println(s1.rollNo);
	 System.out.println(s1.name);	
	 
	 System.out.println(s2.rollNo);
	 System.out.println(s2.name);
	
	}
}