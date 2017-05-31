package com.itheima.struts2.ognl;

import org.junit.Test;

import com.itheima.struts2.domain.User;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

/**
 * OGNL在Java环境下的使用
 * @author jt
 *
 */
public class OgnlDemo1 {

	@Test
	/**
	 * OGNL调用对象的方法:
	 */
	public void demo1() throws OgnlException{
		// 获得context
		OgnlContext context = new OgnlContext();
		// 获得跟对象:
		Object root = context.getRoot();
		// 执行表达式:
		Object obj = Ognl.getValue("'helloworld'.length()", context, root);
		System.out.println(obj);
	}
	
	@Test
	/**
	 * 访问对象的静态方法
	 */
	public void demo2() throws OgnlException{
		// 获得context
		OgnlContext context = new OgnlContext();
		// 获得跟对象:
		Object root = context.getRoot();
		// 执行表达式: @类名@方法名
		Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);
		System.out.println(obj);
	}
	
	@Test
	/**
	 * 访问Root中的数据  不需要加#
	 */
	public void demo3() throws OgnlException{
		// 获得context
		OgnlContext context = new OgnlContext();
		// 执行表达式: 
		User user = new User("aaa","123");
		context.setRoot(user);
		
		// 获得跟对象:
		Object root = context.getRoot();
		
		Object username = Ognl.getValue("username", context, root);
		Object password = Ognl.getValue("password", context, root);
		System.out.println(username+"    "+password);
	}
	
	@Test
	/**
	 * 访问context中的数据  需要加#
	 */
	public void demo4() throws OgnlException{
		// 获得context
		OgnlContext context = new OgnlContext();
		// 获得跟对象:
		Object root = context.getRoot();
		// 向context中存入数据
		context.put("name", "赵洪");
		// 执行表达式: 
		Object obj = Ognl.getValue("#name", context, root);
		System.out.println(obj);
	}
}
