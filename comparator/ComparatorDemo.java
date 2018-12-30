package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparatorDemo {
public static void main(String[] args) {
	List<Student> list1 = new ArrayList<Student>();
	list1.add(new Student(1001, "akhil", 29));
	list1.add(new Student(1011, "harshith", 25));
	list1.add(new Student(1006, "mahesh", 21));
	System.out.println("before sortiing");
	for(Student s:list1){
		System.out.println(s.age+" "+s.name+" "+s.rollno);
	}
	System.out.println("sorting by age");
	Collections.sort(list1, new AgeComparator());
	for(Student s:list1){
		System.out.println(s.age+" "+s.name+" "+s.rollno);
	}
	System.out.println("sorting by name");
	Collections.sort(list1, new NameComparator());
	for(Student s:list1){
		System.out.println(s.age+" "+s.name+" "+s.rollno);
	}


}
}
