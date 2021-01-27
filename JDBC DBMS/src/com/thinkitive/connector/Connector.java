package com.thinkitive.connector;
import java.sql.*; 

public class Connector {
	public static void main(String args[]){
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","Reshikesh@1905");   
			
			Crud cd = new Crud();
			cd.InsertEmployee(con, 1, "Reshi", 2);
			cd.InsertEmployee(con, 2, "Resh", 3);
			cd.InsertEmployee(con, 3, "Resi", 4);
			con.close();
			
			
			
			
		
		
		}catch(Exception e){ System.out.println(e);}  
		  
	
	
	

	}
	}


