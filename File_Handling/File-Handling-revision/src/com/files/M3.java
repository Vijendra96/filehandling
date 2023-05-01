package com.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class M3 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		int wordCount = 0;
		while(s1 != null)
		{
			System.out.println(s1);
			wordCount = wordCount + s1.split(" ").length;
			s1 = br.readLine();
		}
		System.out.println("\ntotal words are : " + wordCount);
	}
}
