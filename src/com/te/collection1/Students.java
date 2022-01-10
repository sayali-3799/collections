package com.te.collection1;

public class Students {
	int rollNO;
	String name;
	int marks;
	public Students(int rollNO, String name, int marks) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [rollNO=" + rollNO + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
