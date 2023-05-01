package online.io2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// to read the file
public class M6 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test111.txt");	//file should be available
		char[] chars = new char[100];
		FileReader fin = new FileReader(f1);
		fin.read(chars);
		fin.close();
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
