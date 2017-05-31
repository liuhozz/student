package com.itheima.struts2.demo2;

import java.util.Date;

import com.itheima.struts2.domain.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 数据封装方式一：提供属性的set方法的方式
 * @author jt
 *
 */
public class UserAction1 extends ActionSupport {
	// 提供了对应的属性
	/*private String username;
	private String password;
	private Integer age;
	private Date birthday;
	private Double salary;
	// 提供属性对应的set方法
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String execute() throws Exception {
		// 接收数据:
		System.out.println(username);
		System.out.println(password);
		System.out.println(age);
		System.out.println(birthday);
		System.out.println(salary);
		// 封装数据:
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAge(age);
		user.setBirthday(birthday);
		user.setSalary(salary);
		return NONE;
	}*/
	/**
	 * 数据封装方式一：提供属性的set方法的方式
	 * 首先在action中要私有对象的属性
	 * 并提供set方法
	 * 这样就可以在action中取到值  但是要自己一个个给对象设置属性
	 * @author jt
	 *
	 */
	private String username;
	private String password;
	private Integer age;
	private Date birthday;
	private Double salary;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(username);
		user.setAge(age);
		user.setBirthday(birthday);
		user.setPassword(password);
		user.setSalary(salary);
		System.out.println(user);
		return INPUT;
	}
	
	
}