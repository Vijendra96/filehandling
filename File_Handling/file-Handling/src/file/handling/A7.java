package file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A7 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("hello.txt");
		BufferedReader bread = new BufferedReader(file);
		String s1 = bread.readLine();
		int charsCountWithOutSpace = 0;
		while(s1 != null)
		{
			for(String word : s1.split(" "))
			{
				charsCountWithOutSpace = charsCountWithOutSpace + word.length();
				s1 = bread.readLine();
			}
		}
		System.out.println("total numbet of characters without space are : " + charsCountWithOutSpace);
	}
}
