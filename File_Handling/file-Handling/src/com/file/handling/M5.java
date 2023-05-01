package com.file.handling;

import java.io.File;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello5.txt");
		System.out.println("a : " + f1.exists());
		System.out.println("b : " + f1.createNewFile());
		System.out.println("c : " + f1.exists());
		System.out.println("done");
	}
}
