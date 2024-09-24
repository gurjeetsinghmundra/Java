package classesAndObjects;

public class Category {
	
	//JAVA Consist of default constructor which is used 
	//default constructor is made only if you dont have any other constructor in your program
	int categoryId;
	String categoryName;
	
	//Non-parameterized Constructor
	//Constructor name always same as class name
	Category()
	{
		System.out.println("Category object is created using constructor");
	}
	
	Category(int categoryId,String categoryName)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}
	
//constructor are called automatically(implicitly)
//methods needs to be called manually(explicitly)

	
	/*
	 Constructor overloading
	More than 1 constructor in a program is called Constructor overloading
	Rules:- 2 constructors shouldnt have same parameter
			(if incase they have same parameter the (type) should be diff)
	
	for example:- ex(int e1,string e2)
	 		 	  ex(int e1,string e2)
	 		 	  NOT ALLOWED
	 		 	  
	 		 	  ex(int e1,string e2)
	 		 	  ex(string e1,int e2)	
	 		 	  ALLOWED
	 */
	
}
