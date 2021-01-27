package com.thinkitive.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {

	
	public void InsertEmployee(Connection con,int  eid, String ename, int esalary) 
	{
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setInt(3, esalary);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	public void UpdateEmployee(Connection con,int  eid, String ename, int esalary) 
	{
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute("UPDATE employee  Set FirstName = ename , Salary = esalary  where ID=eid ;");  
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	public void DeleteEmployee(Connection con,int  eid) 
	{
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute("DELETE FROM employee where ID=eid; ");  
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	public void Display(Connection con,int  eid) 
	{
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			  
			ResultSet rs = stmt.executeQuery("Select * from employee ");
			while(rs.next()) 
			{
				System.out.println(rs.getInt("Id") +rs.getString("FirstName")+ rs.getInt("Salary") );
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	
	
}
