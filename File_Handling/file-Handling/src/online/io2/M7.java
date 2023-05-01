package online.io2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M7 {
	public static void main(String[] args) {
		File f1 = new File("vj.txt");
		char[] chars = new char[100];
		FileReader fin = null;
		try 
		{
			fin = new FileReader(f1);
			fin.read(chars);
			String s1 = new String(chars);
			System.out.println(s1);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			if(fin != null)	//to check it is initialized or not
			{
				try
				{
					fin.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
