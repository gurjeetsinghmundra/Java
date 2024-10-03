package abstraction;

public interface Bank {
	
	void details();
	
	default void methodBank()
	{
		System.out.println("Default Method");
	}

	static void staticMethod()
	{
		 System.out.println("Static Method From Bank");
	}
}
