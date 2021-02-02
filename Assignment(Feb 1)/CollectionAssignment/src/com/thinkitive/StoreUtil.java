package com.thinkitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StoreUtil {
	public static List<Book> rlist = new ArrayList<Book>();
	
	public void addRecords(Book book ) 
	{
		rlist.add(book);
	}
	
	public List<Book> getRecords() 
	{
		
		return rlist;
		
		
		
		
	}
	
	public int getNumofRecords() 
	{
		return rlist.size();
	
	}
	

}
