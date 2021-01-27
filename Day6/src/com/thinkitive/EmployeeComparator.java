package com.thinkitive;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		if (e1.getEsalary() > e2.getEsalary()) 
		{
			return -1;
		}
		else
			
		return 0;
	}

}
