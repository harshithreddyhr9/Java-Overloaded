package com.iodemos;

import java.io.Serializable;

public class Student implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int studentId;
String studentName;
public Student(int studentId, String studentName){
	this.studentId = studentId;
	this.studentName = studentName;
}
}
