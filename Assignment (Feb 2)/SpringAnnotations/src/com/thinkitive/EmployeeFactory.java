package com.thinkitive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//using factory annotation
@Configuration
public class EmployeeFactory {
   @Bean
   @Scope(scopeName = "prototype")
	public Address getinstance() 
	{
		return new Address();
	}

}
