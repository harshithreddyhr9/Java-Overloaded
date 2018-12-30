package com.threading;

public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		try{
			t1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
	}
}
