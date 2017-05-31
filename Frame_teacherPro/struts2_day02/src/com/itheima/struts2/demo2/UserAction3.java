package com.itheima.struts2.demo2;

import com.itheima.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 数据封装的方式三：模型驱动-采用模型驱动的方式
 * @author jt
 *
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User>{
	// 模型驱动使用的对象：前提必须手动提供对象的实例
	/*private User user = new User(); // 手动实例化User.
	@Override
	// 模型驱动需要使用的方法:
	public User getModel() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}*/
	
	
	/**
	 * 数据封装的方式三：模型驱动-采用模型驱动的方式
	 * 在jsp中不用ognl表达式 
	 * 在action中要实例化一个对象并提供set/get方法
	 * 并还要实现ModelDriven<T>接口   接口实现的方法里面返回对象
	 * @author jt
	 *
	 */
	
	private User user = new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(user);
		return INPUT;
	}
}
