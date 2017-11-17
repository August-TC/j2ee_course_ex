package lesson.j2ee.ex4;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SelectedColorCntTag extends SimpleTagSupport
{
    private SelectedColorCounter selectedColorCounter = SelectedColorCounter.getInstance();
    private String color;
    @Override
    public void doTag() throws JspException, IOException
    {
        super.doTag();
        selectedColorCounter.setCounter(color);
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
