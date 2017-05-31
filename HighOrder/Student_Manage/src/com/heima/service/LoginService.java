package com.heima.service;

import java.sql.SQLException;

import com.heima.enty.User;

public interface LoginService {
	/**
	 * 用户登陆的service
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	User find(String username,String password) throws SQLException;


}
