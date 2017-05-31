package com.heima.ssh.service.impl;

import com.heima.ssh.dao.UserDao;
import com.heima.ssh.enty.User;
import com.heima.ssh.service.UserService;
import com.heima.ssh.utils.MD5Utils;

public class UserServiceImpl implements UserService {

	

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		return userDao.login(user);
	}
	
	@Override
	public void save(User user) {
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		userDao.save(user);
	}
}
