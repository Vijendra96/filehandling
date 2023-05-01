package file.handling;
//	to read the file with specific size
import java.io.FileReader;
import java.io.IOException;

public class A2 {
	public static void main(String[] args) throws IOException{
		FileReader fin = new FileReader("text1.txt");
		char[] chars = new char[10];
		fin.read(chars);
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
