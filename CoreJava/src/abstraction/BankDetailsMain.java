package abstraction;

public class BankDetailsMain {

	public static void main(String[] args) {
		
	/*	SBI s=new SBI();
		CBI c=new CBI();
	*/
		
		Bank s=new CBI();
		
		s.details();
		s.methodBank();
		
//To call static method we write
	  //Class_name.Method_name;
		Bank.staticMethod();
	
	}
}
