package com.file.handling;

import java.io.File;

public class M18 {
	public static void main(String[] args) {
		File f1 = new File("hello.txt");
		File f2 = new File("dir1");
		System.out.println("f1.isFile() : " + f1.isFile());
		System.out.println("f2.isFile() : " + f2.isFile());
		System.out.println("f1.isDirectory() : " + f1.isDirectory());
		System.out.println("f2.isDirectory() : " + f2.isDirectory());
		System.out.println("done");
	}
}
