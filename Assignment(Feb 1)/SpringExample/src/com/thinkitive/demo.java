package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		
	
	ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
	
	Employee e = context.getBean(Employee.class);
	e.hello();
	
	}
}
