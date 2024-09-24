package classesAndObjects;

public class Cars {
	
	String carName;
	int carPrice;
	String carColor;
	
	
	void carDetails(String carName, int carPrice, String carColor) 
	{
		this.carName=carName;
		this.carPrice=carPrice;
		this.carColor=carColor;
		
		System.out.println(this.carName+" "+this.carPrice+" "+this.carColor);
		
	}
	
	double discount()
	{
	 return	this.carPrice*0.8;
	}	

}
