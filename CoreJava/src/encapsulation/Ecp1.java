package encapsulation;

public class Ecp1 {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.setId(101);
		
		//System.out.println(s1.getId());
		
		//int id=s1.getId("S#1");
		int id=s1.getId("U@1");
		
		System.out.println(id);
		
		//
		s1.setName("Gurjeet");
		
		System.out.println(s1.getName());
		
		//
		
		s1.setAge(21);
		
		System.out.println(s1.getAge());
		
		//
		System.out.println(s1);
	}
	
	

}
