package com.itheima.struts2.valuestack;

import com.itheima.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 操作ValueStack:方式一：利用Action本身在值栈中的特性。
 * @author jt
 *
 */
public class ValueStackDemo3 extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		// 向ValueStack中存值
		user = new User("李兵","222");
		return SUCCESS;
	}
}
