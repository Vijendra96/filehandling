package binary.data;
//	di - serialization
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M10 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("a3.txt");
		ObjectInputStream bin = new ObjectInputStream(fin);
		G obj = (G) bin.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}
