 package binary.data;
//	serialization
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class E
{
	int i; 
	E()
	{
		System.out.println("E(int)");
	}
}
class F extends E implements Serializable
{ 
	int j;
	F()
	{
		System.out.println("F(int)");
	}
}
class G extends F
{ 
	int k;
	G()
	{
		System.out.println("G(int)");
	}
}

public class M9 {
	public static void main(String[] args) throws Exception{
		G g1 = new G();
		g1.i = 10;
		g1.j = 20;
		g1.k = 30;
		FileOutputStream fout = new FileOutputStream("a3.txt");
		ObjectOutputStream bout = new ObjectOutputStream(fout);
		bout.writeObject(g1);
		bout.flush();
		bout.close();
		fout.close();
	}
}