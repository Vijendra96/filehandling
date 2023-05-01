package file.handling;
//count the total characters with space
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A6 {
	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("hello.txt");
		BufferedReader bread = new BufferedReader(file);
		String s1 = bread.readLine();
		int charsCountWithSpace = 0;
		while(s1 != null)
		{
			charsCountWithSpace = charsCountWithSpace + s1.length();
			s1 = bread.readLine();
		}
		System.out.println("total characters are : " + charsCountWithSpace);
	}
}
