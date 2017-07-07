package p1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass 
{
	public static void main (String args[]) 
	{
		File file=new File("test.txt");
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file)))
		{
			br.write("This is new file");
			br.newLine();
			br.write("hi.. welcome to NIIT");
			br.newLine();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	
	
}
