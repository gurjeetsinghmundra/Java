package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example6 {

	public static void main(String[] args) {
		
		try
		{
			new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		
		
	}
}
