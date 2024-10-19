package revision;

@FunctionalInterface
interface I3
{
	void printAnyName(int n);
}

public class Example2 {
	
	public static void main(String[] args) {
		
		I3 i=(n)->{for(int a=0;a<n;a++)
		{
			System.out.println("Guru");
		}
		};
		
		i.printAnyName(6);
		
	}

}
