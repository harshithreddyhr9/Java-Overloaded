package com.iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args)  {
		InputStreamReader ins = null;
		BufferedReader br = null;
		
			ins = new InputStreamReader(System.in);
			br = new BufferedReader(ins);
			System.out.println("enter your name");
			String name;
			try {
				name = br.readLine();
				System.out.println(name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

}
}
