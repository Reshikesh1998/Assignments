package com.thinkitive;

import org.springframework.stereotype.Service;

@Service
public class Operations {
	
	public int add(int a, int b) 
	
	{
		return a+b;
	}
	
	public int sub(int a, int b) 
	{
		return a-b;
	}
	
	public int mul(int a, int b) 
	{
		return a*b;
	}
	
	public int div(int a, int b) 
	{
		return a/b;
	}

}
