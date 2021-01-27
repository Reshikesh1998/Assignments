package com.thinkitive;

public class second extends Thread{

	
	
	
	
	@Override
	public void run() {
		//TableGenerator tg = new TableGenerator();
	TableGenerator e =	Example.create();
		e.calculate(11);
	}
}

