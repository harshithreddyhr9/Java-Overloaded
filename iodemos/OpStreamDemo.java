package com.iodemos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OpStreamDemo {
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("Myfile.txt");
			fos.write('A');
			fos.write('B');
			fos.write(-1);
			fos.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
