package com.thinkitive;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagDescription  extends TagSupport {
	private String message;
	private Integer factorial;
	
	
@Override
public int doStartTag() throws JspException {
	
	JspWriter out = pageContext.getOut();
	try {
		out.println("heloo...!!!" + message + fact(factorial));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return super.doStartTag();
}

public int fact(Integer a) 
{   int ans =1;
	for (int i =a ; i>0 ; i--) 
	{
		ans = ans*i;
	}
	return ans;
	}



public String getMessage() {
	return message;
}



public void setMessage(String message) {
	this.message = message;
}

public Integer getFactorial() {
	return factorial;
}

public void setFactorial(Integer factorial) {
	this.factorial = factorial;
}





}
