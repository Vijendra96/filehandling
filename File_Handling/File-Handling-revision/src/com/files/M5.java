package com.files;

import java.io.File;

public class M5 {
	public static void main(String[] args) {
		File file = new File("E:\\file-handling\\file-HandlingFile\\");
		File[] member = file.listFiles();
		for(File files : member)
		{
			System.out.println(files.getName() + (files.isFile() ? " is a file" : " is a directory"));
		}
	}
}
