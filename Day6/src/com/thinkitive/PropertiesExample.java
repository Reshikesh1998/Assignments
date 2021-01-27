package com.thinkitive;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args){
		Properties prop = new Properties();
		FileReader fr;
		try {
			fr = new FileReader("Example.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//prop.load(fr);
		
		
		
	}
}
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		



