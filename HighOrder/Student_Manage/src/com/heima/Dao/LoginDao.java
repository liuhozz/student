package com.heima.Dao;

import java.sql.SQLException;

import com.heima.enty.User;

public interface LoginDao {
	/**
	 * 用户登陆Dao
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	User find(String username,String password) throws SQLException;

}
