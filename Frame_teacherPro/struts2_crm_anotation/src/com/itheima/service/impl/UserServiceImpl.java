package com.itheima.service.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	@Resource(name="UserDaoImpl")
	private UserDao user_daoimpl;

	



	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		//UserDao dao=new UserDaoImpl();
		//return dao.login(user);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ServletContext servletContext=new ApplicationContextFacade(context);
		user_daoimpl= (UserDaoImpl) context.getBean("UserDaoImpl");
		
		return user_daoimpl.login(user);
	}
	

}
