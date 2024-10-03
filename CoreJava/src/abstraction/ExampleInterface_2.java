package abstraction;

public class ExampleInterface_2 {

	
	public static void main(String[] args) {
		
		R a=new R();
		
		a.add(10, 20);
		a.sub(30, 20);
		
		int ans=a.square(5);
		
		System.out.println(ans);
	}
}
