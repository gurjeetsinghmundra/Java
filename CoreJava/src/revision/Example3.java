package revision;

@FunctionalInterface
interface I4{
	
	int add(int a,int b);
}

public class Example3 {
	public static void main(String[] args) {
		
		I4 i=new I4() {
			public int add(int a,int b)
			{
				return a+b;
			}
		};
		
		System.out.println(i.add(20, 10));
		
		
		I4 j=(a,b)->a+b;
		System.out.println(i.add(10, 100));
	}

}
