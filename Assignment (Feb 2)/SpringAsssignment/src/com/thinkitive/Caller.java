package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Employee e = context.getBean(Employee.class);
		e.setEname("abc");
		e.setEsalary(1000000);
		e.setEmpid(1);
		e.hra();
		e.pf();
		System.out.println("Gross Salary :"+e.grosssalary());
		System.out.println("Net Salary :"+e.netsalary());
		
		
		System.out.println(e);
	}
	

	

	
	
	
}
