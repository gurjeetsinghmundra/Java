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
				return t.getAge()>18;
			}
			
		};
		
		
	}

}
