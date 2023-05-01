package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class M1 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fr);
		Person person;
		ArrayList list = new ArrayList();
		String s1 = br.readLine();
		String[] words;
		while(s1 != null)
		{
			person = new Person();
			words = s1.split(" ");
			person.firstName = words[0];
			person.lastName = words[1];
			person.age = Integer.parseInt(words[2]);
			list.add(person);
			s1 = br.readLine();
		}
		
		for(Object obj : list)
		{
			person = (Person)obj;
			System.out.println("First Name = " + person.firstName +", Last Name = " +  person.lastName + ", Age = " +  person.age);
		}
	}
}
