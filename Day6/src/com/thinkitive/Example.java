package com.thinkitive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Example {

	
	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		l.add(1);
		l.add(12);
	
		System.out.println(l);
		
		Employee e = Employee.CreateObject("abcdf",1, 100000);
		Employee e2 =  Employee.CreateObject("abcd",2, 10000);
		Employee e3 =  Employee.CreateObject("abc",3, 1000);
		Employee e4 =  Employee.CreateObject("ab",4, 100);
		Employee e5 =  Employee.CreateObject("a",5, 10);
		
		List elist= new ArrayList();
		elist.add(e);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		for (int x =0; x<elist.size();x++) 
		{
			System.out.println(elist.get(x).toString());
		}
		
		
		StackImplementation s1 =new StackImplementation();
		/*s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.pop();
		s1.DisplayStack();
		*/
		s1.addEmployee("abc", 11100011,1);
		s1.addEmployee("abcccs", 11100011,2);
		s1.addEmployee("abcccsdddd", 11100011,3);
		s1.removeEmployee();
		s1.DisplayStack();
		
		EmployeeComparator name = new EmployeeComparator();
		Collections.sort(elist, name);
		System.out.println(elist);
		

	
	}
}
