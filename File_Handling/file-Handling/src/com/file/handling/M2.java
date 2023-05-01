package com.file.handling;

import java.io.File;

public class M2 {
	public static void main(String[] args) throws Exception{
		File f1 = new File("hello1.html");
		f1.createNewFile();
		System.out.println("done");
	}
}
