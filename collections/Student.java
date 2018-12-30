package com.collections;

 class Student implements Comparable<Student> {
	 int rollno;
	 String name;
	 int age;
	 
	 public Student(int rollno, String name, int age) {
		// TODO Auto-generated constructor stub
		 this.age= age;
		 this.name = name;
		 this.rollno = rollno;
	}
	 public int compareTo(Student st){
		 if(rollno == st.rollno)
			 return 0;
		 else if(rollno>st.rollno)
			 return 1;
		 else
			 return -1;

}
 }
