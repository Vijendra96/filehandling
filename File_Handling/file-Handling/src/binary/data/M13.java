package binary.data;
//customizing serialization
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//	serialization
class M implements Serializable
{
	int i, j, k;
	M(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	private void writeObject(ObjectOutputStream out) throws Exception
	{
		
		System.out.println("from writeObject");
		out.defaultWriteObject();	//	object content writing 
		out.writeInt(1000);
		out.writeUTF("abc");
	}
	private void readObject(ObjectInputStream in) throws Exception
	{
		in.defaultReadObject();	//	object content reading
		System.out.println("from readObject");
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
	}
}
public class M13 {
	public static void main(String[] args) throws Exception {
		M m1 = new M(10, 20, 30);
		FileOutputStream fout = new FileOutputStream("test1.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(m1);
		System.out.println("----------Diserializaion----------------");	
		FileInputStream fin = new FileInputStream("test1.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		M obj = (M) in.readObject();
		System.out.println(obj.i + ", " + obj.j + ", " + obj.k);
	}
}
