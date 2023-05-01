package binary.data;
//	most advanced customization // best approach
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class N implements Externalizable
{
	int i, j, k;
	N(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	N()
	{
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeInt(1000);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		System.out.println(in.readInt());
	}
}
public class M14 {
	public static void main(String[] args) throws Exception {
		N n1 = new N(10, 20, 30);
		FileOutputStream fout = new FileOutputStream("test2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		n1.writeExternal(out);
		out.flush();
		out.close();
		System.out.println("----Diserialization---------");
		N n2 = new N();
		FileInputStream fin = new FileInputStream("test2.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		n2.readExternal(in);
		System.out.println(n2.i +", " + n2.j +", " + n2.k);
	}
}
