package online.io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("vjjjj.txt", true);
		fw.write("hello ");
		fw.write("test ");
		fw.write("abc ");
		fw.write("\n");
		fw.write("xyz ");
		fw.write("hello ");
		fw.write("end");
		fw.flush();
		fw.close();
		System.out.println("done");
	}
}
