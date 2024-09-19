class Car
{
	String color;
	int price;

//return_type method_name(datatype parameter1,datatype parameter2){}

	void carDetails()
	{
		System.out.println("Car Details :"+color);
	}
	
	void carTax()
	{
		System.out.println(price*0.2);
	}
}

class methods
{
	public static void main(String args[])
	{
	 
		Car c1=new Car();
		c1.color="Red";
		c1.color="Red";
		c1.price=100000;
	
		System.out.println(c1.color);
		System.out.println(c1.price);
	
		c1.carDetails();
		c1.carTax();
	
	}
}