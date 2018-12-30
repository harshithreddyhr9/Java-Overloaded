package com.threading;

public class MyRunnable implements Runnable{
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
		System.out.println(Thread.currentThread().getName());
		MyRunnable myThread = new MyRunnable();
		Thread t1 = new Thread(myThread);
		t1.setName("T1");
		t1.start();
		/*try{
			t1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}*/
		
		Thread t2 = new Thread(myThread);
		t2.setName("T2");
		t2.start();
	} 
}
