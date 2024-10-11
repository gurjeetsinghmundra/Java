package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example7 {
	
	public static void fileHandling() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
	
	public static void main(String[] args) { // we can also write throw here so jvm will handle it
		System.out.println("Hello");
		
		try {
		fileHandling(); //hover on the left to find exception name
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		
		System.out.println("Code After Exception");
	}

}
