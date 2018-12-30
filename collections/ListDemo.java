package com.collections;
import java.util.ArrayList;
import java.util.Iterator;;
public class ListDemo {public static void main(String[] args) {
	ArrayList<Integer> myList = new ArrayList<Integer>();
	myList.add(1234);
	myList.add(12);
	myList.add(3746);
	System.out.println(myList);
	for(Integer i : myList){
		System.out.println(i);
	}
	Iterator<Integer> it = myList.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
	
}
