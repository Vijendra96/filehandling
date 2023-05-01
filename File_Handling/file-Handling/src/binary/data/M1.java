package binary.data;
//how to read binary data
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("E:/IMG-20211108-WA0046.jpg");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] allBytes = new byte[(int) new File("E:/IMG-20211108-WA0046.jpg").length()];
		bin.read(allBytes);
		bin.close();
		fin.close();
		
	
		FileOutputStream fout = new FileOutputStream(("test.jpeg"));
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(allBytes);
		bout.flush();
		fout.close();
		bout.close();
		
		System.out.println("done");
		System.out.println("refresh the project and open test.jpeg");
	}
}


//	binary file is other than text file /char file like -audio, image, video file, even DLL file, command file, application file are binary files.
//	binary content we can not develop inside the program.
//	we can develop any text content.
//	BufferedReader and BufferedWritter is only for text data.
//	for the binary data you had to use Streams(FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream)