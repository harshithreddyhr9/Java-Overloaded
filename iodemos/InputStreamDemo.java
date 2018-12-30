package com.iodemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis= new FileInputStream("Myfile.txt");
			//System.out.println(fis.read());
			int data = fis.read();
			while(data != -1){
				System.out.print((char)data);
				data = fis.read();
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		finally {
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
