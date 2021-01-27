package httpsessionexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ExampleFilter
 */
@WebFilter("/httpsessionexample")
public class ExampleFilter implements Filter {


    public ExampleFilter() {
        
    }

	
	public void destroy() {
	
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		PrintWriter out = response.getWriter();
		out.println("Pre filter");
		String name = request.getParameter("uname");
		String pass	= request.getParameter("upass");
		if (name.equals("") || pass.equals("")) 
		{
			
			System.out.println("empty fields");
			
		}
		else 
		{
		chain.doFilter(request, response);
		out.println("Post filter");}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
