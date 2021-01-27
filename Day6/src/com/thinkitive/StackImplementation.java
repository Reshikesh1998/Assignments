package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class StackImplementation<T> {

	List<Employee> elist = new ArrayList<Employee>();
	
	
	public void addEmployee( String ename, int esalary, int eid) 
	{
		Employee e =  Employee.CreateObject(ename, esalary, eid);
		elist.add(e);
		
	}
	
	public void removeEmployee() 
	{
		elist.remove(elist.size()-1);
	}
	
	public void DisplayStack() 
	{
		System.out.println(elist);
	}
}
