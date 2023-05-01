package binary.data;
//	serialization  ==> writing object into the file system
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	static int i;
	//int j;
	A(int i)
	{
		this.i = i;
	}
	@Override
	public String toString() 
	{
		return "i = " + i;
	}
}
public class M4 {
	public static void main(String[] args) throws Exception{
		A a1 = new A(90);
		A a2 = new A(909);
		A a3 = new A(900);
		A a4 = new A(190);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		FileOutputStream fout = new FileOutputStream("a1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.writeObject(a2);
		out.writeObject(a3);
		out.writeObject(a4);
		out.flush();
		out.close();
	}
}
