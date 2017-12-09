package com.archetype.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class End_Tag extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		return Tag.SKIP_PAGE;
	}
}
