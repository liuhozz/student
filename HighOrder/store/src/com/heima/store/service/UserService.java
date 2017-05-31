package com.heima.store.service;

import java.sql.SQLException;

import com.heima.store.enty.User;

public interface UserService {


	void useregister(User user) throws SQLException;
	boolean chack(String username) throws SQLException;
	boolean activeuser(String code)throws SQLException;
	User login(User user) throws SQLException;
	
	
}
