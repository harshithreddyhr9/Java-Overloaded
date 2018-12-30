package com.threading;
class Customer{
	int balance = 10000;
	synchronized void withdraw(int amount){
		System.out.println("withdrawing cash....");
		if(this.balance<amount){
			System.out.println("Error! less balance");
			try {
				System.out.println("waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance-=amount;
		System.out.println("withdraw completed...");
		System.out.println(this.balance);
	}
	synchronized void deposit(int num){
		System.out.println("depositing cash");
		this.balance+=num;
		System.out.println("deposit complete");
		notify();
	}
}

public class WaitandNotify {
public static void main(String[] args) {
	 final Customer c= new Customer();
	new Thread(){
	public void run(){c.withdraw(15000);}
	}.start();
	new Thread(){
		public void run(){c.deposit(10000);}
		}.start();
	
}
}
