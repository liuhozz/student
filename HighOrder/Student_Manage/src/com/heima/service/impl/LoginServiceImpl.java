package com.heima.service.impl;

import java.sql.SQLException;

import com.heima.DaoImpl.LoginDaoImpl;
import com.heima.enty.User;
import com.heima.service.LoginService;

public class LoginServiceImpl implements LoginService {

	/**
	 * 用户登陆service的具体实现
	 */
	@Override
	public User find(String username, String password) throws SQLException {
		
		return new LoginDaoImpl().find(username, password);
	}

}
