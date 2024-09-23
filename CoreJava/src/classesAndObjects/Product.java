package classesAndObjects;

public class Product {
	
	int productId;
	String productName;
	int productPrice;
	
	// We are keeping instances variable & parameters name same to make it easy for coder/programmer
	
	void setProductDetails(int productId,String productName,int productPrice ) {
	
	this.productId=productId;
	this.productName=productName;
	this.productPrice=productPrice;
		
	System.out.println(this.productId+" "+this.productName+" "+this.productPrice);
	
	}
 
}
