package com.collections;

import java.util.List;

public class CustomerDemo1 {
public static void main(String[] args) {
	Utility1 ut = new Utility1();
	List<Customer> List = ut.printEmpDetails();
	for(Customer c : List){
		System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getCustomerType());
	}
}
}
