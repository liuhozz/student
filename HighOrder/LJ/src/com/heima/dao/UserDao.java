package com.heima.dao;

import java.util.List;

import com.heima.enty.User;

public interface UserDao {
	
	List<?> findAll();	
	
	boolean Update(String usename ,User user);
	
	List<?> Delect(String usename);
	
	boolean Insert(String username,String password,String phone,String name);
}
