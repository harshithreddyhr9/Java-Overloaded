package com.collections;
import java.util.*;
public class SetDemo {
public static void main(String[] args) {
	Set<String> mySet1 = new HashSet<String>();
	boolean flag1 = mySet1.add("123");
	System.out.println(flag1);
	flag1 = mySet1.add("123");
	System.out.println(flag1);
	mySet1.add("4654");
	mySet1.add(null);
	mySet1.add("ddjhs");
	System.out.println(mySet1);
	Set<String> mySet2 = new LinkedHashSet<String>();//tree set does not accept null where as 
	mySet2.add("123"); // hash set and linked hash set accepts null
	mySet2.add(null);
	mySet2.add(null);
	mySet2.add("4654");
	mySet2.add("ddjhs");
	System.out.println(mySet2);
}
}
