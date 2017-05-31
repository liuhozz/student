package com.heima.ssh.web.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.heima.ssh.enty.User;
import com.heima.ssh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private UserService userService;
	private User user=new User();
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public String login(){
		User user2 = userService.login(user);
		//ServletActionContext.getRequest().getSession().setAttribute("user", user2);
		if(user2 != null){
			ActionContext.getContext().getSession().put("user", user2);
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public String registUI(){
		return "registUI";
	}
	
	public String regist(){
		if(user != null){
			user.setUser_state("1");
			userService.save(user);
			
		return "saveSuccess";
		}
		return ERROR;
	}

}
