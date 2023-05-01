package file.handling;
//	to write the content in the file
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A1 {
	public static void main(String[] args) throws IOException{
		FileWriter fout = new FileWriter("text1.txt", true);
		BufferedWriter bout = new BufferedWriter(fout);
		bout.write("1st line content");
		bout.newLine();
		bout.write("2nd line content");
		bout.newLine();
		bout.write("3rd line content");
		bout.newLine();
		bout.write("4th line content");
		bout.newLine();
		bout.write("5th line content");
		bout.newLine();
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("done");
	}
}
