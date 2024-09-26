package Inheritance;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
	
	PartTimeEmployee pte=new PartTimeEmployee(101,"Guru",60000,4000);
	
	FullTimeEmployee fte=new FullTimeEmployee(101,"Guru",100000,4,1500000);
	
	
	System.out.println(pte.id+" "+pte.name+" "+pte.monthlySalary+" "+pte.bonus);
	
	System.out.println(fte.id+" "+fte.name+" "+fte.monthlySalary+" "+fte.noOfLeaves+" "+fte.insurance);

	}
}
