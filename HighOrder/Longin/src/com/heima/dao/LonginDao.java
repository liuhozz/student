package com.heima.dao;

import java.sql.SQLException;

import com.heima.enty.User;

public interface LonginDao {

	User find(String username,String password) throws SQLException;
	
	void insert (User user) throws SQLException;
	
	boolean findUser(String username) throws SQLException;
}
