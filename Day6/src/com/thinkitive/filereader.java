package com.thinkitive;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class filereader {

	public static void main(String[] args) {
		readfile();
		
	}
	public static void readfile() {
		
		ArrayList l =new  ArrayList();
		l.add("a");
		l.add("e");
		l.add("i");
		l.add("o");
		l.add("u");
		
		
		try (FileReader fr = new FileReader("1.txt");){
			
			int i =0;
			while((i =fr.read()) !=  -1) 
			{
				
				if(l.contains((char)(i))) 
				{
					try {
						FileWriter fw = new FileWriter("proxy.txt");
						fw.write((char)i);
						fw.close();
						
					} catch (IOException e) {
						
					}
					
				}
				else 
				{
					try {
						FileWriter fw = new FileWriter("proxy.txt");
						fw.write((char)i);
						fw.close();
						
					} catch (IOException e) {
						
					}
					
				}
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
