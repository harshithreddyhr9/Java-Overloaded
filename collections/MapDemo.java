package com.collections;
import java.util.*;


public class MapDemo {
public static void main(String[] args) {
	Map<String, Integer> myMap = new TreeMap<String, Integer>();
	myMap.put("bengaluru",3);
	myMap.put("mumbai",2);
	myMap.put("Hyderabed",1);
	
	System.out.println(myMap);
	//myMap.put(null, "chennai");
	Set<String> keys = myMap.keySet();
	System.out.println(keys);
	Collection<Integer> values = myMap.values();
	System.out.println(values);
	for(Map.Entry<String, Integer> m:myMap.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
}
}
