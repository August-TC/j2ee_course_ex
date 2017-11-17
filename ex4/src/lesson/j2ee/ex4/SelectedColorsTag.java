package lesson.j2ee.ex4;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Map;

public class SelectedColorsTag extends SimpleTagSupport
{
    private SelectedColorCounter selectedColorCounter = SelectedColorCounter.getInstance();
    @Override
    public void doTag() throws JspException, IOException
    {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        String outPrint = "";
        outPrint += "<ul>";
        for(Map.Entry<String, Integer> entry : selectedColorCounter.getCounter().entrySet())
        {
            if (entry.getValue() != 0)
            {
                outPrint += "<li>";
                outPrint += entry.getKey();
                outPrint += "&nbsp;";
                outPrint += entry.getValue();
                outPrint += "</li>";
            }
        }
        outPrint += "</ul>";
        out.println(outPrint);
    }
}
