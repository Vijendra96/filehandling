package file.handling;
//	to read the file line by line 
//	this is the best content
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A3 {
	public static void main(String[] args) throws IOException{
		FileReader fin = new FileReader("text1.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		while(s1 != null)	//to check 1st is available is not?
		{
			System.out.println(s1);	// to read the line
			s1 = bin.readLine();	//to read the second line
		}
	}
}
