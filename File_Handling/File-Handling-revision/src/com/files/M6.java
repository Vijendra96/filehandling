package com.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class M6 {
	public static void main(String[] args) throws Exception {
		File file = new File("b.txt");
		FileWriter fw = new  FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("abc");
		bw.newLine();
		bw.write("xyz");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.write("hello");
		bw.flush();
		bw.close();
		fw.close();
		System.out.println("writing is done");
	}
}
