package abstraction;

abstract class Product
{
	abstract void details();
	
}

class Mobile extends Product
{
	void details()
	{
		System.out.println("Mobile Details");
	}
}


public class AbstractionExample2 {
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		
		mobile.details();
		
		//Anonymous Inner Class
		
		Product laptop=new Product() {
			
			void details()
			{
				System.out.println("Laptop Details");
			}
			
		};
		
		laptop.details();
		
		
		Product headphone=new Product()
		{
			void details()
			{
				System.out.println("Headphone Details");
			}
		};
		
		headphone.details();
		
	}
	
}
