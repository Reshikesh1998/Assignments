package com.thinkitive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView welcom(String uname, String upass) {
		ModelAndView model = new ModelAndView();
		System.out.println("You reached your destination");
		if(uname.equals("admin") && upass.equals("admin")) 
		{
		System.out.println(uname);
		
		model.addObject("message", "hello welcome buddy");
		model.setViewName("Welcom.jsp");
		}
		else 
		{
			model.addObject("message", "hello buddy wrong pass or uname" );
			model.setViewName("index.jsp");

		}
		return model;
		
		
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String bye(String uname,String uemail, String upass) {
		
		System.out.println("You reached your destination");
		
		System.out.println("Welcome : " + uname);
		System.out.println("your pass is :" +  upass);
		System.out.println("your email is " + uemail);
		return "Welcom.jsp";
		
		
	}


}
