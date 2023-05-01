package binary.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:/Photo_1590902911783.png");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] bytes = new byte[(int) new File("D:/Photo_1590902911783.png").length()];
		bin.close();
		fin.close();
		
		
		FileOutputStream fout = new FileOutputStream("a.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		fout.write(bytes);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("binary file uploaded successfully");
		System.out.println("please refresh the project");
	}
}
