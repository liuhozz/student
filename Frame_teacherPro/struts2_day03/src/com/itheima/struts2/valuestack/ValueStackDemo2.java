package com.itheima.struts2.valuestack;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 获得ValueStack镀锡
 * 
 * @author jt
 *
 */
public class ValueStackDemo2 extends ActionSupport {

	@Override
	public String execute() throws Exception {

		// 一种：通过ActionContext获得:
		ValueStack valueStack1 = ActionContext.getContext().getValueStack();
		
		// 二种：通过request对象获得：
		ValueStack valueStack2 = (ValueStack) ServletActionContext.getRequest()
				.getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		
		// 一个Action的实例，只会创建一个ValueStack的对象
		System.out.println(valueStack1 == valueStack2);
		return NONE;
	}
}
