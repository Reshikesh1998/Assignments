package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a =  Integer.parseInt(request.getParameter("First_number"));
		int b =  Integer.parseInt(request.getParameter("Second_number"));
		String operator = request.getParameter("operation");
		ModelCalculator m = new ModelCalculator();
		Integer ans = null;
		PrintWriter out = response.getWriter();
		
		if(operator.equals("1")) 
		{
			ans = m.add(a, b);
		}
		else if(operator.equals("2")) 
		{
			ans=m.sub(a, b);
			
		}
		
		else if(operator.equals("3")) 
		{
			ans=m.mul(a, b);
			
		}
		
		else if(operator.equals("4")) 
		{
			ans=m.div(a, b);
			
		}
		

		
		request.setAttribute("Answer", ans);
		RequestDispatcher rd =  request.getRequestDispatcher("CalculatorView.jsp");
		rd.forward(request, response);
	}

}
