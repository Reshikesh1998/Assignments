package com.thinkitive;

import java.util.Comparator;

public class CompareBooksbyPrice {
	
	public static Comparator<Book> COMPARE_BY_Price = new Comparator<Book>() {
	    public int compare(Book one, Book other) {
	        return one.getPrice().compareTo(other.getPrice());
	    }
	};
	
}
