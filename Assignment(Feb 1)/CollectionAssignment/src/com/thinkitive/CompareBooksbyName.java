package com.thinkitive;

import java.util.Comparator;

public class CompareBooksbyName {
	
	public static Comparator<Book> COMPARE_BY_Name = new Comparator<Book>() {
	    public int compare(Book one, Book other) {
	        return one.getName().compareTo(other.getName());
	    }
	};


}
