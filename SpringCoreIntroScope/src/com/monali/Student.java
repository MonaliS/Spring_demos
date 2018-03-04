package com.monali;

public class Student {
	private String name;
	private int rollNo; 
   
	//xml file have constructor based dependency injection
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
