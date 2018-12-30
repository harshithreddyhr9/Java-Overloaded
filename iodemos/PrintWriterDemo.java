package com.iodemos;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {
public static void main(String[] args) {
	PrintWriter writer = new PrintWriter(System.out);
	writer.write("hello world");
	writer.flush();// if not present data will not be gven to console
	writer.close();//same atleast one should be there either close or flush
	try{
		
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("myfile1.txt"));
		writer1.write("abc");
		writer1.flush();
		writer1.close();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
