package binary.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class M2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\des.jpg");
		BufferedInputStream bout = new BufferedInputStream(fin);
		byte[] bytes =  new byte [(int) new File("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\des.jpg").length()];
		bout.read(bytes);
		fin.close();
		bout.close();
		
		
		FileOutputStream fout = new FileOutputStream("new1.jpg");
		BufferedOutputStream bout1 = new BufferedOutputStream(fout);
		bout1.write(bytes);
		bout1.flush();
		bout1.close();
		fout.close();
		
		System.out.println("done");
		System.out.println("refresh the project and open test.jpeg");
	}
}
