package com.iodemos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("Myfile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student)ois.readObject();
			System.out.println(s1.studentId+" "+s1.studentName);
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("success");
	}

}
