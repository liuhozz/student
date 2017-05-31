package com.itheima.web.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private UserService user_service;

	public void setUser_service(UserServiceImpl user_service) {
		this.user_service = user_service;
	}

	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public String login(){
		/*UserService service=new UserServiceImpl();
		User user2 = service.login(user);*/

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		user_service = (UserService) context.getBean("userserviceimpl");
		User user3 = user_service.login(user);
		//ActionContext				
		//ServletActionContext
		//ServletContext
		if(user3 != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user3);
			return SUCCESS;
		}else{
			this.addActionError("登陆失败");
			return LOGIN;
		}
	}
}
