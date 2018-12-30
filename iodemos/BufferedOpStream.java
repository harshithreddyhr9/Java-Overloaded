package com.iodemos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOpStream {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try{
			fos = new FileOutputStream("Myfile.txt");
			bos = new BufferedOutputStream(fos,3);
			bos.write('a');
			bos.write('C');
			bos.write('b');
			bos.write(-1);
			//bos.flush();//it will flush all the data in the buffer into the file
			fos.close();//it will just close the file op stream 
			//bos.close();//it will auto flush all the data in the buffer before closing the stream
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
