package lesson.j2ee.ex5;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "GetRequestFilter")
public class GetRequestFilter implements Filter
{
    private FilterConfig config;
    public void destroy()
    {
        this.config = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        String redirectPath = httpRequest.getScheme() + "://"
                + httpRequest.getServerName() + ":" + httpRequest.getServerPort()
                + httpRequest.getContextPath()+"/";
        if(httpRequest.getRequestURI().endsWith(".jsp") && httpRequest.getMethod().equals("GET"))
        {
            HttpServletResponse httpResponse = (HttpServletResponse) resp;
            httpResponse.sendRedirect(redirectPath);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException
    {
        this.config = config;
    }

}
