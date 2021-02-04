package com.thinkitive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public  class Calculator {
@Autowired	
Operations o;
	@RequestMapping(value = "/calculator")
	public ModelAndView caller(int firstnumber , int secondnumber, String operator ) 
	{
		
		
		ModelAndView model = new ModelAndView();
		
		int ans = 0;
		
		if(operator.equals("+")) 
		{
			ans = o.add(firstnumber, secondnumber);
		}
		if(operator.equals("-"))
		{
			ans = o.sub(firstnumber, secondnumber);
		}
		if(operator.equals("*")) 
		{
			ans = o.mul(firstnumber, secondnumber);
		}
		if(operator.equals("/"))
		{
			ans = o.div(firstnumber, secondnumber);
		}
		
		model.addObject("ans", ans);
		model.setViewName("index.jsp");
		return model;
	}

}
