package online.io2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) {
		File f1 = new File("vj.txt");
		char[] chars = new char[100];
		try(FileReader fin =  new FileReader(f1)) 
		{
			fin.read(chars);
			String s1 = new String(chars);
			System.out.println(s1);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		
		System.out.println("done");
	}
}

// limitation : 
// 1. line by line writing and line by line reading is not possible through FileWriter() and FileRead()
// 2. both are not using buffer.