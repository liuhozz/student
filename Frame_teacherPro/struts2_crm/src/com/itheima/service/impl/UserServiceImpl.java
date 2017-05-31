package com.itheima.service.impl;

import javax.servlet.ServletContext;

import org.apache.catalina.core.ApplicationContextFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao user_daoimpl;

	public void setUser_daoimpl(UserDaoImpl user_daoimpl) {
		this.user_daoimpl = user_daoimpl;
	}



	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		//UserDao dao=new UserDaoImpl();
		//return dao.login(user);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ServletContext servletContext=new ApplicationContextFacade(context);
		user_daoimpl= (UserDaoImpl) context.getBean("userdaoimpl");
		
		return user_daoimpl.login(user);
	}
	

}
