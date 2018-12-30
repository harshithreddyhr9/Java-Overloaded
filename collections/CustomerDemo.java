package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerId(1001);
		c1.setCustomerName("mani");
		c1.setCustomerType('P');
		
		Customer c2 = new Customer();
		c2.setCustomerId(1002);
		c2.setCustomerName("phani");
		c2.setCustomerType('G');
		
		List<Customer> cList = new ArrayList<Customer>();
		cList.add(c1);
		cList.add(c2);
		
		Utility ut = new Utility();
		ut.printEmpDetails(cList);
	}
}
