package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student st = new Student(1002,"vishnu" ,23);
		Student st1 = new Student(1001, "akhil", 22);
		Student st2 = new Student(1005, "mahesh", 27);
		list.add(st);
		list.add(st1);
		list.add(st2);
		for(Student s:list){
			System.out.println(s.age+" "+s.name+" "+s.rollno);
		}
		Collections.sort(list);
		for(Student s:list){
			System.out.println(s.age+" "+s.name+" "+s.rollno);
		}
	
	}

}
