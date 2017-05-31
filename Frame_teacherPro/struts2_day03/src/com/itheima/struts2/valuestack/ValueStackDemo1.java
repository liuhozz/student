package com.itheima.struts2.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * ValueStack的内部结构：
 * @author jt
 */
public class ValueStackDemo1 extends ActionSupport{

	@SuppressWarnings("unused")
	@Override
	public String execute() throws Exception {
		// 获得值栈：
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		
		return SUCCESS;
	}
}
