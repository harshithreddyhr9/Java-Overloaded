package com.iodemos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("Myfile.txt");
			fw.write("i am akhil");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try{
				if(fw!=null){
					fw.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
