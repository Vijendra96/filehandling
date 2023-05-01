package binary.data;
//	di - serialization
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M12 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("a4.txt");
		ObjectInputStream bin = new ObjectInputStream(fin);
		J obj = (J) bin.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}
