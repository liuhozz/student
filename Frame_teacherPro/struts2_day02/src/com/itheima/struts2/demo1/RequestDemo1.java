package com.itheima.struts2.demo1;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问Servlet的API方式一：完全解耦合的方式
 * @author jt
 *
 */
public class RequestDemo1 extends ActionSupport{
	
	/*@Override
	public String execute() throws Exception {
		// 一、接收参数：
		// 利用Struts2中的对象ActionContext对象.
		ActionContext context = ActionContext.getContext();
		// 调用ActionContext中的方法。
		// 类似于Map<String,String[]> request.getParameterMap();
		Map<String,Object> map = context.getParameters();
		for (String key : map.keySet()) {
			String[] values = (String[]) map.get(key);
			System.out.println(key+"    "+Arrays.toString(values));
		}
		
		// 二、向域对象中存入数据
		context.put("reqName", "reqValue");// 相当于request.setAttribute();
		context.getSession().put("sessName", "sessValue"); // 相当于session.setAttribute();
		context.getApplication().put("appName", "appValue"); // 相当于application.setAttribute();
		
		return SUCCESS;
	}
	*/
	/**
	 * ActionContext对象只能操作域对象中的数据  只是获得数据而不是获得对象
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext context=ActionContext.getContext();
		Map<String, Object> map = context.getParameters();	//相当于request.getparameterMap();
		for (Entry<String , Object> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"========"+ entry.getValue());
		}
		
		context.put("req", "requ");
		context.getSession().put("sess", "sess");
		context.getApplication().put("app", "app");
		
		return SUCCESS;
	}
	
}
