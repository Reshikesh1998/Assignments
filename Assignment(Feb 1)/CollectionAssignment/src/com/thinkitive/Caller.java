package com.thinkitive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Caller {
	
	
	public static void main(String[] args) {
		
		
		
		Caller c = new Caller();
		
		Set<String>  s = new HashSet<String>();
		
		s.add("mk");
		s.add("rk");
		
		c.addRecords("reshi", 1,s, 10200);
		c.addRecords("anil", 2, s, 10040);
		c.addRecords("sar", 3, s, 10050);
		c.addRecords("uri", 4, s, 12000);
		c.getNoofBooks();
		c.PrintListofBooks();
		c.SortBookbyPrice();
		c.SortBookbyName();
		
	}
	
	
	StoreUtil su = new StoreUtil();
	public void addRecords(String name, int id, Set<String> authors, int price ) 
	{
		Book b = new Book(id, name, authors, price);
		su.addRecords(b);
	}
	
	public void getNoofBooks() 
	{
		System.out.println( "total number of books : " + su.getNumofRecords());
		
	}
	
	public void PrintListofBooks() 
	{
	PrintUtil p = new PrintUtil();
	p.printRecords();
	}
	
	public void SortBookbyName() 
	{
		SortUtils s = new SortUtils();
		s.sortByName();
	}
	public void SortBookbyPrice() 
	{
		SortUtils s = new SortUtils();
		s.sortByPrice();
	}
	

	
	
	
	
}
