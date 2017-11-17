package lesson.j2ee.ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowBrownBeer extends HttpServlet {

	/**
	 * The doGet method implements the request and response between browser and
	 * server
	 * 
	 * @param request
	 *            the browser request
	 * @param response
	 *            the server response
	 * 
	 * @throws IOException
	 *             if there are errors from the input
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		String colorParam = "Brown";
        request.setAttribute("color",colorParam);
		request.getRequestDispatcher("ShowBrownBeer.jsp").forward(request,response);

//		PrintWriter out = response.getWriter();
//		out.println("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\n" +
//				"    pageEncoding=\"ISO-8859-1\"%>\n" +
//				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
//				"<jsp:include page=\"Header_act.jsp\">\n" +
//				"\t<jsp:param name=\"subTitle\" value=\"Welcome to the Amber Beer World!\"/>\n" +
//				"</jsp:include>\n" +
//				"<jsp:include page=\"DisplayItem.jsp\" />");
//		out.println("<html> " + "<body>"
//				+ "<h1 align=center>Beer Color</h1>" + "<hr><br>"
//				+ "You selected beer color is: " + colorParam +
//				"<br>" + "Sorry, The brown beer have selled out !" + "</body>" + "</html>");
	}

}
