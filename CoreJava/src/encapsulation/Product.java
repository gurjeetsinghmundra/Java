package encapsulation;

public class Product {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Product() { //this is used to prevent error is no input is given
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
	
	
	
	
}
