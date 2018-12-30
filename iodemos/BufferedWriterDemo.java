package com.iodemos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		

	try{
		FileWriter fw = new FileWriter("Myfile.txt");
		BufferedWriter bw = new BufferedWriter(fw,3);
		bw.write("hello");
		bw.write("i am");
		bw.write("akhil");
		//bw.write("arigato");
		fw.close();// it will give 3 bytes of data as output
		//bw.flush();
		//bw.close();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	
	}
}
