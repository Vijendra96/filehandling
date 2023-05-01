package com.file.handling;

import java.io.File;

public class M21 {
	public static void main(String[] args) {
		File src = new File("D:\\JDK8.0\\bin");
		File[] members = src.listFiles();
		int fileCount = 0;
		int dirCount = 0;
		for(File member : members)
		{
			if(member.isFile())
			{
				fileCount++;
			}else
			{
				dirCount ++;
			}
		}
		System.out.println("files count : " + fileCount);
		System.out.println("files count : " + dirCount);
	}
}
