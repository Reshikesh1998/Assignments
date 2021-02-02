package com.thinkitive;

import java.util.Collections;

public class SortUtils {
	
	public static void sortByName() 
	{
		Collections.sort(StoreUtil.rlist, CompareBooksbyName.COMPARE_BY_Name);
		System.out.println("Records  sorted by name: ");
		System.out.println("*******************************");
		for(Book x: StoreUtil.rlist) 
		{
			System.out.println(x.toString());
			System.out.println();
		}
		System.out.println("*******************************");
	}
	
	public static void sortByPrice() 
	{
		Collections.sort(StoreUtil.rlist, CompareBooksbyPrice.COMPARE_BY_Price);
		System.out.println("Records Sorted by pricce: ");
		System.out.println("*******************************");
		for(Book x: StoreUtil.rlist) 
		{
			System.out.println(x.toString());
			System.out.println();
		}
		System.out.println("*******************************");
		
	}

}
