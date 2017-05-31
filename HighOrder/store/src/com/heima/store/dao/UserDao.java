package com.heima.store.dao;

import java.sql.SQLException;

import com.heima.store.enty.User;

public interface UserDao {

	void useregister(User user) throws SQLException;
	
	boolean chack(String username) throws SQLException;

	User activeuser(String code) throws SQLException;

	void updateuser(User user) throws SQLException;

	User login(User user) throws SQLException;
	
	
	//void finduser();
}
