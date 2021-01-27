package com.thinkitive;

public class TableGenerator {

	
	public  synchronized void calculate (int num) 
	{
		
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(i*num);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
