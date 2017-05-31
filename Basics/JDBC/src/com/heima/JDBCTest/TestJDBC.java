package com.heima.JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import org.junit.Test;

import com.heima.Dao.UserDao;
import com.heima.DaoImp.UserDaoImp;

public class TestJDBC {
	static Connection conn=null;
	static Statement st=null;
	static ResultSet rs=null;
	
	@Test
	public void Testinsert(){
		UserDao dao=new UserDaoImp();
		System.out.println(dao.Insert("124", "1243", 12058, "zhaoli4u"));
	}
	
	@Test
	public void TestDelect(){
		UserDao dao=new UserDaoImp();
		System.out.println(Arrays.toString(dao.Delect(3).toArray()) );
	}
	
	@Test
	public void TestUpdate(){
		UserDao dao=new UserDaoImp();
		System.out.println(dao.Update(5, "name", "kkkkkkkk").toString());
	}
	
	@Test
	public void TestQuery(){
		UserDao dao=new UserDaoImp();
		System.out.println(Arrays.toString(dao.findAll().toArray()) );
	}
}
