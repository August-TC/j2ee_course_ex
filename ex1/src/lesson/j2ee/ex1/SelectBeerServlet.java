package lesson.j2ee.ex1;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class SelectBeerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException { 
		String colorParam = request.getParameter("color"); 
		
		if(colorParam.equals("brown"))
		{
			response.sendRedirect("BrownBeer");
		}
		else if(colorParam.equals("dark"))
		{
			dispatch(request,response,"DarkBeer");
		}
		else if(colorParam.equals("light"))
		{
			dispatch(request,response,"LightBeer");
		}
		else if(colorParam.equals("amber"))
		{
			dispatch(request,response,"AmberBeer");
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.println("<html> " + "<body>"
					+ "<h1 align=center>Beer Color</h1>" + "<br>"
					+ "My selected beer color is: "+colorParam+"</body>" + "</html>");
		}
		
	}

	private void dispatch(HttpServletRequest request, HttpServletResponse response, String url) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher(url).forward(request, response);
		
	}
}
