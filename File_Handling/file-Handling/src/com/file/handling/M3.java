package com.file.handling;

import java.io.File;

public class M3 {
	public static void main(String[] args) throws Exception{
		File f1 = new File("hello2.doc");
		f1.createNewFile();
		System.out.println("done");
	}
}
