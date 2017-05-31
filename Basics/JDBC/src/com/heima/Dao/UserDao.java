package com.heima.Dao;

import java.util.List;

import com.heima.enty.User;

public interface UserDao {
	
	List<?> findAll();
	
	User Update(int id , String attname ,String attvalue);
	
	List<?> Delect(int id);
	
	String Insert(String username,String password,int phone,String name);
}
