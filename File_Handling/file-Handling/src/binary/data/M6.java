package binary.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("E:/des.jpg");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] bytes = new byte[(int) new File("E:/des.jpg").length()];
		bin.read(bytes);
		bin.close();
		fin.close();
		
		
		//writing the file
		FileOutputStream fout = new FileOutputStream("aa.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(bytes);
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("done .. refresh your project");
	}
}
