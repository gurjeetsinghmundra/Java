package practice;

public class StaticExample1 {
	
	public static void main(String[] args) {
		
		System.out.println(Students.teacher);
		
		Students.changeTeacher("Gurjeet");
		
		System.out.println(Students.teacher);
	}

}
