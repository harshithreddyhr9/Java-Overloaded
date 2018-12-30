package com.collections;

import java.util.List;

public class Utility {
public void printEmpDetails(List<Customer> myList){
	for(Customer c : myList){
		System.out.println(c.getCustomerId()+" "+c.getCustomerName()+" "+c.getCustomerType());
	}
}
}
