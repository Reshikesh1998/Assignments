package com.thinkitive;

public class PrintUtil {
	
	public static void printRecords() 
	{ 
		System.out.println("Records : ");
		System.out.println("*******************************");
		for(Book x: StoreUtil.rlist) 
		{
			System.out.println( x.toString());
			System.out.println();
		}
		System.out.println("*******************************");
	}

}
