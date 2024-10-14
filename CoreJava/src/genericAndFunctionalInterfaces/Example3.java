package genericAndFunctionalInterfaces;

import java.util.function.Predicate;

import encapsulation.Student;

public class Example3 {
	
	public static void main(String[] args) {
		
		
		Predicate<Student> checkAge=new Predicate<Student>()
		{

			@Override
			public boolean test(Student t) {
				// TODO Auto-generated method stub
				return t.getAge()>=18;
			}
			
		};
		
		
		Student student=new Student(101,"Gurjeet",2);
		
		boolean ans=checkAge.test(student);
		
		System.out.println(ans);
	}

}
