package file.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class A9 {
	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("employees.txt");
		BufferedReader bread = new BufferedReader(file);
		ArrayList list = new ArrayList();
		String s1 = bread.readLine();
		String[] words;
		Employees employee;
		while(s1 != null)
		{
			employee = new Employees();
			words = s1.split(" ");
			employee.firstName = words[0];
			employee.lastName = words[1];
			employee.age = Integer.parseInt(words[2]);
			employee.email = words[3];
			list.add(employee);
			s1 = bread.readLine();
		}
		for(Object obj : list)
		{
			employee = (Employees)obj;
			System.out.println(employee.firstName +", " + employee.lastName + ", " + employee.age + ", " + employee.email);
		}
	}
}
