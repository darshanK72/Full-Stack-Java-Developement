package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport{
	
	public int number;
	
	public void setNumber(int n)
	{
		this.number = n;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try
		{
			JspWriter out = pageContext.getOut();
			out.println("<h1> This is Custom Tag <h1> <br>");
			out.println(this.number*this.number);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return SKIP_BODY;
	}

}
