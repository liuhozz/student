package com.itheima.struts2.valuestack;

import com.itheima.struts2.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 操作值栈：方式二：调用值栈中的方法实现
 * @author jt
 *
 */
public class ValueStackDemo4 extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// 向值栈中保存数据:
		// 获得值栈对象:
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		// 使用push(Object obj);  set(String key,Object obj);
		User user = new User("赵洪","38");
		// 现在user在栈顶的位置
		
		valueStack.push(user);
		valueStack.set("name", "邓志龙");// 创建一个Map集合，将Map压入到栈中。
		
		return super.execute();
	}
}
