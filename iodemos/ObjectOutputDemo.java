package com.iodemos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputDemo {
	public static void main(String[] args) {
		try{
		Student s1 = new Student(1001, null);
		FileOutputStream fos = new FileOutputStream("Myfile.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(s1);
		out.flush();
		out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("success");
		}

}
