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
		return 0; //methods want integer
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
	
	//automatic
	public String toString()
	{
		return this.id+" "+this.name+" "+this.age;
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	
}
