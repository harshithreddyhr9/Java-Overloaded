package com.iodemos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIpStream {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		try{
			fis = new FileInputStream("Myfile.txt");
			bis = new BufferedInputStream(fis, 3);
			int data = bis.read();
			while(data!=-1){
			System.out.println((char)data);
			data = bis.read();
			}
			fis.close();
			//bis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
