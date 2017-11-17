package lesson.j2ee.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInitParam
 */
public class TestInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String date = getServletContext().getInitParameter("Date");
		String name = getServletConfig().getInitParameter("adminName");
		String email = getServletConfig().getInitParameter("adminEmail");
		PrintWriter out = response.getWriter();
		out.println("<html> " 
				+ "<title>Contact Admin</title>"
				+ "<body>"
				+ "<h1 align=center>Contact Admin</h1>" + "<br>"
				+ "<h3>Name: "+name+"</h3>"+ "<br>"
				+ "<h3>Email: "+email+"</h3>"+ "<br>"
				+ "<h5 align=center>"+date+"</h5>" 
				+ "</body>" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
