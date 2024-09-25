package staticKeyword;

public class StaticExample {
	
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
		Employee.ceo="Priyanka Mam";
		Employee.changeCeo("Nisha");
		
		Employee e1= new Employee(1,"Chetan");
		Employee e2= new Employee(2,"Shriya");
		
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);
	}
	
}
