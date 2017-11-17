package lesson.j2ee.ex4;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ClearTag extends SimpleTagSupport
{
    private SelectedColorCounter selectedColorCounter = SelectedColorCounter.getInstance();
    @Override
    public void doTag() throws JspException, IOException
    {
        super.doTag();
        selectedColorCounter.clear();
    }
}
