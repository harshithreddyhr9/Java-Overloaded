package com.collections;
import java.util.LinkedList;
public class ArrayListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.add(1234);
		myList.add(12);
		myList.addFirst(4545);
		myList.add(3746);
		myList.add(2, 6545884);
	System.out.println(myList.get(4));
		/*System.out.println(myList);
		for(Integer i : myList){
			System.out.println(i);
		}
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}
}
