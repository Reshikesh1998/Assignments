package com.thinkitive;
import java.sql.*; 
public class CheckConncection {
	public static void main(String args[]){
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/test","root","Reshikesh@1905");  
		 
		Statement stmt=con.createStatement();  
		stmt.execute("create table employee (Id INTEGER, FirstName varchar(255), Salary INTEGER)");  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
