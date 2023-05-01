package file.handling;
//read the total number of lines
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A4 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("hello.txt");
		BufferedReader bread = new BufferedReader(file);
		String s1 = bread.readLine();
		int lineCount = 0;
		while(s1 != null)
		{
			lineCount++;
			s1 = bread.readLine();
		}
		System.out.println("total number of lines are : " + lineCount);
	}
}
