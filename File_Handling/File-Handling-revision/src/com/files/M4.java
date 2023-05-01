package com.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class M4 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		int lineCount = 0;
		while(s1 != null)
		{
			System.out.println(s1);
			lineCount++;
			s1 = br.readLine();
		}
		System.out.println("\ntotal number of lines are : " + lineCount);
	}
}
