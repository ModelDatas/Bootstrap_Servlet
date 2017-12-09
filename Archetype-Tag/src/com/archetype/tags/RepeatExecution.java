package com.archetype.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class RepeatExecution extends TagSupport {
    private int x = 5;
	
	/** serialVersionUID*/
	private static final long serialVersionUID = 5849561995377053729L;

	@Override
	public int doStartTag() throws JspException {
		
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		 --x;
		 System.out.println(x);
		return x <= 0 ?  IterationTag.SKIP_BODY : IterationTag.EVAL_BODY_AGAIN;
	}
}
