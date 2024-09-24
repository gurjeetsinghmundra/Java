package classesAndObjects;

public class PurchaseCar {
	public static void main(String[] args) {
		
		Cars c1=new Cars();
		
		c1.carDetails("Tesla",3000000,"White");
		
		System.out.println(c1.discount());
		
		Cars c2=new Cars();
		
		c2.carDetails("G Wagon",5000000,"Black");
		
		System.out.println(c2.discount());
	}

}
