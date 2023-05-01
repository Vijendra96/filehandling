package binary.data;
//	serialization
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable
{
	int i; 
	B()
	{
		System.out.println("B(int)");
	}
}
class C extends B
{ 
	int j;
	C()
	{
		System.out.println("C(int)");
	}
}
class D extends C
{ 
	int k;
	D()
	{
		System.out.println("D(int)");
	}
}

public class M7 {
	public static void main(String[] args) throws Exception{
		D d1 = new D();
		d1.i = 10;
		d1.j = 20;
		d1.k = 30;
		FileOutputStream fout = new FileOutputStream("a2.txt");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		bout.writeObject(d1);
		bout.flush();
		bout.close();
		fout.close();
	}
}

//	while di serializing no constructor is involving
