package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		
		
		String operator = request.getParameter("operation");
		MyDbConnection db = new MyDbConnection();
		
		if (operator.equals("4")) 
		{
			List l=db.displayEmployee();
			request.setAttribute("ListofEmployees", l );
			

			RequestDispatcher rd =  request.getRequestDispatcher("EmployeeView.jsp");
			rd.forward(request, response);
		}
		else {
		
		int eid =  Integer.parseInt(request.getParameter("eid"));
		String ename =  request.getParameter("ename");
		int esalary =  Integer.parseInt(request.getParameter("eid"));
		
		

		PrintWriter out = response.getWriter();
		
		if(operator.equals("1")) 
		{
			db.InsertEmployee(eid, ename, esalary);
			response.sendRedirect("EmployeeView.jsp");
		}
		else if(operator.equals("2")) 
		{
			db.deleteEmployee(eid, ename, esalary);
			response.sendRedirect("EmployeeView.jsp");
			
		}
		
		else if(operator.equals("3")) 
		{
			db.updateEmployee(eid, ename, esalary);
			response.sendRedirect("EmployeeView.jsp");
			
		}
		
		}

		
	
	}

}
