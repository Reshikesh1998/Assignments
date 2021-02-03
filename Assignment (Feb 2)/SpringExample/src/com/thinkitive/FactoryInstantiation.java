package com.thinkitive;

public class FactoryInstantiation {

	
	public Address getinstance() 
	{ 
		System.out.println("factory called");
		return new Address();
	}
}
