package com.heima.ssh.web.action;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.heima.ssh.Service.UserService;
import com.heima.ssh.enty.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public String login(){
		
		User user2 = userService.login(user);
		if(user2 != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user2);
			return SUCCESS;
		}else{
			
			return ERROR;
		}
		
	}
}
