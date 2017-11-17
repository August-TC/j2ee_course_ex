package lesson.j2ee.ex5;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "HeaderFilter")
public class HeaderFilter implements Filter
{
    public void destroy()
    {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        ServletResponse newResponse = resp;
        if (req instanceof HttpServletRequest)
        {
            newResponse = new CharResponseWrapper(
                    (HttpServletResponse) resp);
        }

        chain.doFilter(req, newResponse);

        if (newResponse instanceof CharResponseWrapper)
        {

            String text = newResponse.toString();
            if (text != null)
            {
                text = "This is an included section!<br>"+text;
                resp.getWriter().write(text);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException
    {

    }

}
