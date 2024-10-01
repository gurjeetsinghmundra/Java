package abstraction;

abstract class BusinessLogic{
	
	abstract void coupons();
}

public class BusinessLogicMain {
	
	public static void main(String[] args) {
		
		BusinessLogic weekdays=new BusinessLogic()
		{
			void coupons()
			{
				System.out.println("Only 10% discount");
			}
		};
		weekdays.coupons();
		
		BusinessLogic weekend=new BusinessLogic()
		{
			void coupons()
			{
				System.out.println("50% discount");
			}
		};
		weekend.coupons();	
	}
	

}
