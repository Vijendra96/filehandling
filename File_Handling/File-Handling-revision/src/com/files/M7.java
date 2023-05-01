package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class M7 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("E:/des.jpg");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] allBytes = new byte[(int) new File("E:/des.jpg").length()]; 
		bin.read(allBytes);
		bin.close();
		fin.close();
		
		
		FileOutputStream fout = new FileOutputStream("a1.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(allBytes);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done .....");
	}
}
