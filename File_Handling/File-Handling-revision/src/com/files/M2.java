package com.files;
//total characters in a file without space
import java.io.BufferedReader;
import java.io.FileReader;

public class M2 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		int charCount = 0;
		while(s1 != null)
		{
			System.out.println(s1);
			for(String words : s1.split(" "))
			{
				charCount = charCount + words.length();
			}
			s1 = br.readLine();
		}
		System.out.println("total words are : " + charCount);
	}
}
