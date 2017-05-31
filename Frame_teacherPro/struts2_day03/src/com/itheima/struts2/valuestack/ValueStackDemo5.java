package com.itheima.struts2.valuestack;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.itheima.struts2.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 获取值栈的数据
 * @author jt
 *
 */
public class ValueStackDemo5 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// 向值栈中保存一个对象：
		User user = new User("aaa","123");
		ActionContext.getContext().getValueStack().push(user);
		// 向值栈中保存一个集合
		List<User> list = new ArrayList<User>();
		list.add(new User("aaa","111"));
		list.add(new User("bbb","222"));
		list.add(new User("ccc","333"));
		ActionContext.getContext().getValueStack().set("list", list);
		
		// 向context中存入数据:
//		ServletActionContext.getRequest().setAttribute("name", "r李兵");
		ServletActionContext.getRequest().getSession().setAttribute("name", "s赵洪");
		ServletActionContext.getServletContext().setAttribute("name", "a邓志龙");
		return super.execute();
	}
}
