package file.handling;
//read the total number of words
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A5 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("hello.txt");
		BufferedReader bread = new BufferedReader(file);
		String s1 = bread.readLine();
		int wordCount = 0;
		while(s1 != null)
		{
			wordCount = wordCount + s1.split(" ").length;
			s1 = bread.readLine();
		}
		System.out.println("total number of words are : " + wordCount);
	}
}
