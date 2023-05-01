package com.files;

import java.io.File;

public class M8 {
	public static void main(String[] args) {
		File file = new File("E:\\file-handling\\file-HandlingFile\\");
		File[] member = file.listFiles();
		int fileCount = 0;
		int dirCount = 0;
		for(File files : member)
		{
			if(files.isFile())
			{
				fileCount ++;
			}
			else
			{
				dirCount++;
			}
		}
		System.out.println("total files are : " + fileCount);
		System.out.println("total directories are : " + dirCount);
	}
}
