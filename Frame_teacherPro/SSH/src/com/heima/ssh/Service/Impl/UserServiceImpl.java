package com.heima.ssh.Service.Impl;

import com.heima.ssh.Dao.UserDao;
import com.heima.ssh.Service.UserService;
import com.heima.ssh.enty.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User user2 = userDao.login(user);
		return user2;
	}


	

	
}
