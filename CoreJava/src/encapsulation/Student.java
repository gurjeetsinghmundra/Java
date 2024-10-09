package encapsulation;

public class Student {

	private int id;
	private String name;
	private int age;
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	// Password program
	public int getId(String password)
	{
		if (password.equals("U@1"))
		return this.id;
		else
		return 0; //methods want integar
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
}
