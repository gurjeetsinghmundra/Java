package practice;

public class Students {
	
	String name;
	static String teacher="Priyanka Mam";
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(String name) {
		super();
		this.name = name;
	}


	public static void changeTeacher(String teacherName)
	{
	
		teacher=teacherName;
	}
	

}
