package com.file.handling;

import java.io.File;
import java.io.IOException;

public class M1 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello.txt");
		f1.createNewFile();
		System.out.println("done");
	}
}
