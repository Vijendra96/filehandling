package com.file.handling;

import java.io.File;

public class M20 {
	public static void main(String[] args) {
		File src = new File("D:\\JDK8.0\\bin");
		File[] members = src.listFiles();
		for(File member : members)
		{
			System.out.println(member.getName() + " : " + (member.isFile() ? " file" : " directory"));
		}
	}
}
