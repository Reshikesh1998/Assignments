package com.thinkitive;

import java.util.List;

public class demo {
	
	public static void main(String[] args) {
		
		DBConnection db = new DBConnection();
		//List l = db.SearchEmployee("re");
		//System.out.println(l);
		db.AddAddress(41101, "pune");
	}

}
