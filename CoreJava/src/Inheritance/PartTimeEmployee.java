package Inheritance;

public class PartTimeEmployee extends Employee{

	int bonus;
	
	PartTimeEmployee(int id,String name,int monthlySalary,
	int bonus		)
	{
		super(id,name,monthlySalary);
		this.bonus=bonus;
	}
}
