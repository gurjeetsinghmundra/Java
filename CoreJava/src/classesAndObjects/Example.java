package classesAndObjects;

public class Example {
	public static void main(String[] args) {
		
		Product p1=new Product();
		
		p1.setProductDetails(101,"Computer",70000);
		
		Product p2=new Product();
		p2.setProductDetails(102,"Mobile",20000);
		
		System.out.println("You have to Pay: "+p2.discount());
	}

}
