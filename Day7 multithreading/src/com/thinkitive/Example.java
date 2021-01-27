package com.thinkitive;

public class Example extends Thread {
	static TableGenerator e = new TableGenerator();
	public static TableGenerator  create() 
	{
		
		
		
		return e;
	}
	
	
	@Override
	public void run() {
		
	
	
	e.calculate(6);
	
	}

}
