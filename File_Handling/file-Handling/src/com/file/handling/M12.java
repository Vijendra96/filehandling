package com.file.handling;

import java.io.File;

public class M12 {
	public static void main(String[] args) {
		File f1 = new File("dir1");
		f1.mkdir();
		System.out.println("done");
	}
}

// does not required IOException