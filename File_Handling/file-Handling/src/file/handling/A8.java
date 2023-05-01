package file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A8 {
	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("details.txt");
		BufferedReader bread = new BufferedReader(file);
		Person person;
		ArrayList list = new ArrayList();
		String s1 = bread.readLine();
		String[] words;
		while(s1 != null)
		{
			person = new Person();
			words = s1.split(" ");
			person.firstName = words[0];
			person.lastName = words[1];
			person.age = Integer.parseInt(words[2]);
			person.address = words[3];
			list.add(person);
			s1 = bread.readLine();
		}
		for(Object obj : list)
		{
			person = (Person)obj;
			System.out.println(person.firstName + ", " + person.lastName + ", " + person.age + ", " + person.address); 
		}
	}
}
