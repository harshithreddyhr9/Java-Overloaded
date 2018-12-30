package com.threading;

class Share {
	public /*synchronized*/ void printTable(int num) {
		// synchronized (this){
		for (int i = 1; i < 5; i++) {
			System.out.println(i*num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//}
	}
}
class DemoThread1 extends Thread{
	Share s;
	public DemoThread1(Share s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	public void run(){
		s.printTable(10);
	}
}
class DemoThread2 extends Thread{
	Share s;
	public DemoThread2(Share s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}
	public void run(){
		s.printTable(3);
	}
}
public class SynchronizationDemo {
public static void main(String[] args) {
	Share s = new Share();
	DemoThread1 d1 = new DemoThread1(s);
	DemoThread2 d2 = new DemoThread2(s);
	d1.start();
	d2.start();
}
}
