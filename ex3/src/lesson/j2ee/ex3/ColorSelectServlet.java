package lesson.j2ee.ex3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ColorSelectServlet")
public class ColorSelectServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String btn = request.getParameter("btn");

        HttpSession session =request.getSession(true);

        String colorSelect = request.getParameter("color");
        Integer itemCount=(Integer)session.getAttribute("itemCount");

        if (itemCount==null) {
            itemCount=new Integer(0);
            session.setAttribute("itemCount",itemCount);
        }
        if (btn.equals("history"))
        {
            request.getRequestDispatcher("SelectedBeerColor.jsp").forward(request,response);
        }
        else
        {
            itemCount=new Integer(itemCount.intValue()+1);
            session.setAttribute("Color"+itemCount, colorSelect);
            session.setAttribute("itemCount",itemCount);

            request.getRequestDispatcher("BeerList.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
