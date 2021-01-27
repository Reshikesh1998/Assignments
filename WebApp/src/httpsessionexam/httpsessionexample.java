package httpsessionexam;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class httpsessionexample
 */
@WebServlet("/httpsessionexample")
public class httpsessionexample extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public httpsessionexample() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter();
		String usr = request.getParameter("uname");
		String upass = request.getParameter("upass");
		System.out.println(usr + upass);
		if(usr.equals("admin")  && upass.equals("admin")) 
			
			
		{ 
			HttpSession session = request.getSession();
			//response.sendRedirect("Profilepage");
			if(session.getAttribute("visit") == null) {
			session.setAttribute("visit", "1");}
			else 
			{   String s = (String) session.getAttribute("visit");
				int a = Integer.parseInt(s) + 1;
				session.setAttribute("visit",String.valueOf(a));
				out.println("count : "+session.getAttribute("visit"));
			}
			
			
		}
		else 
		{
			out.println("login unsuccessful");
		}
	}

}
