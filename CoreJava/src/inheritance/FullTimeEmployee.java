package inheritance;

public class FullTimeEmployee extends Employee {

	int noOfLeaves;
	int insurance;
	
	FullTimeEmployee(int id,String name,int monthlySalary,
			int noOfLeaves,int insurance)
	{
		super(id,name,monthlySalary);
		
		this.noOfLeaves=noOfLeaves;
		this.insurance=insurance;
	}
}
