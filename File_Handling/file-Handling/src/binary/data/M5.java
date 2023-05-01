package binary.data;
//de-serialization  ==> reading object from the file System.
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M5 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("a1.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		A obj1 = (A) in.readObject();
		A obj2 = (A) in.readObject();
		A obj3 = (A) in.readObject();
		A obj4 = (A) in.readObject();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println("done");
	}
}
