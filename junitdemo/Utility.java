package com.junitdemo;
import java.io.*;
import java.io.FileInputStream;

public class Utility {
	public int add(int num1, int num2){
		int num3= num1+num2;
		return num3;
	}
	public boolean validate(int num1, int num2){
		if(num1<0||num2<0){
			return false;
		}else{
			return true;				
		}
	}
	public double test(int num1, int num2){
		double r = num1/num2;
		return r;
	}
	@SuppressWarnings("resource")
	public void openFile(String filename) throws FileNotFoundException{
		@SuppressWarnings("unused")
		FileInputStream fi = new FileInputStream(filename);
		
	}
}
