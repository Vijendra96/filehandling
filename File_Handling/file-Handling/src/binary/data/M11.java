package binary.data;
//	serialization
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class H
{
	int i; 
	H()
	{
		System.out.println("H(int)");
	}
}
class I extends H 
{ 
	int j;
	I()
	{
		System.out.println("I(int)");
	}
}
class J extends I implements Serializable
{ 
	int k;
	J()
	{
		System.out.println("J(int)");
	}
}

public class M11 {
	public static void main(String[] args) throws Exception{
		J j1 = new J();
		j1.i = 10;
		j1.j = 20;
		j1.k = 30;
		FileOutputStream fout = new FileOutputStream("a4.txt");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		bout.writeObject(j1);
		bout.flush();
		bout.close();
		fout.close();
	}
}