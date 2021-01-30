package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Connector")
public class Connector extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Connector() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("ename");
		DBConnection db = new DBConnection();
		List l = db.SearchEmployee("re");
		System.out.println(l);
		
		RequestDispatcher rd = request.getRequestDispatcher("SearchEmployee.jsp");
		request.setAttribute("EmployeeDetails", l);
		rd.forward(request, response);
	}

}
