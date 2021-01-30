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
		
		String word = request.getParameter("word");
		DBConnection db = new DBConnection();
		String meaning = db.SearchMeaning(word);
		RequestDispatcher rd =  request.getRequestDispatcher("Dictionary.jsp");
		request.setAttribute("meaning", meaning );
		rd.forward(request, response);
		
	}

}
