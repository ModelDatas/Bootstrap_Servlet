package com.archetype.tags;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Artifact_Ip extends TagSupport {

	/** serialVersionUID*/
	private static final long serialVersionUID = 8646694867369083824L;

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest hsr = (HttpServletRequest) this.pageContext.getRequest();
		String address = hsr.getRemoteAddr();
		JspWriter out = this.pageContext.getOut();
		
		try {
			out.print(address);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		return super.doStartTag();
	}
}
