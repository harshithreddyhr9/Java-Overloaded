package com.threading;

class Numbers {
	int j=0;
	public synchronized void printnumbers() {
		if(j==0){
		for (int i = 1; i <= 26; i++) {
			System.out.print(i + ":");
			
			try {
				if(j==0){
					j=1;
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		if(j==1){
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
			try {
				if(j==1){
					j=0;
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}}
	

	/*public synchronized void printAlphabets() {
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}*/
}

class Alphabets extends Thread {
	Numbers n;

	Alphabets(Numbers n) {
		this.n = n;
	}

	public void run() {
		n.printnumbers();
	}
}

class Number extends Thread {
	Numbers n;

	Number(Numbers n) {
		this.n = n;
	}

	public void run() {
		n.printnumbers();
	}
}

public class Activity {
	public static void main(String[] args) {
		Numbers num = new Numbers();
		Number n = new Number(num);
		Alphabets a = new Alphabets(num);
		n.start();
		a.start();

	}

}
