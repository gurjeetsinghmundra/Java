package revision;

@FunctionalInterface
interface I2
{
	void apply();
}

public class Example1 {

	public static void main(String[] args) {
		
		I2 i=new I2() {
			public void apply()
			{
				System.out.println("Apply method From I2");
			}
		};
		
		i.apply();
		
		I2 j=()->System.out.println("Apply Method From I2(Lambda)");
		
		j.apply();
		
	}
}
