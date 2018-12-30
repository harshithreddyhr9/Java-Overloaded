package day2;

import java.util.Scanner;

public class Assign {
	public static int a[] = {1000,1001,1002,1003,1004};
	public static double b[] = {3000,5000,1000,1200,600};
	public static void main(String[] args) {
		 
		Assign as = new Assign();
		for(int j=0;j<5;j++)
			System.out.print(a[j]+"\t");
		System.out.println();
		for(int j=0;j<5;j++)
			System.out.print(b[j]+"\t");
		System.out.println();
		Scanner s = new Scanner(System.in);
		int acno = s.nextInt();
		double balance = s.nextDouble();
		//assert balance > 10000.0 : "not a valid balance";
		try{
			as.withdraw(acno,balance);
		}catch(Exception e){
			System.out.println(e);
		}
		for(int j=0;j<5;j++)
			System.out.print(a[j]+"\t");
		System.out.println();
		for(int j=0;j<5;j++)
			System.out.print(b[j]+"\t");
		System.out.println();
		s.close();
	}
public void withdraw(int acc, double bal) throws InvalidNumberException{
	int count1=0,index=0;

	for(int i=0;i<5;i++){
		if(a[i] == acc){
			count1=1;
			index = i;
		}
	}
	if(count1 == 1){
		System.out.println("valid account number");
	}else{
		throw new InvalidNumberException("not a valid account number");
	}
	if(b[index]<bal){
		throw new InvalidNumberException("no sufficient balance in your account");
	}else{
		System.out.println("please collect your money "+bal);
		b[index]-=bal;
		System.out.println("remaining balance is "+b[index]);
	}
}
}
