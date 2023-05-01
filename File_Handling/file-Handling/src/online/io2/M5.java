package online.io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) {
		File f1 = new File("test111.txt");
		try(FileWriter out = new FileWriter(f1)) //no need of close explicitly, closing automatically
		{
			out.write("hello");
			out.write("test");
			out.write("end");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}


// this feature is introducing jdk1.7