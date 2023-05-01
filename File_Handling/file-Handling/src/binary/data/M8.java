  package binary.data;
//	di - serialization
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M8 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("a2.txt");
		ObjectInputStream bin = new ObjectInputStream(fin);
		D obj = (D) bin.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}
