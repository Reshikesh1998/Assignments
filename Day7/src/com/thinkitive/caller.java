package com.thinkitive;

public class caller {

	public static void main(String[] args) {
		Employee e = new Employee(1, "abcd", 222, "ooooo", 453212);
		Employee temp = new Employee();
		System.out.println(e.toString());
		
		e.doSerializable();
		temp = e.doDeserialize();
		System.out.println(temp.toString());
		
	}
	
	
	
}
