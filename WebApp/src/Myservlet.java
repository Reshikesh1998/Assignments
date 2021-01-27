

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    

	
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
			Cookie ck = new Cookie(usr, "12345");
			
			response.addCookie(ck);
			RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet?sessionid=123");
			rd.forward(request, response);
			System.out.println("in correct tab");
		}
		else 
		{
			System.out.println("try again");
		}
		
	}

}
